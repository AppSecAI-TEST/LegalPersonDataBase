/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.ChNjnbLdbzsmscValidDto;
import com.icinfo.frk.business.dto.ChNjnbQynbValidDto;
import com.icinfo.frk.business.mapper.ChNjnbLdbzsmscValidMapper;
import com.icinfo.frk.business.model.ChNjnbJgnjValid;
import com.icinfo.frk.business.model.ChNjnbLdbzsmscValid;
import com.icinfo.frk.business.service.IChNjnbLdbzsmscValidService;
import com.icinfo.frk.common.utils.AESEUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class ChNjnbLdbzsmscValidServiceImpl extends MyBatisServiceSupport implements IChNjnbLdbzsmscValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private ChNjnbLdbzsmscValidMapper ChNjnbLdbzsmscValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public List<ChNjnbLdbzsmscValid> getList(String frwybs) throws Exception {
    	ChNjnbLdbzsmscValid ChNjnbLdbzsmscValidimpl = new ChNjnbLdbzsmscValid();
    	ChNjnbLdbzsmscValidimpl.setFrwybs(frwybs);
        return ChNjnbLdbzsmscValidMapperimpl.select(ChNjnbLdbzsmscValidimpl);
    }

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageResponse<ChNjnbLdbzsmscValidDto> findNdsmscMsg(PageRequest request) {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		List<ChNjnbLdbzsmscValidDto> list = ChNjnbLdbzsmscValidMapperimpl.findNdsmscMsg(request.getParams());
		if(null!=list&&list.size()>0) {
			for(ChNjnbLdbzsmscValid chNjnbLdbzsmscValid:list) {
				String originFrwybs=chNjnbLdbzsmscValid.getFrwybs();
				if(!(originFrwybs==null||originFrwybs.trim().equals(""))) {
					String frwybs=AESEUtil.encodeCorpid(originFrwybs);
					chNjnbLdbzsmscValid.setFrwybs(frwybs);
				}
				
				
			}
		}
		return new PageResponse<ChNjnbLdbzsmscValidDto>(list);
	}

	@Override
	public PageResponse<ChNjnbLdbzsmscValid> getNdsmscDetail(PageRequest request) {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		List<ChNjnbLdbzsmscValid> list = ChNjnbLdbzsmscValidMapperimpl.getList(request.getParams());
		return new PageResponse<ChNjnbLdbzsmscValid>(list);
	}

}
