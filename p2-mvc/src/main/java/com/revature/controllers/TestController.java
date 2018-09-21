package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class TestController {

	@GetMapping(value="/")
	@ResponseBody
	public String myHome() {
		return "home - testing";
	}
	
	@GetMapping(value="/test")
	@ResponseBody
	public String myTest() {
		return "test";
	}
	
}
