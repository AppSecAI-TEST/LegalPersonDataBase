/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.dto;

import com.icinfo.frk.business.model.DtFrflTj;

/**
 * 描述:    dt_frfl_tj 对应的DTO类.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */
public class DtFrflTjDto extends DtFrflTj {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int frflSl;
	private String TypeName;
	private String DepName;
	private int ExchangeNum;
	private int MatchingNum;
	private int DimTotal;
	private int LegalPersonSum;
	private int LegalPersonAdd;
	private int LegalPersonSub;
	private int wd_mc;
	
	public Integer getFrflsl(){
		return frflSl;
	}
	
	public void setFrflsl(int frflsl){
		this.frflSl = frflsl;
	}
	
	public Integer getDimTotal(){
		return DimTotal;
	}
	
	public void setDimTotal(Integer DimTotal){
		this.DimTotal = DimTotal;
	}
	
	public Integer getwd_mc(){
		return wd_mc;
	}
	
	public void setwd_mc(Integer wd_mc){
		this.wd_mc = wd_mc;
	}
	
	public String getTypeName(){
		return TypeName;
	}
	
	public void setTypeName(String TypeName){
		this.TypeName = TypeName;
	}
	
	public Integer getLegalPersonSum(){
		return LegalPersonSum;
	}
	
	public void setLegalPersonSum(int LegalPersonSum){
		this.LegalPersonSum = LegalPersonSum;
	}
	
	
	
	public String getDepName(){
		return DepName;
	}
	
	public void setDepName(String DepName){
		this.DepName = DepName;
	}
	
	public Integer getExchangeNum(){
		return ExchangeNum;
	}
	
	public void setExchangeNum(int ExchangeNum){
		this.ExchangeNum = ExchangeNum;
	}

	
	public Integer getMatchingNum(){
		return MatchingNum;
	}
	
	public void setMatchingNum(int MatchingNum){
		this.MatchingNum = MatchingNum;
	}
	
	public Integer getLegalPersonAdd(){
		return LegalPersonAdd;
	}
	
	public void setLegalPersonAdd(int LegalPersonAdd){
		this.LegalPersonAdd = LegalPersonAdd;
	}
	
	public Integer getLegalPersonSub(){
		return LegalPersonSub;
	}
	
	public void setLegalPersonSub(int LegalPersonSub){
		this.LegalPersonSub = LegalPersonSub;
	}
}