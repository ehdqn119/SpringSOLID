package com.yhdatabase.bizportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhdatabase.bizportal.mapper.CodeGroupMapper;
import com.yhdatabase.bizportal.vo.CodeGroup;

@Service
public class CodeGroupService {
	
	@Autowired
	private CodeGroupMapper	mapper ;
	
	public List<CodeGroup> getList() {
		return mapper.select() ;
	}
	
	public int insert(CodeGroup codeGroup) {
		return mapper.insert(codeGroup) ;
	}

}
