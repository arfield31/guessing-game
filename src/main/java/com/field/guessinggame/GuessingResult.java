package com.field.guessinggame;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
@Table
public class GuessingResult implements Comparable<GuessingResult> {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private int numGuesses;

    public GuessingResult(int id, String name, int numGuesses) {
        this.id = id;
        this.name = name;
        this.numGuesses = numGuesses;
    }

    public GuessingResult() {

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumGuesses() {
        return numGuesses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumGuesses(int numGuesses) {
        this.numGuesses = numGuesses;
    }

    public void setId(int id) {this.id = id;}

    @Override
    public String toString() {
        return "GuessingResult{" +
                "name='" + name + '\'' +
                ", numGuesses=" + numGuesses +
                '}';
    }
    @Override
    public int compareTo(GuessingResult b){
        if(this.numGuesses>b.numGuesses){
            return 1;
        }else if(this.numGuesses<b.numGuesses){
            return -1;
        }else{
            return 0;
        }
    }
}
