package com.fngeno.redisDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication(scanBasePackages = {"com.fngeno.redisDemo"})
public class RedisDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(RedisDemoApplication.class, args);
	}

}
