package com.deloitte;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	/*@RequestMapping("/apple")
	public String first() {
		return "ball";
	}*/
	@RequestMapping("/doSome")
	public ModelAndView someMethod()
	{
		ModelAndView view = new ModelAndView();
		view.addObject("message","We will be leaving early today");
		view.setViewName("sayHello");
		return view;
	}

	

}
