/*
 *  Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.system.dto;

import com.icinfo.frk.system.model.SysPermision;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 描述:  系统权限DTO.<br>
 *
 * @author xiajunwei
 * @date 2016年05月26日
 */
public class SysPermisionDto extends SysPermision {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank
    @Override
    public String getName() {
        return super.getName();
    }

    @NotBlank
    @Override
    public String getUrl() {
        return super.getUrl();
    }
}
