package com.microservices.ratingservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "rating-service")
public class RatingConfig {

	private long maximum;
	
	private long minimum;

	public long getMaximum() {
		return maximum;
	}

	public void setMaximum(long maximum) {
		this.maximum = maximum;
	}

	public long getMinimum() {
		return minimum;
	}

	public void setMinimum(long minimum) {
		this.minimum = minimum;
	}
	
	
	
}
