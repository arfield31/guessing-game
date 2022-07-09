package com.field.guessinggame.controller;

import com.field.guessinggame.model.GuessingResult;
import com.field.guessinggame.service.GuessingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class GuessingController {

    private static Logger logger = Logger.getLogger("Field.guessing");

    @Autowired
    GuessingService guessingServiceService;

    @GetMapping("/result")
    private List<GuessingResult> getAllResult(){
        logger.info("Inside Controller.getAllResult()");
        return guessingServiceService.getAllResult();
    }

    @PostMapping("/result")
    private String saveResult(@RequestBody GuessingResult result){
        logger.info(result.toString());
        guessingServiceService.saveOrUpdate(result);
        return result.getName() + " " + result.getNumGuesses();
    }

    @GetMapping("/leaderboard")
    private List<GuessingResult> leaderboard() {
        logger.info("Inside leaderboard");
        List<GuessingResult> gr = guessingServiceService.getLeaderboard();
        logger.info("past getallresult");
        Collections.sort(gr);
        return gr;
    }
}