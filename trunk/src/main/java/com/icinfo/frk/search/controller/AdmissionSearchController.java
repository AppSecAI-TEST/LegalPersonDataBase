/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.CaDjJbxx;
import com.icinfo.frk.search.service.IAdmissionSearchService;

/**
 * 描述:    dt_frfl_tj 对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年05月10日
 */
	@Controller
	@RequestMapping("/data/search")
	public class AdmissionSearchController extends BaseController {
	    
		@RequestMapping(value = "/AdmissionSearch")
	    public String entAdmissionQuery( Model model) throws Exception {
	        return "search/AdmissionSearch/admissionsearch";
	    }
	    
		@Autowired
		private IAdmissionSearchService searchService;

	    @RequestMapping(value = "/admissionsearch.json")
	    @ResponseBody
	    public PageResponse<CaDjJbxx>  getAdmissionDetail(PageRequest request) throws Exception {
	    	PageResponse<CaDjJbxx> list = searchService.getDetail(request);
			return list;
	    }

}