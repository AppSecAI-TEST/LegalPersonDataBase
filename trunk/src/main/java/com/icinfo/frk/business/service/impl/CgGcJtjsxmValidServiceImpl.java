/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved.
 */
package com.icinfo.frk.business.service.impl;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CgGcJtjsxmValidMapper;
import com.icinfo.frk.business.model.CgGcJtjsxmValid;
import com.icinfo.frk.business.service.ICgGcJtjsxmValidService;
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
public class CgGcJtjsxmValidServiceImpl extends MyBatisServiceSupport implements ICgGcJtjsxmValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CfSsSwdjxxValidServiceImpl.class);

    @Autowired
    private CgGcJtjsxmValidMapper CgGcJtjsxmValidMapperimpl;

    /**
     * 获取
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public List<CgGcJtjsxmValid> getList(String frwybs) throws Exception {
    	CgGcJtjsxmValid CgGcJtjsxmValidimpl = new CgGcJtjsxmValid();
    	CgGcJtjsxmValidimpl.setFrwybs(frwybs);
        return CgGcJtjsxmValidMapperimpl.select(CgGcJtjsxmValidimpl);
    }

	@Override
	public int getCountByFrwybs(String frwybs) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
