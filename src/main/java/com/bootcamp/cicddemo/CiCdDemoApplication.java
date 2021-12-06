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
		return "<body style=\"background-image:url('https://i.pinimg.com/originals/92/90/50/9290509b91c6a9517f83e204802a2aa2.gif');\"><div style=\"width:700;height:500;position:absolute;margin:auto;top:0;left:0;bottom:0;right:0;\">" +
				"<video id=\"vid\" autoplay controls muted playsinline onload=\"toggleMute()\"> " +
				"<source src=\"https://drive.google.com/u/1/uc?id=1Ti05_eOSGIzLkECjEjfIbiXWnMNBdIeA&export=download\" type=\"video/mp4\"> " +
				"</video></div></body>" +
				"<script> function toggleMute() {" +
				"var video = document.getElementById(\"vid\") " +
				"setTimeout(function () {" +
				"if(video.muted){" +
				" video.muted = false;" +
				"}}, 5000);" +
				"}</script>";

	}
}