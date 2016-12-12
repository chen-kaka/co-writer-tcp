package com.cowriter.app.common.module;

import org.apache.commons.configuration.Configuration;

import com.cowriter.app.common.config.CoConfiguration;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class ConfigModule extends AbstractModule {

	@Override
	protected void configure() {
		System.out.println("ConfigModule");
		bind(Configuration.class).to(CoConfiguration.class).in(Scopes.SINGLETON);;
	}

}
