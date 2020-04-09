package com.microservices.ratingservice.controller;


import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.ratingservice.config.RatingConfig;
import com.microservices.ratingservice.vo.Ratings;

@RestController
public class RatingServiceController {
	
	@Autowired
	private RatingConfig ratingConfig;
	
	
	@GetMapping("/ratings")
	public Ratings getRatingDetails() {
		
		//Assigning arandom rating
		double random = ThreadLocalRandom.current().nextDouble(ratingConfig.getMinimum(),ratingConfig.getMaximum());
		Ratings rating= new Ratings(random);
		
		
		
		return rating;
		
	}

}
