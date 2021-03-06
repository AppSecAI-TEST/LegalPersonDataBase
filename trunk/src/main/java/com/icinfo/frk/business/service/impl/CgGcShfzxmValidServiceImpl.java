/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.CgGcShfzxmValidDto;
import com.icinfo.frk.business.mapper.CgGcShfzxmValidMapper;
import com.icinfo.frk.business.model.CgGcShfzxmValid;
import com.icinfo.frk.business.service.ICgGcShfzxmValidService;
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
public class CgGcShfzxmValidServiceImpl extends MyBatisServiceSupport implements ICgGcShfzxmValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private CgGcShfzxmValidMapper CgGcShfzxmValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public PageResponse<CgGcShfzxmValid> getList(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgGcShfzxmValid> shfzDetail = CgGcShfzxmValidMapperimpl.getList(params);
		return new PageResponse<CgGcShfzxmValid>(shfzDetail);
	}

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
     * 社会发展项目信息
     * @param request
     * @return
     * @throws Exception
     */
	@Override
	public PageResponse<CgGcShfzxmValidDto> getShfzDetail(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgGcShfzxmValidDto> shfzDetail = CgGcShfzxmValidMapperimpl.selectShfzDetail(params);
		for(CgGcShfzxmValid shfz : shfzDetail){
			String corpid = shfz.getFrwybs();
			if(null != corpid && !"".equals(corpid)){
				String frwybs = AESEUtil.encodeCorpid(corpid);
				shfz.setFrwybs(frwybs);
			}
		}
		return new PageResponse<CgGcShfzxmValidDto>(shfzDetail);
	}

}
