/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import java.util.Map;

/**
 * 描述:  ca_dj_jbxx 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
public interface IPageLoadingService extends BaseService {
 
	Map<String, Object> getCaDjJbxxInfo(String frwybs) throws Exception;
}