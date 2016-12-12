package com.cowriter.app.common.config;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.PropertyConfigurator;

public class CoConfiguration extends CompositeConfiguration {

	public CoConfiguration() {

		try {
			URL url = CoConfiguration.class.getClassLoader().getResource("app.properties");
			addConfiguration(new PropertiesConfiguration(url));
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
		
		try {
			Properties props = new Properties();
			InputStream is = CoConfiguration.class.getClassLoader().getResourceAsStream("log4j.properties");
			props.load(is);
			 if(props != null) {
		        	PropertyConfigurator.configure(props);
		        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
