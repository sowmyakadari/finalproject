package com.trialproject.Mvnsel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMvnselApplication {

	public static void main(String[] args) {
		SpringApplication.from(MvnselApplication::main).with(TestMvnselApplication.class).run(args);
	}

}
