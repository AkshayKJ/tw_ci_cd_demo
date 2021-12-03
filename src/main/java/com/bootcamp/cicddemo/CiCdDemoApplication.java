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
		return "<div style=\"width:700;height:500;position:absolute;margin:auto;top:0;left:0;bottom:0;right:0;\">" +
				"<iframe src=\"https://drive.google.com/file/d/1Ti05_eOSGIzLkECjEjfIbiXWnMNBdIeA/preview\" " +
				"width=\"640\" height=\"480\" allow=\"autoplay\"></iframe></div>";
	}
}