package com.bootcamp.cicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CiCdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdDemoApplication.class, args);
	}

	@GetMapping("/")
	public String homepage() {
		return "<div style=\"position:absolute;margin:auto;\">" +
				"<iframe width=\"420\" height=\"315\" src=\"https://drive.google.com/file/d/1Ti05_eOSGIzLkECjEjfIbiXWnMNBdIeA/preview?autoplay=1\">" +
				"</iframe> </div>";
	}
}