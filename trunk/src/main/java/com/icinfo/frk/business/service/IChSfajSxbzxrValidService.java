package com.icinfo.frk.business.service;
import java.util.List;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.ChSfajSxbzxrValid;


/**
 * 
 * @author Guanzhou Song
 */
 public interface IChSfajSxbzxrValidService extends BaseService {

     /**
      * 获取
      *
      * @param frwybs 法人唯一标识
      * @return
      * @throws Exception
      */
     List<ChSfajSxbzxrValid> getList(String frwybs) throws Exception;
     /**
      * 根据法人唯一标识查询
      *
      * @param frwybs 法人唯一标识
      * @return
      * @throws Exception 异常
      */
     int getCountByFrwybs(String frwybs) throws Exception;
     /**
      * 获取失信被执行人信息
      * @param request
      * @return
      * @throws Exception
      */
     PageResponse<ChSfajSxbzxrValid> getChSfajSxbzxr(PageRequest request) throws Exception;
 
     PageResponse<ChSfajSxbzxrValid> getSxList(PageRequest request) throws Exception;
 
 }
