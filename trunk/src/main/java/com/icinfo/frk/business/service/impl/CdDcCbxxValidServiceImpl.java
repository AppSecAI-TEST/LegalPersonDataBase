/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.CdDcCbxxValidMapper;
import com.icinfo.frk.business.model.CdDcCbxxValid;
import com.icinfo.frk.business.service.ICdDcCbxxValidService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:  cd_dc_cbxx_valid 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
@Service
public class CdDcCbxxValidServiceImpl extends MyBatisServiceSupport implements ICdDcCbxxValidService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CdDcCbxxValidServiceImpl.class);

    //船舶信息mapper注入
    @Autowired
    private CdDcCbxxValidMapper cdDcCbxxValidMapper;

    /**
     * 根据法人唯一标识船舶数量
     *
     * @param frwybs 法人唯一标识
     * @return 船舶数量
     * @throws Exception 异常
     */
    @Override
    public int getCountByFrwybs(String frwybs) throws Exception {
        CdDcCbxxValid q = new CdDcCbxxValid();
        q.setFrwybs(frwybs);
        return cdDcCbxxValidMapper.selectCount(q);
    }
}