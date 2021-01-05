package com.yhdatabase.bizportal.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yhdatabase.bizportal.beans.Content;
import com.yhdatabase.bizportal.service.CodeGroupService;
import com.yhdatabase.bizportal.vo.CodeGroup;

@Controller
public class CodeCtl {
	@Autowired 
	CodeGroupService service ;
	
	@GetMapping("/listCodeGroup")
	public String listCodeGroup(Model model ) {
		Content ct = new Content() ;
		ct.setTitle("코드 그룹 관리");
		ct.setSub_title("코드 그룹 관리");
		model.addAttribute("content", ct) ;		

		return "codeGroupList" ;
	}
	
	@ResponseBody
	@RequestMapping("/insertCodeGroup")
	public String insertCodeGroup( CodeGroup codeGroup) {
		JSONObject retVal = new JSONObject() ;
		
		int insCount = service.insert(codeGroup) ;
		if(insCount == 1) {
			retVal.put("result", 1) ;
			retVal.put("msg", "success") ;
		}else {
			retVal.put("result", -1) ;
			retVal.put("msg", "Data is null") ;
		}
		return retVal.toJSONString() ; //return json type result 
	}
}
