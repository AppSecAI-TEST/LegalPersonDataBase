/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.icinfo.frk.business.model.CaCyFddbrValid;

import java.util.Date;

/**
 * 描述:  ca_cy_fddbr_valid 对应的DTO类.<br>
 *
 * @author framework generator
 * @date 2017年06月30日
 */
@JsonIgnoreProperties({"id", "hashUnique", "datakeycontent", "datasrdep", "datasource", "updatetime", "createtime"})
public class CaCyFddbrValidDto extends CaCyFddbrValid {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getRzqsrq() {
        return super.getRzqsrq();
    }

    @Override
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getRzjzrq() {
        return super.getRzjzrq();
    }
}