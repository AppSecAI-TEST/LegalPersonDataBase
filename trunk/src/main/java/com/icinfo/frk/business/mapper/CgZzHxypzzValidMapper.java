/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 * @author Guanzhou Song
 * @date 2017年07月11日
 * @version 2.0
 */
package com.icinfo.frk.business.mapper;
import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.model.CgZzHxypzzValid;

import java.util.List;
import java.util.Map;
/**
 * 描述:  CgZzHxypzzValid 对应的Mapper接口.<br>
 *
 * @author framework generator
 * @date 2017年07月06日
 */
public interface CgZzHxypzzValidMapper extends Mapper<CgZzHxypzzValid> {

  List<CgZzHxypzzValid> getList(Map<String,Object> qryMap);
  
  List<CgZzHxypzzValid> selectHxypDetail(Map<String,Object> qryMap);
}
