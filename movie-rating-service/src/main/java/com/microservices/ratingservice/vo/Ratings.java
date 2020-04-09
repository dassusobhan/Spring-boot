package com.microservices.ratingservice.vo;

import java.io.Serializable;

public class Ratings implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1752556696831420256L;

	private double rating;

	private String hits;

	public Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ratings(double rating) {
		super();
		this.rating = rating;
		this.hits =setHits(rating);
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getHits() {
		return hits;
	}

	
		public String setHits(double rate) {
			String hits="";
			
			if(rate<3)
				hits="Super-Flop";
			
			else if(rate>=3&&rate<=5)
				hits="Flop";	
			
			else if(rate>5&&rate<=7)
				hits="Hit";
			
			else
				hits="Super-Hit";
			
			this.hits = hits;
			
			return  hits;
	}
	
	
}
