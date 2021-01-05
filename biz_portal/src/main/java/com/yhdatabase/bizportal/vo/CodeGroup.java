package com.yhdatabase.bizportal.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("code_group")
public class CodeGroup {
	String	group_code ;
	String	group_name ;
	String	group_memo ;
	Date	reg_date ;
	boolean	b_system ;

}
