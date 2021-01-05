package com.yhdatabase.bizportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yhdatabase.bizportal.beans.Content;

@Controller
public class JobSeeker {

	@GetMapping("/jobSeekerRegist")
	public String regist(Model model ) {
	
		
		Content ct = new Content() ;
		ct.setTitle("test_title");
		ct.setSub_title("test_sub_title");
		model.addAttribute("test_val", "test val") ;
		model.addAttribute("content", ct) ;		
		return "jobSeekerRegist" ;
	}
}
