package com.yhdatabase.bizportal.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.yhdatabase.bizportal.vo.ComInfo;

@Mapper
public interface ComInfoMapper {
	ComInfo	select(long idx ) ; 
}
