package com.icinfo.frk.business.service;

import java.util.List;

import com.icinfo.framework.core.service.BaseService;
import com.icinfo.frk.business.model.CaCodeFrfl;

/**
 * 描述:  ca_code_frfl 对应的Service接口.<br>
 * @author hujianping
 *
 */
public interface ICaCodeFrfService extends BaseService {

	/**
     * 获取法人类型
     * @return
     */
	List<CaCodeFrfl> getFrStyes();
}
