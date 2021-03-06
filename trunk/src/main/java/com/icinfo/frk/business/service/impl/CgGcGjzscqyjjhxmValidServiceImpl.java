/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.mapper.CgGcGjzscqyjjhxmValidMapper;
import com.icinfo.frk.business.model.CgGcGjzscqyjjhxmValid;
import com.icinfo.frk.business.service.ICgGcGjzscqyjjhxmValidService;
import com.icinfo.frk.common.utils.AESEUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CgGcGjzscqyjjhxmValidServiceImpl extends MyBatisServiceSupport implements ICgGcGjzscqyjjhxmValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private CgGcGjzscqyjjhxmValidMapper CgGcGjzscqyjjhxmValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
	public PageResponse<CgGcGjzscqyjjhxmValid> getList(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgGcGjzscqyjjhxmValid> zscqDetail = CgGcGjzscqyjjhxmValidMapperimpl.getList(params);
		return new PageResponse<CgGcGjzscqyjjhxmValid>(zscqDetail);
	}

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageResponse<CgGcGjzscqyjjhxmValid> getZscqDetail(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgGcGjzscqyjjhxmValid> zscqDetail = CgGcGjzscqyjjhxmValidMapperimpl.selectZscqDetail(params);
		for(CgGcGjzscqyjjhxmValid zscq : zscqDetail){
			String corpid = zscq.getFrwybs();
			if(null != corpid && !"".equals(corpid)){
				String frwybs = AESEUtil.encodeCorpid(corpid);
				zscq.setFrwybs(frwybs);
			}
		}
		return new PageResponse<CgGcGjzscqyjjhxmValid>(zscqDetail);
	}
	
	

}
