package com.icinfo.frk.business.service;
import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.model.CgQtXcyxValid;
import java.util.List;


/**
 * 
 * @author Guanzhou Song
 */
 public interface ICgQtXcyxValidService extends BaseService {

     /**
      * 获取
      *
      * @param frwybs 法人唯一标识
      * @return
      * @throws Exception
      */
     List<CgQtXcyxValid> getList(String frwybs) throws Exception;
     /**
      * 根据法人唯一标识查询
      *
      * @param frwybs 法人唯一标识
      * @return
      * @throws Exception 异常
      */
     int getCountByFrwybs(String frwybs) throws Exception;
 }
