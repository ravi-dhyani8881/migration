package com.migration.tool.migration;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

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
	public ModelAndView addSchdular(@RequestParam("jobName") String jobName,@RequestParam("dateTime") String dateTime) {
						
			
		Util util=new Util();
		Long diffInSec = util.dateTimeDiff(dateTime);
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.schedule(new PentahoRun(jobName), diffInSec, TimeUnit.SECONDS);
		
		
		return new ModelAndView("addSchdular").addObject("message", jobName);
	}
	
}