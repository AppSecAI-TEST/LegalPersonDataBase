/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.frk.business.model.CfSsNsjlValid;

import java.util.List;

/**
 * 描述: 固定资产-不动产信息 cd_gd_bdcxx_valid 对应的Service接口.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
public interface ICfSsNsjlValidService extends BaseService {

    /**
     * 根据法人唯一标识查询房屋数量
     *
     * @param frwybs 法人唯一标识
     * @return 房屋数量
     * @throws Exception 异常
     */
    int getCountByFrwybs(String frwybs) throws Exception;
	List<CfSsNsjlValid> getList(PageRequest request) throws Exception;
}