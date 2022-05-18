package ecommerceapp.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMessage {
	@GetMapping(value = "/showmessge") // "/showmessge" is called the endpoint or uri
	String Message() {
		return "hi how are you";

	}

	

}
