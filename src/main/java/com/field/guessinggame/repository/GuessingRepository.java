/*
 *    Proprietary and Confidential
 *
 *    This source code is the property of:
 *
 *    Andrew Field
 *
 *    http://www.github.com/arfield31
 *
 *    Author:         Andrew Field, arfield31@gmail.com
 *    Modified by:
 *    Module:         GuessingRepository.java
 *    Description:    handles interactions with the database
 */

package com.field.guessinggame.repository;

import com.field.guessinggame.model.GuessingResult;
import org.springframework.data.repository.CrudRepository;

public interface GuessingRepository extends CrudRepository<GuessingResult, Integer>
{

}  