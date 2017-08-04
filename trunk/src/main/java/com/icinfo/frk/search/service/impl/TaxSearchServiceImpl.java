/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.service.impl;

import com.icinfo.frk.business.mapper.CfGgzfWxdValidMapper;
import com.icinfo.frk.business.mapper.CfGgzfZyxxValidMapper;
import com.icinfo.frk.business.mapper.CfSbCdhbxxValidMapper;
import com.icinfo.frk.business.mapper.CfSsNsjlValidMapper;
import com.icinfo.frk.business.model.CfGgzfWxdValid;
import com.icinfo.frk.business.model.CfGgzfZyxxValid;
import com.icinfo.frk.business.model.CfSbCdhbxxValid;
import com.icinfo.frk.business.model.CfSsNsjlValid;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.search.dto.TaxInfoDto;
import com.icinfo.frk.search.mapper.TaxSearchMapper;
import com.icinfo.frk.search.service.ITaxSearchService;

/**
 * 描述:    Service 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月18日
 */
@Service("TaxSearchService")
public class TaxSearchServiceImpl extends MyBatisServiceSupport implements ITaxSearchService {

	    @Autowired
	    private TaxSearchMapper SearchMapper;
	@Autowired
	private CfSsNsjlValidMapper cfSsNsjlValidMapper;
  @Autowired
  private CfSbCdhbxxValidMapper cfSbCdhbxxValidMapper;
  @Autowired
  private CfGgzfZyxxValidMapper cfGgzfZyxxValidMapper;
  @Autowired
  private CfGgzfWxdValidMapper cfGgzfWxdValidMapper;







	    /**
	    * 描述：
	    * @author guanzhou song
	    * @param
	    * @return 
	     *@date 2017/7/19 
	    */
	    @Override
		public PageResponse<CfSsNsjlValid> getDetail1(PageRequest request)
				throws Exception {
			PageHelper.startPage(request.getPageNum(), request.getLength());
			List<CfSsNsjlValid> list = cfSsNsjlValidMapper.selectListByMap(request.getParams());
			return new PageResponse<CfSsNsjlValid>(list);
		}

	public PageResponse<TaxInfoDto> getDetail2(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		//List<TaxInfoDto> list = SearchMapper.selectListByMap(request.getParams());
		return new PageResponse<TaxInfoDto>(null);
	}

	public PageResponse<CfSbCdhbxxValid> getDetail3(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		List<CfSbCdhbxxValid> list = cfSbCdhbxxValidMapper.selectListByMap(request.getParams());
		return new PageResponse<CfSbCdhbxxValid>(list);
	}

	public PageResponse<CfGgzfZyxxValid> getDetail4(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		List<CfGgzfZyxxValid> list = cfGgzfZyxxValidMapper.selectListByMap(request.getParams());
		return new PageResponse<CfGgzfZyxxValid>(list);
	}

	public PageResponse<CfGgzfWxdValid> getDetail5(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		List<CfGgzfWxdValid> list = cfGgzfWxdValidMapper.selectListByMap(request.getParams());
		return new PageResponse<CfGgzfWxdValid>(list);
	}


}