/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.frk.business.mapper.CfSsNsjlDsValidMapper;
import com.icinfo.frk.business.model.CfSsNsjlDsValid;
import com.icinfo.frk.business.model.CfSsNsjlValid;
import com.icinfo.frk.business.service.ICfSsNsjlDsValidService;
import com.icinfo.frk.business.service.ICfSsNsjlValidService;
import com.icinfo.frk.common.utils.AESEUtil;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述: 固定资产-不动产信息 cd_gd_bdcxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CfSsNsjlDsValidServiceImpl extends MyBatisServiceSupport implements
    ICfSsNsjlDsValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsNsjlDsValidServiceImpl.class);

    /**
     * 注入不动产信息Mapper
     */

    /**
     * 注入不动产信息Mapper
     */
    @Autowired
    private CfSsNsjlDsValidMapper cfSsNsjlDsValidMapper;

    /**
     * 获取不动产查封信息列表
     *
     * @param
     * @return 不动产查封信息列表
     * @throws Exception
     */
    @Override
    public List<CfSsNsjlDsValid> getList(PageRequest request) throws Exception {
        PageHelper.startPage(request.getPageNum(), request.getLength());
      String frwybs = AESEUtil.decodeCorpid((String) request.getParams().get("frwybs"));
        return cfSsNsjlDsValidMapper.getList(frwybs);
    }

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}