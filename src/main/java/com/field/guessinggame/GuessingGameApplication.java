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
 *    Module:         GuessingApplication.java
 *    Description:    main Spring Boot application
 */

package com.field.guessinggame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GuessingGameApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuessingGameApplication.class, args);
	}

}
