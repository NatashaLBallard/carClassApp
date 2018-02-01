package com.carclassapp.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping ("/")
	public String homePage(){

		vehicle Jeep = new vehicle(); //sets initial parameters; does not need return statements
		vehicle MBenz = new vehicle("");

		return "index";
	}

}




















}
