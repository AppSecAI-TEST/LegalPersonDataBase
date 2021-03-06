/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.search.service.impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.search.dto.BasicInfoDto;
import com.icinfo.frk.search.mapper.BasicSearchMapper;
import com.icinfo.frk.search.service.IBasicSearchService;

/**
 * 描述:    Service 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月18日
 */
@Service("BasicSearchService")
public class BasicSearchServiceImpl extends MyBatisServiceSupport implements IBasicSearchService {

	    /**
	     * 日志记录器
	     */
	    private static final Logger logger = LoggerFactory.getLogger(BasicSearchServiceImpl.class);

	    @Autowired
	    private BasicSearchMapper SearchMapper;

	    /**
	    * 描述：
	    * @author gqf
	    * @param
	    * @return 
	     *@date 2017/7/13 
	    */
	    @Override
		public PageResponse<BasicInfoDto> getDetail(PageRequest request)
				throws Exception {
			PageHelper.startPage(request.getPageNum(), request.getLength());
			List<BasicInfoDto> list = SearchMapper.selectDetail(request.getParams());
			return new PageResponse<BasicInfoDto>(list);
		}
}