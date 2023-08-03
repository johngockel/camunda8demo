package de.johngockel.camunda8demo;

import io.camunda.zeebe.spring.client.EnableZeebeClient;
import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableZeebeClient
@Deployment(resources = "classpath*:/bpmn/**/*.bpmn")
public class Camunda8DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(Camunda8DemoApplication.class, args);
	}

}
