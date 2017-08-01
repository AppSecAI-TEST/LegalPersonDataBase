/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.controller;

import com.icinfo.framework.common.ajax.AjaxResult;
import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.PageInfo;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.DtBmsjtjDto;
import com.icinfo.frk.business.model.CaDjJbxx;
import com.icinfo.frk.business.model.CaProblemList;
import com.icinfo.frk.business.model.DtBmsjtj;
import com.icinfo.frk.business.service.IDtBmsjtjService;
import com.icinfo.frk.search.service.IAdmissionSearchService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述:  dt_bm_sjtj 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年07月12日
 */
@Controller
@RequestMapping("/data/dtbmsjtj")
public class DtBmsjtjController extends BaseController {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(DtBmsjtjController.class);

    @Autowired
    private IDtBmsjtjService dtBmsjtjService;
    /**
    * 描述：
    * @author gqf
    * @param
    * @return
     *@date 2017/7/13
    */
    @RequestMapping("/dtbmsjtj_list")
    public String doDtbmsjtjUrl() throws Exception {
        return "business/dtbmsjtj/dtbmsjtj_list";
    }
    
    @RequestMapping("/GroupByDept")
    public String doGroupByDeptUrl() throws Exception {
        return "business/dtbmsjtj/GroupByDept";
    }
    
    @RequestMapping("/ProblemData")
    public String doProblemDataUrl() throws Exception {
        return "business/dataproblem/ProblemData";
    }
    
    /**
    * 描述：分页显示
    * @author gqf
    * @param
    * @return
     *@date 2017/7/13
    */
    @RequestMapping({"/dtbmsjtj.json","/dtbmsjtj.xml"})
    @ResponseBody
    public PageResponse<DtBmsjtj> doGetPageDtBmsjtjList(PageRequest request) throws Exception{
        List<DtBmsjtj> dtBmsjtjList = dtBmsjtjService.doGetPageDtBmsjtj(request);
        return new PageResponse<DtBmsjtj>(dtBmsjtjList);
    }
    /**
    * 描述：
    * @author gqf
    * @param
    * @return 
     *@date 2017/7/13 
    */
    @RequestMapping(value = "/dtbmsjtjList.json", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public AjaxResult doGetDefinePageDtBmsjtjList(@RequestParam(name = "pageNum") int pageNum,
                                                  @RequestParam(name = "pageSize") int pageSize) throws Exception{
        Map<String,Object> paraMap = new HashMap<String,Object>();
        PageInfo<DtBmsjtj> dtbmPage = dtBmsjtjService.doGetDefinedPage(paraMap,pageNum,pageSize);
        return AjaxResult.success("成功",dtbmPage);
    }
   
    @RequestMapping(value = "/groupbydept.json")
    @ResponseBody
    public PageResponse<DtBmsjtjDto>  getSumDetail(PageRequest request) throws Exception {
    	PageResponse<DtBmsjtjDto> list = dtBmsjtjService.getSumDetail(request);
		return list;
    }
    
    @RequestMapping(value = "/problemdata.json")
    @ResponseBody
    public PageResponse<CaProblemList>  getProblemDetail(PageRequest request) throws Exception {
    	PageResponse<CaProblemList> list = dtBmsjtjService.getProblemDetail(request);
		return list;
    }
}