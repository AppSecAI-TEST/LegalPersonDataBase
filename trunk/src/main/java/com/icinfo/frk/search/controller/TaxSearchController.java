/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.controller;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.CfGgzfWxdValid;
import com.icinfo.frk.business.model.CfGgzfZyxxValid;
import com.icinfo.frk.business.model.CfSbCdhbxxValid;
import com.icinfo.frk.business.model.CfSsNsjlDsValid;
import com.icinfo.frk.business.model.CfSsNsjlGsValid;
import com.icinfo.frk.business.model.CfSsSwdjxxValid;
import com.icinfo.frk.search.dto.TaxInfoDto;
import com.icinfo.frk.search.service.ITaxSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述:    dt_frfl_tj 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */

@Controller
@RequestMapping("/data/search")
public class TaxSearchController extends BaseController {

  @RequestMapping(value = "/TaxSearch")
  public String entTaxQuery(Model model) throws Exception {
    return "search/TaxSearch/taxsearch";
  }

  @RequestMapping(value = "/taxsearch0.json")
  @ResponseBody
  public PageResponse<CfSsNsjlGsValid> getTaxDetail0(PageRequest request) throws Exception {
    PageResponse<CfSsNsjlGsValid> list = searchService.getDetail0(request);
    return list;
  }

  @RequestMapping(value = "/taxsearch1.json")
  @ResponseBody
  public PageResponse<CfSsNsjlDsValid> getTaxDetail1(PageRequest request) throws Exception {
    PageResponse<CfSsNsjlDsValid> list = searchService.getDetail1(request);
    return list;
  }

  @RequestMapping(value = "/taxsearch2.json")
  @ResponseBody
  public PageResponse<CfSsSwdjxxValid> getTaxDetail2(PageRequest request) throws Exception {
    PageResponse<CfSsSwdjxxValid> list = searchService.getDetail2(request);
    return list;
  }

  @RequestMapping(value = "/taxsearch3.json")
  @ResponseBody
  public PageResponse<CfSbCdhbxxValid> getTaxDetail3(PageRequest request) throws Exception {
    PageResponse<CfSbCdhbxxValid> list = searchService.getDetail3(request);
    return list;
  }

  @RequestMapping(value = "/taxsearch4.json")
  @ResponseBody
  public PageResponse<CfGgzfZyxxValid> getTaxDetail4(PageRequest request) throws Exception {
    PageResponse<CfGgzfZyxxValid> list = searchService.getDetail4(request);
    return list;
  }

  @RequestMapping(value = "/taxsearch5.json")
  @ResponseBody
  public PageResponse<CfGgzfWxdValid> getTaxDetail5(PageRequest request) throws Exception {
    PageResponse<CfGgzfWxdValid> list = searchService.getDetail5(request);
    return list;
  }

  @Autowired
  private ITaxSearchService searchService;


}