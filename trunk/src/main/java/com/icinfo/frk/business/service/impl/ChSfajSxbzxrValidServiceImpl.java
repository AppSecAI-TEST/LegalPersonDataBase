/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.mapper.ChSfajSxbzxrValidMapper;
import com.icinfo.frk.business.model.ChSfajSxbzxrValid;
import com.icinfo.frk.business.service.IChSfajSxbzxrValidService;
import com.icinfo.frk.common.utils.AESEUtil;

/**
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class ChSfajSxbzxrValidServiceImpl extends MyBatisServiceSupport implements IChSfajSxbzxrValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private ChSfajSxbzxrValidMapper ChSfajSxbzxrValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public List<ChSfajSxbzxrValid> getList(String frwybs) throws Exception {
    	ChSfajSxbzxrValid ChSfajSxbzxrValidimpl = new ChSfajSxbzxrValid();
    	ChSfajSxbzxrValidimpl.setFrwybs(frwybs);
        return ChSfajSxbzxrValidMapperimpl.select(ChSfajSxbzxrValidimpl);
    }

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
    public PageResponse<ChSfajSxbzxrValid> getChSfajSxbzxr(PageRequest request) throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		List<ChSfajSxbzxrValid> list = ChSfajSxbzxrValidMapperimpl.getChSfajSxbzxr(request.getParams());
		
		if(list!=null && list.size()>0){
			for(ChSfajSxbzxrValid chsfajsx: list){
				String frwybs =chsfajsx.getBzxrwybs();
				 if(!(frwybs==null||frwybs.trim().equals(""))) {  
				
				String frwybss = AESEUtil.encodeCorpid(frwybs);
				chsfajsx.setBzxrwybs(frwybss);
				 }
			}
		}
		
		return new PageResponse<ChSfajSxbzxrValid>(list);
    }

	
	
	
	@Override
	public PageResponse<ChSfajSxbzxrValid> getSxList(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		List<ChSfajSxbzxrValid> list = ChSfajSxbzxrValidMapperimpl.getSxList(params);
		return new PageResponse<ChSfajSxbzxrValid>(list);
	}

	
	
}
