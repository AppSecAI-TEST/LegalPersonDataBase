/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 * 描述: TODO <br/>
 *
 * @author framework generator
 * @date 2017年07月06日
 * @version 2.0
 */
package com.icinfo.frk.business.mapper;

import java.util.List;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.model.CdGdDcdyrValid;
import com.icinfo.frk.business.model.CdWxzcZscqxxValid;
import java.util.Map;

/**
 * 描述:  cd_wxzc_zscqxx_valid 对应的Mapper接口.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
public interface CdWxzcZscqxxValidMapper extends Mapper<CdWxzcZscqxxValid> {
	List<CdWxzcZscqxxValid> selectList(String frwybs);
	List<CdWxzcZscqxxValid> selectListByMap(Map<String,Object> paramsMap);
}