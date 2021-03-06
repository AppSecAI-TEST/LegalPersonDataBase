/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.dto.DtFrxzTjDto;
import com.icinfo.frk.business.mapper.DtFrxzTjMapper;
import com.icinfo.frk.business.service.IDtFrxzTjService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:    dt_frxz_tj 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */
@Service("dtFrxzTjService")
public class DtFrxzTjServiceImpl extends MyBatisServiceSupport implements IDtFrxzTjService {
	@Autowired
	private DtFrxzTjMapper dtFrxzTjMapper;
	/**
     * 获取法人信息
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	public List<DtFrxzTjDto> doGetDtFrxzTjDtoList() throws Exception{
		return dtFrxzTjMapper.doGetDtFrxzTjDtoList();
	}
	
	/**
     * 获取jsonarray
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	public JSONArray doGetFrxzJsonArray() throws Exception{
		List<DtFrxzTjDto> dtFrxzTjDtoList = doGetDtFrxzTjDtoList();
		JSONArray array3 = new JSONArray();
		   for(DtFrxzTjDto dto:dtFrxzTjDtoList){
	        	JSONArray array4 = new JSONArray();
	        	array4.add(dto.getXztjRqForWeek());
	        	array4.add(dto.getXztjSl());
	        	array3.add(array4);
	        }
		   return array3;
	}
}