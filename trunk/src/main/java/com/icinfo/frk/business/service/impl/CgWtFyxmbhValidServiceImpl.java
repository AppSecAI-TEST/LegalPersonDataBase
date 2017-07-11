/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CgWtFyxmbhValidMapper;
import com.icinfo.frk.business.model.CgWtFyxmbhValid;
import com.icinfo.frk.business.service.ICgWtFyxmbhValidService;
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
public class CgWtFyxmbhValidServiceImpl extends MyBatisServiceSupport implements ICgWtFyxmbhValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private CgWtFyxmbhValidMapper CgWtFyxmbhValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public List<CgWtFyxmbhValid> getList(String frwybs) throws Exception {
    	CgWtFyxmbhValid CgWtFyxmbhValidimpl = new CgWtFyxmbhValid();
    	CgWtFyxmbhValidimpl.setFrwybs(frwybs);
        return CgWtFyxmbhValidMapperimpl.select(CgWtFyxmbhValidimpl);
    }

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
