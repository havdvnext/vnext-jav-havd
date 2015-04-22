package com.vnext.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = {"/","/wellcome"}, method = RequestMethod.GET)
	public ModelAndView wellcomePage() {
		
		ModelAndView model = new ModelAndView();
		model.addObject("title","Spring Security Wellcome");
		model.addObject("message","This is wellcome page");
		
		model.setViewName("home");
		
		return model;
	}
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		
		ModelAndView model = new ModelAndView();
		model.addObject("title","Spring Security Wellcome");
		model.addObject("message","This is admin page");
		
		model.setViewName("admin");
		
		return model;
	}
	
	@RequestMapping(value = "/adminprofile", method = RequestMethod.GET)
	public ModelAndView adminProfiel() {
		
		ModelAndView model = new ModelAndView();
		model.addObject("title","Spring Security Wellcome");
		model.addObject("message","This is admin page");
		
		model.setViewName("admin_profile");
		
		return model;
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView user() {
		
		ModelAndView model = new ModelAndView();
		model.addObject("title","Spring Security Wellcome");
		model.addObject("message","This is user page");
		
		model.setViewName("user");
		
		return model;
	}
	
}
