/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.dto.DtFrflTjDto;
import com.icinfo.frk.business.mapper.DtFrflTjMapper;
import com.icinfo.frk.business.model.DepData;
import com.icinfo.frk.business.service.IDtFrflTjService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:    dt_frfl_tj 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */
@Service("dtFrflTjService")
public class DtFrflTjServiceImpl extends MyBatisServiceSupport implements IDtFrflTjService {
	@Autowired
	private DtFrflTjMapper dtFrflTjMapper;
	/**
     * 获取法人信息
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	public List<DtFrflTjDto> doGetDtFrflTjDtoList() throws Exception{
		return dtFrflTjMapper.doGetDtFrflTjDtoList();
	}
	
	/**
     * 获取法人分类信息
     *
     * @throws Exception
     * @auther gzs
     * @date 2017年6月22日
     */
	public List<DtFrflTjDto> doGetAllTypeNameAndNum(){
		return dtFrflTjMapper.doGetAllTypeNameAndNum();
	}
	

	
	/**
     * 获取piejsonobject
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	public JSONObject doGetPiesJosnObject() throws Exception{
		List<DtFrflTjDto> dtFrflTjDtoList = doGetDtFrflTjDtoList();
		JSONObject object = new JSONObject();
		JSONArray array1 = new JSONArray();
	    JSONArray array2 = new JSONArray();
        for(DtFrflTjDto dto:dtFrflTjDtoList){
        	JSONObject obj1 = new JSONObject();
        	JSONObject obj2 = new JSONObject();
        	if("1".equals(dto.getFrflLb())){//企业类型总体分布
        		obj1.put("name", dto.getFrflDesc());
        		obj1.put("value", dto.getFrflSl());
        		array1.add(obj1);
        	}else{
        		obj2.put("name", dto.getFrflDesc());
        		obj2.put("value", dto.getFrflSl());
        		array2.add(obj2);
        	}
        }
	      object.put("pie1", array1);
	      object.put("pie2", array2);
	    return object;
	}


	
	/**
     * 获取法人分类与对应数量
     *
     * @throws Exception
     * @auther gzs
     * @date 2017年6月22日
     */

	public JSONObject doGetAllTypeNameAndNumJosnObject() throws Exception{
		List<DtFrflTjDto> dtFrflTjDtoList = doGetAllTypeNameAndNum();
		JSONObject object = new JSONObject();
		JSONArray array1 = new JSONArray();
        for(DtFrflTjDto dto:dtFrflTjDtoList){
        	JSONObject obj1 = new JSONObject();
        	obj1.put("name", dto.getTypeName());
        	obj1.put("value", dto.getFrflSl());
        	array1.add(obj1);
        }
	      object.put("pie1", array1);
	    return object;	
	}
	
	

	@Override
    public List<DepData> doGetAllDepExchangeCountingList(Map<String, Object> paraMap) throws Exception {
        return dtFrflTjMapper.doGetAllDepExchangeCountingList(paraMap);
    }

    public List<DtFrflTjDto> doGetDimTotal() throws Exception{
    	return dtFrflTjMapper.doGetDimTotal();
    }
    
    public DepData doGetExchangeSum() throws Exception{
    	DepData dto = new DepData();
    	dto = dtFrflTjMapper.doGetExchangeSum();
    	return dto;
    }
    
    public DtFrflTjDto doGetLegalPersonCount() throws Exception{
    	return dtFrflTjMapper.doGetLegalPersonSum();
    }

}