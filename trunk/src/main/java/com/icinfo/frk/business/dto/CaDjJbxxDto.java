/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.dto;


import com.icinfo.frk.business.model.CaDjJbxx;

/**
 * 描述:  ca_dj_jbxx 对应的DTO类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
public class CaDjJbxxDto extends CaDjJbxx {
		//代码对应法人类型
	    private String fr_content;
		
		//代码对应行业
	    private String hy_content;
		
		//代码对应机关
	    private String jg_content;
	    
	    //开始时间
	    private String startTime;
	    
	    //结束时间
	    private String endTime;
	    
	    //登记注册号
	    private String djzch;
	      

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

		public String getStartTime() {
			return startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getDjzch() {
			return djzch;
		}

		public void setDjzch(String djzch) {
			this.djzch = djzch;
		}
}