package com.example.qaspringbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestQaspringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(QaspringbootdemoApplication::main).with(TestQaspringbootdemoApplication.class).run(args);
	}

}
