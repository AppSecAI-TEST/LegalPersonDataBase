/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.model.CdWxzcCksyqxxValid;

import java.util.List;

/**
 * 描述:  cd_wxzc_cksyqxx_valid 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
public interface ICdWxzcCksyqxxValidService extends BaseService {


    /**
     * 描述：根据法人唯一标识，获取无形资产-采矿权信息
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    List<CdWxzcCksyqxxValid> getList(String frwybs) throws Exception;
}