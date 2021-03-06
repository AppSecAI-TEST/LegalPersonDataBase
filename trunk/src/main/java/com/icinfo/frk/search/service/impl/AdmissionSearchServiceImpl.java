/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.mapper.CeRyRyxxValidMapper;
import com.icinfo.frk.business.mapper.CeXkzBaxxValidMapper;
import com.icinfo.frk.business.mapper.CeXkzXzxkxxValidMapper;
import com.icinfo.frk.business.mapper.CeZzZzxxValidMapper;
import com.icinfo.frk.business.model.CaDjJbxx;
import com.icinfo.frk.business.model.CeRyRyxxValid;
import com.icinfo.frk.business.model.CeXkzBaxxValid;
import com.icinfo.frk.business.model.CeXkzXzxkxxValid;
import com.icinfo.frk.business.model.CeZzZzxxValid;
import com.icinfo.frk.common.utils.AESEUtil;
import com.icinfo.frk.search.mapper.AdmissionSearchMapper;
import com.icinfo.frk.search.service.IAdmissionSearchService;
import com.icinfo.frk.common.utils.AESEUtil;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:    Service 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月18日
 */
@Service("AdmissionSearchService")
public class AdmissionSearchServiceImpl extends MyBatisServiceSupport implements
    IAdmissionSearchService {

  /**
   * 日志记录器
   */
  private static final Logger logger = LoggerFactory.getLogger(AdmissionSearchServiceImpl.class);

  @Autowired
  private CeXkzXzxkxxValidMapper ceXkzXzxkxxValidMapper;
  @Autowired
  private AdmissionSearchMapper SearchMapper;
  @Autowired
  private CeXkzBaxxValidMapper ceXkzBaxxValidMapper;
  @Autowired
  private CeZzZzxxValidMapper ceZzZzxxValidMapper;
  @Autowired
  private CeRyRyxxValidMapper ceRyRyxxValidMapper;



  /**
   * 描述：
   *
   * @author gqf
   * @date 2017/7/13
   */

  @Override
  public PageResponse<CeXkzXzxkxxValid> getDetail1(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CeXkzXzxkxxValid> list = ceXkzXzxkxxValidMapper.selectListByMap(request.getParams());
    for(CeXkzXzxkxxValid dto:list){
      String corpid = dto.getfrwybs();
      if(null != corpid && !"".equals(corpid)){
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setfrwybs(frwybs);
      }
    }
    return new PageResponse<CeXkzXzxkxxValid>(list);
  }

  @Override
  public PageResponse<CeXkzBaxxValid> getDetail2(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CeXkzBaxxValid> list = ceXkzBaxxValidMapper.selectListByMap(request.getParams());
    for(CeXkzBaxxValid dto:list){
      String corpid = dto.getfrwybs();
      if(null != corpid && !"".equals(corpid)){
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setfrwybs(frwybs);
      }
    }
    return new PageResponse<CeXkzBaxxValid>(list);
  }

  @Override
  public PageResponse<CeZzZzxxValid> getDetail3(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CeZzZzxxValid> list = ceZzZzxxValidMapper.selectListByMap(request.getParams());
    for(CeZzZzxxValid dto:list){
      String corpid = dto.getfrwybs();
      if(null != corpid && !"".equals(corpid)){
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setfrwybs(frwybs);
      }
    }
    return new PageResponse<CeZzZzxxValid>(list);
  }

  @Override
  public PageResponse<CeRyRyxxValid> getDetail4(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CeRyRyxxValid> list = ceRyRyxxValidMapper.selectListByMap(request.getParams());
    for(CeRyRyxxValid dto:list){
      String corpid = dto.getfrwybs();
      if(null != corpid && !"".equals(corpid)){
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setfrwybs(frwybs);
      }
    }
    return new PageResponse<CeRyRyxxValid>(list);
  }

}