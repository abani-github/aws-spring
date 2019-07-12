package edu.abani.aws.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apis")
public class EnvController {

	@Value("${location:INDIA}")
	private String location;
	
	@GetMapping("/location")
	public String getLocation() {
		return location;
	}
	
}
