/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.dto;
import com.icinfo.frk.search.model.BasicInfo;

/**
 * 描述:  ca_dj_jbxx 对应的DTO类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
public class AdmissionInfoDto extends BasicInfo {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6880714972118502279L;

	//代码对应行业
    private String hy_content;
    
    private String xlmc;
    
    private String zzmc;
    
    
    /**
     * @return 
     */
    public String getHy_content() {
        return hy_content;
    }

    /**
     * @param 
     */
    public void setHy_content(String hy_content) {
        this.hy_content = hy_content;
    }
    
    /**
     * @return 
     */
    public String getxlmc() {
        return xlmc;
    }

    /**
     * @param 
     */
    public void setxlmc(String xlmc) {
        this.xlmc = xlmc;
    }
    
    /**
     * @return 
     */
    public String getzzmc() {
        return zzmc;
    }

    /**
     * @param 
     */
    public void setzzmc(String zzmc) {
        this.zzmc = zzmc;
    }
}