/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.mapper.CfGgzfWxdValidMapper;
import com.icinfo.frk.business.mapper.CfGgzfZyxxValidMapper;
import com.icinfo.frk.business.mapper.CfSbCdhbxxValidMapper;
import com.icinfo.frk.business.mapper.CfSsNsjlDsValidMapper;
import com.icinfo.frk.business.mapper.CfSsNsjlGsValidMapper;
import com.icinfo.frk.business.mapper.CfSsSwdjxxValidMapper;
import com.icinfo.frk.business.model.CfGgzfWxdValid;
import com.icinfo.frk.business.model.CfGgzfZyxxValid;
import com.icinfo.frk.business.model.CfSbCdhbxxValid;
import com.icinfo.frk.business.model.CfSsNsjlDsValid;
import com.icinfo.frk.business.model.CfSsNsjlGsValid;
import com.icinfo.frk.business.model.CfSsSwdjxxValid;
import com.icinfo.frk.common.utils.AESEUtil;
import com.icinfo.frk.search.dto.TaxInfoDto;
import com.icinfo.frk.search.mapper.TaxSearchMapper;
import com.icinfo.frk.search.service.ITaxSearchService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:    Service 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月18日
 */
@Service("TaxSearchService")
public class TaxSearchServiceImpl extends MyBatisServiceSupport implements ITaxSearchService {

  @Autowired
  private CfSsSwdjxxValidMapper cfSsSwdjxxValidMapper;
  @Autowired
  private CfSsNsjlGsValidMapper cfSsNsjlGsValidMapper;
  @Autowired
  private CfSsNsjlDsValidMapper cfSsNsjlDsValidMapper;
  @Autowired
  private CfSbCdhbxxValidMapper cfSbCdhbxxValidMapper;
  @Autowired
  private CfGgzfZyxxValidMapper cfGgzfZyxxValidMapper;
  @Autowired
  private CfGgzfWxdValidMapper cfGgzfWxdValidMapper;


  @Override
  public PageResponse<CfSsNsjlGsValid> getDetail0(PageRequest request) throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CfSsNsjlGsValid> list = cfSsNsjlGsValidMapper.selectListByMap(request.getParams());
    for (CfSsNsjlGsValid dto : list) {
      String corpid = dto.getFrwybs();
      if(null != corpid && !"".equals(corpid)){
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CfSsNsjlGsValid>(list);
  }

  /**
   * 描述：
   *
   * @author guanzhou song
   * @date 2017/7/19
   */
  @Override
  public PageResponse<CfSsNsjlDsValid> getDetail1(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CfSsNsjlDsValid> list = cfSsNsjlDsValidMapper.selectListByMap(request.getParams());
    for (CfSsNsjlDsValid dto : list) {
      String corpid = dto.getFrwybs();
      if(null != corpid && !"".equals(corpid)){
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CfSsNsjlDsValid>(list);
  }

  public PageResponse<CfSsSwdjxxValid> getDetail2(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CfSsSwdjxxValid> list = cfSsSwdjxxValidMapper.selectListByMap(request.getParams());
    for (CfSsSwdjxxValid dto : list) {
      String corpid = dto.getFrwybs();
      if(null != corpid && !"".equals(corpid)){
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CfSsSwdjxxValid>(list);
  }

  public PageResponse<CfSbCdhbxxValid> getDetail3(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CfSbCdhbxxValid> list = cfSbCdhbxxValidMapper.selectListByMap(request.getParams());
    for (CfSbCdhbxxValid dto : list) {
      String corpid = dto.getFrwybs();
      if(null != corpid && !"".equals(corpid)){
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CfSbCdhbxxValid>(list);
  }

  public PageResponse<CfGgzfZyxxValid> getDetail4(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CfGgzfZyxxValid> list = cfGgzfZyxxValidMapper.selectListByMap(request.getParams());
    for (CfGgzfZyxxValid dto : list) {
      String corpid = dto.getFrwybs();
      if(null != corpid && !"".equals(corpid)){
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CfGgzfZyxxValid>(list);
  }

  public PageResponse<CfGgzfWxdValid> getDetail5(PageRequest request)
      throws Exception {
    PageHelper.startPage(request.getPageNum(), request.getLength());
    List<CfGgzfWxdValid> list = cfGgzfWxdValidMapper.selectListByMap(request.getParams());
    for (CfGgzfWxdValid dto : list) {
      String corpid = dto.getFrwybs();
      if(null != corpid && !"".equals(corpid)){
        String frwybs = AESEUtil.encodeCorpid(corpid);
        dto.setFrwybs(frwybs);
      }
    }
    return new PageResponse<CfGgzfWxdValid>(list);
  }


}