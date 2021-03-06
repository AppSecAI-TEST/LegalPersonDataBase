/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 * 描述: TODO <br/>
 *
 * @author framework generator
 * @date 2017年05月08日
 * @version 2.0
 */
package com.icinfo.frk.business.mapper;

import com.icinfo.framework.mybatis.mapper.common.Mapper;
import com.icinfo.frk.business.dto.DtProcessLogDto;
import com.icinfo.frk.business.model.DayLogCount;
import com.icinfo.frk.business.model.DtProcessLog;

import java.util.List;
import java.util.Map;

/**
 * 描述:  dt_process_log 对应的Mapper接口.<br>
 *
 * @author framework generator
 * @date 2017年05月08日
 */
public interface DtProcessLogMapper extends Mapper<DtProcessLog> {

    List<DayLogCount> selectTaskCountByDate(Map<String, Object> params);
    List<DtProcessLogDto> doGetTaskProcessList();
    List<DtProcessLogDto> doGetTaskTimeList();
    Integer doGetGrandDealNum();
    Integer doGetTrueNum();
    Integer doGetFalseNum();
    Integer doGetAllSum();
    Integer doGetAvgAllSum();
    Integer doGetAllDealTime();
    List<DtProcessLogDto> doGetCurrentTaskList();
    DtProcessLogDto doGetCurrentTaskSum();
    
}