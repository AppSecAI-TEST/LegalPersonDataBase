/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;
import javax.persistence.Column;
import java.io.Serializable;

/**
 * 描述:  用于返回代码对应类型.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年07月11日
 */

public class Status implements Serializable {
    
	//代码对应法人类型
	@Column(name = "fr_content")
    private String fr_content;
	
	//代码对应行业
	@Column(name = "hy_content")
    private String hy_content;
	
	//代码对应机关
	@Column(name = "jg_content")
    private String jg_content;


  

    private static final long serialVersionUID = 1L;

    /**
     * @return 
     */
    public String getFr_content() {
        return fr_content;
    }

    /**
     * @param 
     */
    public void setfr_content(String fr_content) {
        this.fr_content = fr_content;
    }

    
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
    public String getJg_content() {
        return jg_content;
    }

    /**
     * @param 
     */
    public void setJg_content(String jg_content) {
        this.jg_content = jg_content;
    }
  
}