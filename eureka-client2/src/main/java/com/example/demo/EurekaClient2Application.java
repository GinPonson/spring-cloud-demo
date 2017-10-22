package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class EurekaClient2Application {
	@Value("${server.port}")
	int port;

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient2Application.class, args);
	}

	@GetMapping(value = "/hi")
	public String hello(HttpServletRequest request) {
		return "hello," + port;
	}
}
