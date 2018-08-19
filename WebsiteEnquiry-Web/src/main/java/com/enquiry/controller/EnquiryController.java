package com.enquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.enquiry.model.UsersQueries;
import com.enquiry.service.EnquiryService;
import com.enquiry.validator.EnquiryValidator;


@Controller
public class EnquiryController 
{
	@Autowired
	private EnquiryService enquiryService;
	
	@Autowired
	private EnquiryValidator ev;
	
	/**
	 * this method show the first page of application i.e.enquiry.jsp
	 * return String 
	 * */
	@RequestMapping(value = "/showPage" ,method=RequestMethod.GET)  
	public String showHomePage(Model model)
	{
		model.addAttribute("UsersQueries",new UsersQueries());
		return "enquiry"; 
	}

	/**
	 * this method is validate all the fields are proper fullfill or not.
	 * and communicate to service layer 
	 * return String 
	 * */
	@RequestMapping(value = "/submitQueries" ,method = RequestMethod.POST)  
	public String saveEnquiry(@RequestParam String action, @ModelAttribute("UsersQueries") UsersQueries usersQueries ,BindingResult result ,Model model){
	 
		ev.validate(usersQueries, result);
		if(result.hasErrors()){
			return "enquiry";
		}
		if (action.equals("Submit")) {
			enquiryService.saveEnquiry(usersQueries);
			return "enquiry";
		}
		return "enquiry";
		
	}
}
