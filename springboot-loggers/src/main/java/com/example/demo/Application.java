package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		LOG.debug("main()");
		System.out.println("main()");
		System.err.println("main()");

		SpringApplication.run(Application.class, args);

		LOG.info("main().info");
		LOG.debug("main().debug");
		LOG.error("main().error");
	}
}
