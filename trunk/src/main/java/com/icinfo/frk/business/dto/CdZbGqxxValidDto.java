/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.dto;

import com.icinfo.frk.business.model.CdZbGqxxValid;

/**
 * 描述:  cd_zb_gqxx_valid 对应的DTO类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
public class CdZbGqxxValidDto extends CdZbGqxxValid {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 投资人
     */
    private String tzr;

    public String getTzr() {
        return tzr;
    }

    public void setTzr(String tzr) {
        this.tzr = tzr;
    }
}