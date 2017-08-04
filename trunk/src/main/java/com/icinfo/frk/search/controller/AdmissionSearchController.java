/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.controller;

import com.icinfo.frk.business.model.CeRyRyxxValid;
import com.icinfo.frk.business.model.CeXkzBaxxValid;
import com.icinfo.frk.business.model.CeXkzXzxkxxValid;
import com.icinfo.frk.business.model.CeZzZzxxValid;
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

	    @RequestMapping(value = "/admissionsearch1.json")
	    @ResponseBody
	    public PageResponse<CeXkzXzxkxxValid>  getAdmissionDetail1(PageRequest request) throws Exception {
	    	PageResponse<CeXkzXzxkxxValid> list = searchService.getDetail1(request);
			return list;
	    }

	@RequestMapping(value = "/admissionsearch2.json")
	@ResponseBody
	public PageResponse<CeXkzBaxxValid>  getAdmissionDetail2(PageRequest request) throws Exception {
		PageResponse<CeXkzBaxxValid> list = searchService.getDetail2(request);
		return list;
	}

	@RequestMapping(value = "/admissionsearch3.json")
	@ResponseBody
	public PageResponse<CeZzZzxxValid>  getAdmissionDetail3(PageRequest request) throws Exception {
		PageResponse<CeZzZzxxValid> list = searchService.getDetail3(request);
		return list;
	}

	@RequestMapping(value = "/admissionsearch4.json")
	@ResponseBody
	public PageResponse<CeRyRyxxValid>  getAdmissionDetail4(PageRequest request) throws Exception {
		PageResponse<CeRyRyxxValid> list = searchService.getDetail4(request);
		return list;
	}

}