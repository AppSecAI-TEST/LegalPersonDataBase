/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.dto.DtFrxzTjDto;

/**
 * 描述:    dt_frxz_tj 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */

public interface IDtFrxzTjService extends BaseService {

	/**
     * 获取法人信息
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */

	List<DtFrxzTjDto> doGetDtFrxzTjDtoList() throws Exception;
	/**
     * 获取jsonarray
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	JSONArray doGetFrxzJsonArray() throws Exception;
	
	
}