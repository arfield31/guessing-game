package com.field.guessinggame.service;

import com.field.guessinggame.model.GuessingResult;
import com.field.guessinggame.repository.GuessingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class GuessingService {

    @Autowired
    GuessingRepository repository;

    private static Logger logger = Logger.getLogger("Field.guessing");
    private static List<GuessingResult> results = new ArrayList<GuessingResult>(10);
    public List<GuessingResult> getAllResult() {
        logger.info("inside Service.getAllResult()");
        return results;
    }
    public void saveOrUpdate(GuessingResult result) {
        repository.save(result);


        //results.add(result);
    }
    public List<GuessingResult> getLeaderboard(){
        repository.findAll().forEach(result -> results.add(result));
        return results;
    }


}