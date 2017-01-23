package com.example.helloworld;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

import com.example.helloworld.configuration.TestdropwizardConfiguration;
import com.example.helloworld.resource.TestdropwizardResource;

public class TestdropwizardApplication extends
		Application<TestdropwizardConfiguration> {

	public static void main(String args[]) throws Exception {
		new TestdropwizardApplication().run(args);
	}

	public void run(TestdropwizardConfiguration promotionManagerConfiguration,
			Environment environment) throws Exception {
		final TestdropwizardResource promotionManagerResource = new TestdropwizardResource();

		environment.jersey().register(promotionManagerResource);
	}
}
