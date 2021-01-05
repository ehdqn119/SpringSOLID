package com.yhdatabase.bizportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yhdatabase.bizportal.beans.Content;
import com.yhdatabase.bizportal.service.ComInfoService;
import com.yhdatabase.bizportal.vo.ComInfo;

@Controller
public class Test {
	
	@Autowired
	private ComInfoService	service ;
	
	
	@GetMapping("/test")
	public String test(Model model, @RequestParam("idx") long idx) {
	
		ComInfo ci = service.select(idx) ;
		Content ct = new Content() ;
		ct.setTitle("test_title");
		ct.setSub_title("test_sub_title");
		model.addAttribute("test_val", "test val") ;
		model.addAttribute("com_info", ci ) ;
		model.addAttribute("content", ct) ;		
		return "test" ;
	}
	
	@GetMapping("/test/{idx}")
	public String test2(Model model, @PathVariable("idx") long idx) {
		ComInfo ci = service.select(idx) ;
		Content ct = new Content() ;
		ct.setTitle("test_title");
		ct.setSub_title("test_sub_title");
		model.addAttribute("test_val", "test val") ;
		model.addAttribute("com_info", ci ) ;
		model.addAttribute("content", ct) ;		
		return "test" ;
	}
	
}
