package com.equipo.pamplona.helloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplication {

public static void main(String[] args) {
	SpringApplication.run(DemoApplication.class, args);
	}	

	@GetMapping("/")
	public String hello() {
		return "Vaya a /hello y agregue su nombre como /hello?name= -NAME- jaja salu2 por parte del equipo pamplona";
	}
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
