package com.field.guessinggame;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GuessingRepository extends CrudRepository<GuessingResult, Integer>
{

    //@Query("select g from GuessingResult g where g.outcome = 'solved' order by k.numTries, k.timeMillis")
    //public List<KordleResult> getLeaderboard();
}  