package com.field.guessinggame.repository;

import com.field.guessinggame.model.GuessingResult;
import org.springframework.data.repository.CrudRepository;

public interface GuessingRepository extends CrudRepository<GuessingResult, Integer>
{

    //@Query("select g from GuessingResult g where g.outcome = 'solved' order by k.numTries, k.timeMillis")
    //public List<KordleResult> getLeaderboard();
}  