package com.icinfo.frk.business.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "frk.ca_code_industry")
public class CaCodeIndustry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "hz_code")
	private String hzCode;

	@Column(name = "hy_content")
	private String hyContent;
	
	@Column(name = "hy_supcode")
	private String hySupcode;

	public String getHzCode() {
		return hzCode;
	}

	public void setHzCode(String hzCode) {
		this.hzCode = hzCode;
	}

	public String getHyContent() {
		return hyContent;
	}

	public void setHyContent(String hyContent) {
		this.hyContent = hyContent;
	}

	public String getHySupcode() {
		return hySupcode;
	}

	public void setHySupcode(String hySupcode) {
		this.hySupcode = hySupcode;
	}

}
