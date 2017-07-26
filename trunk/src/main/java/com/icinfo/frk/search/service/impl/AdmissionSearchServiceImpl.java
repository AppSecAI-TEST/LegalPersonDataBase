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
import com.icinfo.frk.business.model.CaDjJbxx;
import com.icinfo.frk.search.mapper.AdmissionSearchMapper;
import com.icinfo.frk.search.service.IAdmissionSearchService;

/**
 * 描述:    Service 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年07月18日
 */
@Service("AdmissionSearchService")
public class AdmissionSearchServiceImpl extends MyBatisServiceSupport implements IAdmissionSearchService {

	    /**
	     * 日志记录器
	     */
	    private static final Logger logger = LoggerFactory.getLogger(AdmissionSearchServiceImpl.class);

	    @Autowired
	    private AdmissionSearchMapper SearchMapper;

	    /**
	    * 描述：
	    * @author gqf
	    * @param
	    * @return 
	     *@date 2017/7/13 
	    */

		@Override
		public PageResponse<CaDjJbxx> getDetail(PageRequest request)
				throws Exception {
			PageHelper.startPage(request.getPageNum(), request.getLength());
			List<CaDjJbxx> list = SearchMapper.selectDetail(request.getParams());
			return new PageResponse<CaDjJbxx>(list);
		}

}