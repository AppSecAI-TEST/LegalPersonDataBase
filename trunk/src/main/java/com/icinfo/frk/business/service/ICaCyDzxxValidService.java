/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.model.CaCyDzxxValid;

/**
 * 描述:  ca_cs_dzxx_valid 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年07月05日
 */
public interface ICaCyDzxxValidService extends BaseService {


    /**
     * 根据法人唯一标识获取地址信息
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    CaCyDzxxValid getByFrwybs(String frwybs) throws Exception;

}