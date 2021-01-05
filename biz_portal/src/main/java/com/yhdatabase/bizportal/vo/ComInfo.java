package com.yhdatabase.bizportal.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Data;


@Data
@Alias("com_info")
public class ComInfo {
	
	long	idx ;
	String	name_kr ;
	String	name_eng ;
	String	biz_num ;
	String	address ;
	String	ceo_name ;
	String	url ;
	String	tel ;
	String	fax ;
	String	ceo_mobile ;
	String	ceo_email ;

	String	intro ;
	String	terrytory ;
	Date	reg_date ;
	Date	last_update ;
	
}
