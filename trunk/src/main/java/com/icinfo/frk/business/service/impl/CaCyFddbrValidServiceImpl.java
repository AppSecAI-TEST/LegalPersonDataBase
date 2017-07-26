/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.frk.business.mapper.CaCyFddbrValidMapper;
import com.icinfo.frk.business.model.CaCyFddbrValid;
import com.icinfo.frk.business.service.ICaCyFddbrValidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 描述:  ca_cy_fddbr_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年06月30日
 */
@Service
public class CaCyFddbrValidServiceImpl extends MyBatisServiceSupport implements ICaCyFddbrValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CaCyFddbrValidServiceImpl.class);

    @Autowired
    private CaCyFddbrValidMapper caCyFddbrValidMapper;

    /**
     * 获取法定代表人信息
     *
     * @param map 参数map
     * @return 法定代表人信息列表
     */
    @Override
    public List<CaCyFddbrValid> getList(Map<String, Object> map) {
        return caCyFddbrValidMapper.selectList(map);
    }

	@Override
	public List<CaCyFddbrValid> getList(PageRequest request) {
		PageHelper.startPage(request.getPageNum(), request.getLength());
	    List<CaCyFddbrValid> list = caCyFddbrValidMapper.GetList((String) request.getParams().get("frwybs"));
	    for(CaCyFddbrValid dto : list){
	    	if(dto.getZw()==null){
	    		dto.setZw("法定代表人");
	    	}
	    }
	    return list;
	}
}