/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CeRyRyxxValidMapper;
import com.icinfo.frk.business.mapper.CfBxSbxxValidMapper;
import com.icinfo.frk.business.model.CeRyRyxxValid;
import com.icinfo.frk.business.model.CfBxSbxxValid;
import com.icinfo.frk.business.service.ICfBxSbxxValidService;

import org.apache.shiro.crypto.hash.Hash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述: 固定资产-不动产信息 cd_gd_bdcxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CfBxSbxxValidServiceImpl extends MyBatisServiceSupport implements ICfBxSbxxValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfBxSbxxValidServiceImpl.class);

    /**
     * 注入不动产信息Mapper
     */

    /**
     * 注入不动产信息Mapper
     */
    @Autowired
    private CfBxSbxxValidMapper cfBxSbxxValidMapper;

    /**
     * 获取不动产查封信息列表
     *
     * @param frwybs 法人唯一标识
     * @return 不动产查封信息列表
     * @throws Exception
     */
    @Override
    public List<CfBxSbxxValid> getList(String frwybs) throws Exception {
    	CfBxSbxxValid cfBxSbxxValid = new CfBxSbxxValid();
    	cfBxSbxxValid.setFrwybs(frwybs);
        return cfBxSbxxValidMapper.select(cfBxSbxxValid);
    }

	@Override
	public Map<String, Integer> getCountByFrwybs(String frwybs) throws Exception {
		return null;
	}

}