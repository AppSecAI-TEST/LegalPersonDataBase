/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.CgWsshgzCsjzValidDto;
import com.icinfo.frk.business.mapper.CgWsshgzCsjzValidMapper;
import com.icinfo.frk.business.model.CgWsshgzCsjzValid;
import com.icinfo.frk.business.service.ICgWsshgzCsjzValidService;
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
public class CgWsshgzCsjzValidServiceImpl extends MyBatisServiceSupport implements ICgWsshgzCsjzValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private CgWsshgzCsjzValidMapper CgWsshgzCsjzValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public PageResponse<CgWsshgzCsjzValid> getList(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgWsshgzCsjzValid> csjzDetail = CgWsshgzCsjzValidMapperimpl.getList(params);
		return new PageResponse<CgWsshgzCsjzValid>(csjzDetail);
	}

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageResponse<CgWsshgzCsjzValidDto> getCsjzDetail(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgWsshgzCsjzValidDto> csjzDetail = CgWsshgzCsjzValidMapperimpl.selectCsjzDetail(params);
		for(CgWsshgzCsjzValid csjz : csjzDetail){
			String corpid = csjz.getFrwybs();
			if(null != corpid && !"".equals(corpid)){
				String frwybs = AESEUtil.encodeCorpid(corpid);
				csjz.setFrwybs(frwybs);
			}
		}
		return new PageResponse<CgWsshgzCsjzValidDto>(csjzDetail);
	}

}
