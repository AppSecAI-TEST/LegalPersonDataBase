/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.mapper.*;
import com.icinfo.frk.business.model.CaDjJbxx;
import com.icinfo.frk.business.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述: ca_dj_jbxx 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
@Service
public class PageLoadingServiceImpl extends MyBatisServiceSupport implements IPageLoadingService {
	/**
	 * 日志记录器
	 */
	private static final Logger logger = LoggerFactory.getLogger(PageLoadingServiceImpl.class);

	@Autowired
	private CaDjJbxxMapper caDjJbxxMapper;

	/**
	 * 获取法人许可信息
	 *
	 * @param frwybs
	 *            法人唯一标识
	 * @return
	 * @throws Exception
	 */
	@Override
	public Map<String, Object> getCaDjJbxxInfo(String frwybs) throws Exception {
		Map<String, Object> map = new HashMap<>();
		// 1.获取主体登记信息
		try {
			CaDjJbxx cadj = caDjJbxxMapper.GetOne(frwybs);
			if(null != cadj){
	    		String tyxydm = cadj.getTyxydm();
	        	if(null == tyxydm || "".equals(tyxydm)){
	        		String djzch = cadj.getDjzch();
	        		if(null != djzch && !"".equals(djzch)) {
	        			cadj.setTyxydm(djzch);
	        		}
	        	}
	            map.put("ztdj", cadj);
	    	}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

}