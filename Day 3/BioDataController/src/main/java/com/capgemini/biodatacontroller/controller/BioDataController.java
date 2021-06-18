package com.capgemini.biodatacontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BioDataController {

String name = "Shrijit";
String mobNo = "9831558015";
String email = "shrijit@gmail.com";
	
	@RequestMapping("/name")
	public ModelAndView showName() {
		System.out.println("In BioData Controller");
		ModelAndView mv=new ModelAndView("biodata");
		mv.addObject("name",name);
		return mv;
	}
	
	@RequestMapping("/mobileno")
	public ModelAndView showMobileNumber() {
		System.out.println("In BioData Controller");
		ModelAndView mv=new ModelAndView("biodata");
		mv.addObject("mobNo",mobNo);
		return mv;
	}
	
	@RequestMapping("/email")
	public ModelAndView showEmail() {
		System.out.println("In BioData Controller");
		ModelAndView mv=new ModelAndView("biodata");
		mv.addObject("email",email);
		return mv;
	}
	
	@RequestMapping("/biodata")
	public ModelAndView showData() {
		System.out.println("In BioData Controller");
		ModelAndView mv=new ModelAndView("biodata");
		mv.addObject("name",name);
		mv.addObject("mobNo",mobNo);
		mv.addObject("email",email);
		return mv;
	}
}
