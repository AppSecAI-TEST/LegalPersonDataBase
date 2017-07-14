/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.model.CdGdBdcxxValid;

import java.util.List;

/**
 * 描述: 固定资产-不动产信息 cd_gd_bdcxx_valid 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
public interface ICdGdBdcxxValidService extends BaseService {

    /**
     * 获取不动产信息列表
     *
     * @param frwybs 法人唯一标识
     * @return 不动产查封信息列表
     * @throws Exception
     */
    List<CdGdBdcxxValid> getList(String frwybs) throws Exception;
    /**
     * 根据法人唯一标识查询房屋数量
     *
     * @param frwybs 法人唯一标识
     * @return 房屋数量
     * @throws Exception 异常
     */
    int getCountByFrwybs(String frwybs) throws Exception;
}