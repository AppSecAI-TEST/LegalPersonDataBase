/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.mapper.CgQtCjxmValidMapper;
import com.icinfo.frk.business.model.CgQtCjxmValid;
import com.icinfo.frk.business.service.ICgQtCjxmValidService;
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
public class CgQtCjxmValidServiceImpl extends MyBatisServiceSupport implements ICgQtCjxmValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private CgQtCjxmValidMapper CgQtCjxmValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public PageResponse<CgQtCjxmValid> getList(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgQtCjxmValid> cjxmDetail = CgQtCjxmValidMapperimpl.getList(params);
		return new PageResponse<CgQtCjxmValid>(cjxmDetail);
	}

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
     * 承建项目
     * @param request
     * @return
     * @throws Exception
     */
	@Override
	public PageResponse<CgQtCjxmValid> getSsxxDetail(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<CgQtCjxmValid> cjxmDetail = CgQtCjxmValidMapperimpl.selectCjxmDetail(params);
		for(CgQtCjxmValid cjxm : cjxmDetail){
			String corpid = cjxm.getFrwybs();
			if(null != corpid && !"".equals(corpid)){
				String frwybs = AESEUtil.encodeCorpid(corpid);
				cjxm.setFrwybs(frwybs);
			}
		}
		return new PageResponse<CgQtCjxmValid>(cjxmDetail);
	}

}
