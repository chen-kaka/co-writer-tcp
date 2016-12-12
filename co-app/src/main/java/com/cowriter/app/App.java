package com.cowriter.app;

import java.util.ArrayList;
import java.util.List;

import com.cowriter.app.common.module.ConfigModule;
import com.cowriter.app.service.TestService;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class App {

	public static void main(String[] args) {
		List<Module> modules = new ArrayList<Module>();
		modules.add(new ConfigModule());
		Injector inject = Guice.createInjector(modules);
		TestService service = inject.getInstance(TestService.class);
	}
}
