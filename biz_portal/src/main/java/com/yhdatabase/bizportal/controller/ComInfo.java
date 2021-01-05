package com.yhdatabase.bizportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yhdatabase.bizportal.beans.Content;

@Controller
public class ComInfo {

	@GetMapping("/cominfo_list") 
	public String list(Model model, @RequestParam(value="page") long idx) {
		
//		ComInfo ci = service.select(idx) ;
//		Content ct = new Content() ;
//		ct.setTitle("test_title");
//		ct.setSub_title("test_sub_title");
//		model.addAttribute("test_val", "test val") ;
//		model.addAttribute("com_info", ci ) ;
//		model.addAttribute("content", ct) ;		
		return "test" ;
	}
	

}
