package com.migration.tool.migration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	
	@RequestMapping(value="/" , method= RequestMethod.GET)
	public ModelAndView home() {
						
		return new ModelAndView("home");
	}
	
	
	@RequestMapping(value="/Schdular" , method= RequestMethod.GET )
	public ModelAndView addSchdular(@RequestParam("sname") String username,@RequestParam("selected_date") String username2,@RequestParam("selected_date") String format) {
						
		System.out.println("Added Schdular"+username+"----->username2"+username2+"------->format"+format);
		
		return new ModelAndView("addSchdular").addObject("message", username);
	}

	
	@RequestMapping(value="/api" , method= RequestMethod.GET )
	public String restController() {
						
		
		return "Hello";
	}
	
}


