package com.cowriter.app.service;

import org.apache.commons.configuration.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class TestService {

	Logger logger = LoggerFactory.getLogger(TestService.class);
	
	@Inject
	public TestService(Configuration config) {
		//System.out.println(config.getString("aaa"));
		logger.debug(config.getString("aaa"));
	}
}
