package com.icinfo.frk.search.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.CgAqscSgxxValid;
import com.icinfo.frk.business.model.CgAqscYhjlValid;
import com.icinfo.frk.business.model.ChBlJdjcbhgjlValid;
import com.icinfo.frk.business.model.ChBlQdjlValid;
import com.icinfo.frk.business.model.ChBlXzcfxxValid;
import com.icinfo.frk.business.model.ChCcjcJcjkValid;
import com.icinfo.frk.business.model.ChCcjcJdccValid;
import com.icinfo.frk.business.model.ChCcjcZdjgValid;
import com.icinfo.frk.business.model.ChNjnbJgnjValid;
import com.icinfo.frk.business.model.ChNjnbLdbzsmscValid;
import com.icinfo.frk.business.model.ChNjnbQynbValid;
import com.icinfo.frk.business.model.ChNjnbWxdtnjValid;
import com.icinfo.frk.business.model.ChXzqzValid;
import com.icinfo.frk.business.model.ChXzzfFljgValid;
import com.icinfo.frk.business.service.ICgAqscSgxxValidService;
import com.icinfo.frk.business.service.ICgAqscYhjlValidService;
import com.icinfo.frk.business.service.IChBlJdjcbhgjlValidService;
import com.icinfo.frk.business.service.IChBlQdjlValidService;
import com.icinfo.frk.business.service.IChBlXzcfxxValidService;
import com.icinfo.frk.business.service.IChCcjcJcjkValidService;
import com.icinfo.frk.business.service.IChCcjcJdccValidService;
import com.icinfo.frk.business.service.IChCcjcZdjgValidService;
import com.icinfo.frk.business.service.IChNjnbJgnjValidService;
import com.icinfo.frk.business.service.IChNjnbLdbzsmscValidService;
import com.icinfo.frk.business.service.IChNjnbQynbValidService;
import com.icinfo.frk.business.service.IChNjnbWxdtnjValidService;
import com.icinfo.frk.business.service.IChXzqzValidService;
import com.icinfo.frk.business.service.IChXzzfFljgValidService;
import com.icinfo.frk.common.utils.AESEUtil;

@Controller
@RequestMapping(value="/data/lowEnforeDetail")
public class LawEnforceDetailController {
	
	@Autowired 
	private IChBlXzcfxxValidService chBlXzcfxxValidService;
	@Autowired
	private IChXzqzValidService chXXzqzValidService;
	@Autowired
	private IChCcjcZdjgValidService chCcjcZdjgValidService;
	
	@Autowired
	private IChCcjcJdccValidService chCcjcJdccValidService;
	@Autowired
	private IChBlJdjcbhgjlValidService chBlJdjcbhgjlValidService;
	@Autowired
	private IChNjnbJgnjValidService chNjnbJgnjValidService;
	@Autowired
	private IChNjnbQynbValidService chNjnbQynbValidService;
	
	@Autowired
	private IChNjnbLdbzsmscValidService chNjnbLdbzsmscValidService;
	@Autowired
	private IChNjnbWxdtnjValidService chNjnbWxdtnjValidService;
	@Autowired
	private IChCcjcJcjkValidService chCcjcJcjkValidService;
	@Autowired
	private IChBlQdjlValidService chBlQdjlValidService;
	
	@Autowired
	private ICgAqscSgxxValidService cgAqscSgxxValidService;
	@Autowired
	private ICgAqscYhjlValidService cgAqscYhjlValidService;
	@Autowired
	private IChXzzfFljgValidService chXzzfFljgValidService;
	
	private void frwybsDecode(PageRequest request) throws UnsupportedEncodingException {
		String encodeFrwybs=(String) request.getParams().get("frwybs");
		if(!(encodeFrwybs.trim().equals(""))){
			request.getParams().put("frwybs", AESEUtil.decodeCorpid(encodeFrwybs));
		}
	}
	
	@RequestMapping(value="/xzcfDetail")
	@ResponseBody
	public PageResponse<ChBlXzcfxxValid> getXzcfDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChBlXzcfxxValid> list=chBlXzcfxxValidService.getXzcfDetail(request);
		return  list;
	}

	
	
	@RequestMapping(value="/xzqzDetail")
	@ResponseBody
	public PageResponse<ChXzqzValid> getXzqzDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChXzqzValid> list=chXXzqzValidService.getXzqzDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/zdjgDetail")
	@ResponseBody
	public PageResponse<ChCcjcZdjgValid> getZdjgDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChCcjcZdjgValid> list=chCcjcZdjgValidService.getZdjgDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/jdccDetail")
	@ResponseBody
	public PageResponse<ChCcjcJdccValid> getJdccDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChCcjcJdccValid> list=chCcjcJdccValidService.getJdccDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/badRecordDetail")
	@ResponseBody
	public PageResponse<ChBlJdjcbhgjlValid> getBadRecordDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChBlJdjcbhgjlValid> list=chBlJdjcbhgjlValidService.getBadRecordDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/jgnjDetail")
	@ResponseBody
	public PageResponse<ChNjnbJgnjValid> getJgnjDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChNjnbJgnjValid> list=chNjnbJgnjValidService.getJgnjDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/qynbDetail")
	@ResponseBody
	public PageResponse<ChNjnbQynbValid> getQynbDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChNjnbQynbValid> list=chNjnbQynbValidService.getQynbDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/ndsmscDetail")
	@ResponseBody
	public PageResponse<ChNjnbLdbzsmscValid> getNdsmscDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChNjnbLdbzsmscValid> list=chNjnbLdbzsmscValidService.getNdsmscDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/wxdtDetail")
	@ResponseBody
	public PageResponse<ChNjnbWxdtnjValid> getWxdtDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChNjnbWxdtnjValid> list=chNjnbWxdtnjValidService.getWxdtDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/jcjkDetail")
	@ResponseBody
	public PageResponse<ChCcjcJcjkValid> getJcjkDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChCcjcJcjkValid> list=chCcjcJcjkValidService.getJcjkDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/qdjlDetail")
	@ResponseBody
	public PageResponse<ChBlQdjlValid> getQdjlDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChBlQdjlValid> list=chBlQdjlValidService.getQdjlDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/sgxxDetail")
	@ResponseBody
	public PageResponse<CgAqscSgxxValid> getSgxxDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<CgAqscSgxxValid> list=cgAqscSgxxValidService.getSgxxDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/yhjlDetail")
	@ResponseBody
	public PageResponse<CgAqscYhjlValid> getYhjlDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<CgAqscYhjlValid> list=cgAqscYhjlValidService.getYhjlDetail(request);
		return  list;
	}
	
	@RequestMapping(value="/fljgDetail")
	@ResponseBody
	public PageResponse<ChXzzfFljgValid> getFljgDetail(PageRequest request) throws Exception {
		frwybsDecode(request);
		PageResponse<ChXzzfFljgValid> list=chXzzfFljgValidService.getFljgDetail(request);
		return  list;
	}

}
