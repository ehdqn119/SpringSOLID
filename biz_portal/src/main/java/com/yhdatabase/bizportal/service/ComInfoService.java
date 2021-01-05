package com.yhdatabase.bizportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yhdatabase.bizportal.mapper.ComInfoMapper;
import com.yhdatabase.bizportal.vo.ComInfo;

@Service
public class ComInfoService {
	
	@Autowired
	private	ComInfoMapper	mapper ;
	
	public ComInfo select(long idx) {
		return mapper.select(idx) ;
	}
}
