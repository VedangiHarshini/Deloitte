package com.deloitte;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

	@RequestMapping("/addcustomer")
	public String first() {
		return "addcust";
	}
	@RequestMapping("/updatecustomer")
	public String first1() {
		return "updatecust";
	}
	@RequestMapping("/deletecustomer")
	public String first2() {
		return "deletecust";
	}
	
	@RequestMapping("/findcustomerbyid")
	public String first3() {
		return "findcustbyid";
	}
	@RequestMapping("/findallcustomer")
	public String first4() {
		return "findallcust";
	}
	

}
