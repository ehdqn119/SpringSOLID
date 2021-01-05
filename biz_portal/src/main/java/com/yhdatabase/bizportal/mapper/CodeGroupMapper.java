package com.yhdatabase.bizportal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yhdatabase.bizportal.vo.CodeGroup;

@Mapper
public interface CodeGroupMapper {
	List<CodeGroup> select() ;
	int	insert(CodeGroup codeGroup) ;
}
