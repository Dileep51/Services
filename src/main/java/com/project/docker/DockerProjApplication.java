package com.project.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerProjApplication.class, args);
	}
	@GetMapping("/hello")
	public String hello() {
		return "old helloe docker";
	}

}
