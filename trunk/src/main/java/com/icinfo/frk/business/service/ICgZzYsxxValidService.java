package com.icinfo.frk.business.service;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.model.CgZzYlqxzzValid;
import com.icinfo.frk.business.model.CgZzYsxxValid;

import java.util.List;

/**
 * 
 * @author Guanzhou Song
 */
public interface ICgZzYsxxValidService extends BaseService {

	/**
	 * 获取
	 *
	 * @param frwybs
	 *            法人唯一标识
	 * @return
	 * @throws Exception
	 */
	PageResponse<CgZzYsxxValid> getList(PageRequest request) throws Exception;

	/**
	 * 根据法人唯一标识查询
	 *
	 * @param frwybs
	 *            法人唯一标识
	 * @return
	 * @throws Exception
	 *             异常
	 */
	int getCountByFrwybs(String frwybs) throws Exception;

	/**
	 * 获取印刷详情
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	PageResponse<CgZzYsxxValid> getYshDetail(PageRequest request)
			throws Exception;
}
