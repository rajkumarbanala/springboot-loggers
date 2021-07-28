package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rajkumar Banala 19-Feb-2021
 *
 */

@RestController
@RequestMapping("/users")
public class UserController {

	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

	@GetMapping("/test")
	String test() {
		LOG.info("test().info");
		LOG.debug("test().debug");
		LOG.error("test().error");

		return "Success";
	}
}
