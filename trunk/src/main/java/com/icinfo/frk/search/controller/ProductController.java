package com.icinfo.frk.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.icinfo.framework.core.web.BaseController;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
import com.icinfo.frk.business.dto.CgGcQytzxmValidDto;
import com.icinfo.frk.business.dto.CgGcShfzxmValidDto;
import com.icinfo.frk.business.dto.CgGcZytzxmValidDto;
import com.icinfo.frk.business.dto.CgWsshgzCsjzValidDto;
import com.icinfo.frk.business.model.CgGcChdlxmValid;
import com.icinfo.frk.business.model.CgGcGjzscqyjjhxmValid;
import com.icinfo.frk.business.model.CgGcJtjsxmValid;
import com.icinfo.frk.business.model.CgGcQytzxmValid;
import com.icinfo.frk.business.model.CgGcShfzxmValid;
import com.icinfo.frk.business.model.CgGcZdcyxmValid;
import com.icinfo.frk.business.model.CgGcZytzxmValid;
import com.icinfo.frk.business.model.CgQtCjxmValid;
import com.icinfo.frk.business.model.CgQtKjcgValid;
import com.icinfo.frk.business.model.CgQtSsxxValid;
import com.icinfo.frk.business.model.CgWsshgzCsjzValid;
import com.icinfo.frk.business.model.CgZzHxypzzValid;
import com.icinfo.frk.business.model.CgZzYlqxzzValid;
import com.icinfo.frk.business.model.CgZzYsxxValid;
import com.icinfo.frk.business.service.ICgGcChdlxmValidService;
import com.icinfo.frk.business.service.ICgGcGjzscqyjjhxmValidService;
import com.icinfo.frk.business.service.ICgGcJtjsxmValidService;
import com.icinfo.frk.business.service.ICgGcQytzxmValidService;
import com.icinfo.frk.business.service.ICgGcShfzxmValidService;
import com.icinfo.frk.business.service.ICgGcZdcyxmValidService;
import com.icinfo.frk.business.service.ICgGcZytzxmValidService;
import com.icinfo.frk.business.service.ICgQtCjxmValidService;
import com.icinfo.frk.business.service.ICgQtKjcgValidService;
import com.icinfo.frk.business.service.ICgQtSsxxValidService;
import com.icinfo.frk.business.service.ICgWsshgzCsjzValidService;
import com.icinfo.frk.business.service.ICgZzHxypzzValidService;
import com.icinfo.frk.business.service.ICgZzYlqxzzValidService;
import com.icinfo.frk.business.service.ICgZzYsxxValidService;

/**
 * 描述: 生产经营对应的Controller类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
@Controller
@RequestMapping("/data/product")
public class ProductController extends BaseController {

	@Autowired
	private ICgZzHxypzzValidService hxypzzValidService;
	@Autowired
	private ICgZzYlqxzzValidService ylqxzzValidService;
	@Autowired
	private ICgZzYsxxValidService ysxxValidService;
	@Autowired
	private ICgGcChdlxmValidService chdlxmValidService;
	@Autowired
	private ICgGcGjzscqyjjhxmValidService gcGjzscqyjjhxmValidService;
	@Autowired
	private ICgGcJtjsxmValidService jtjsxmValidService;
	@Autowired
	private ICgGcZdcyxmValidService zdcyxmValidService;
	@Autowired
	private ICgGcQytzxmValidService qytzxmValidService;
	@Autowired
	private ICgGcShfzxmValidService shfzxmValidService;
	@Autowired
	private ICgGcZytzxmValidService zytzxmValidService;
	@Autowired
	private ICgQtKjcgValidService kjcgValidService;
	@Autowired
	private ICgWsshgzCsjzValidService csjzValidService;
	@Autowired
	private ICgQtSsxxValidService ssxxValidService;
	@Autowired
	private ICgQtCjxmValidService cjxmValidService;

	/**
	 * 化学药品原料药制造
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/hxyp")
	@ResponseBody
	public PageResponse<CgZzHxypzzValid> getHxypDetail(PageRequest request)
			throws Exception {
		PageResponse<CgZzHxypzzValid> list = hxypzzValidService
				.getList(request);
		return list;
	}

	/**
	 * 医疗器械制造
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/ylqx")
	@ResponseBody
	public PageResponse<CgZzYlqxzzValid> getYlqxDetail(PageRequest request)
			throws Exception {
		PageResponse<CgZzYlqxzzValid> list = ylqxzzValidService
				.getList(request);
		return list;
	}

	/**
	 * 获取印刷信息详细
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/ysww")
	@ResponseBody
	public PageResponse<CgZzYsxxValid> getYshDetail(PageRequest request)
			throws Exception {
		PageResponse<CgZzYsxxValid> yshDetail = ysxxValidService
				.getList(request);
		return yshDetail;
	}

	/**
	 * 获取测绘与地理详细
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/dlch")
	@ResponseBody
	public PageResponse<CgGcChdlxmValid> getChuiDetail(PageRequest request)
			throws Exception {
		PageResponse<CgGcChdlxmValid> chuiDetail = chdlxmValidService
				.getList(request);
		return chuiDetail;
	}

	/**
	 * 获取国家知识产权研究项目详细
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/zscq")
	@ResponseBody
	public PageResponse<CgGcGjzscqyjjhxmValid> getZscqDetail(PageRequest request)
			throws Exception {
		PageResponse<CgGcGjzscqyjjhxmValid> zscqDetail = gcGjzscqyjjhxmValidService
				.getList(request);
		return zscqDetail;
	}

	/**
	 * 交通建设项目信息
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/jtjs")
	@ResponseBody
	public PageResponse<CgGcJtjsxmValid> getJtjsDetail(PageRequest request)
			throws Exception {
		PageResponse<CgGcJtjsxmValid> jtjsDetail = jtjsxmValidService
				.getList(request);
		return jtjsDetail;
	}

	/**
	 * 重大产业项目信息
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/zdcy")
	@ResponseBody
	public PageResponse<CgGcZdcyxmValid> getZdcyDetail(PageRequest request)
			throws Exception {
		PageResponse<CgGcZdcyxmValid> zdcyDetail = zdcyxmValidService
				.getList(request);
		return zdcyDetail;
	}

	/**
	 * 企业投资项目信息
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/qytz")
	@ResponseBody
	public PageResponse<CgGcQytzxmValid> getQytzDetail(PageRequest request)
			throws Exception {
		PageResponse<CgGcQytzxmValid> qytzDetail = qytzxmValidService
				.getList(request);
		return qytzDetail;
	}

	/**
	 * 社会发展项目信息
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/shfz")
	@ResponseBody
	public PageResponse<CgGcShfzxmValid> getShfzDetail(PageRequest request)
			throws Exception {
		PageResponse<CgGcShfzxmValid> shfzDetail = shfzxmValidService
				.getList(request);
		return shfzDetail;
	}

	/**
	 * 中央投资项目信息
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/zytz")
	@ResponseBody
	public PageResponse<CgGcZytzxmValid> getZytzDetail(PageRequest request)
			throws Exception {
		PageResponse<CgGcZytzxmValid> zytzDetail = zytzxmValidService
				.getList(request);
		return zytzDetail;
	}
	
	/**
     * 科技成果
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/kjcg")
    @ResponseBody
    public PageResponse<CgQtKjcgValid>  getKgcgDetail(PageRequest request) throws Exception {
    	PageResponse<CgQtKjcgValid> kgcgDetail = kjcgValidService.getList(request);
		return kgcgDetail;
    }
    
    /**
     * 慈善捐赠
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/csjz")
    @ResponseBody
    public PageResponse<CgWsshgzCsjzValid>  getCsjzDetail(PageRequest request) throws Exception {
    	PageResponse<CgWsshgzCsjzValid> csjzDetail = csjzValidService.getList(request);
		return csjzDetail;
    }
    
    /**
     * 上市信息
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/ssxx")
    @ResponseBody
    public PageResponse<CgQtSsxxValid>  getSsxxDetail(PageRequest request) throws Exception {
    	PageResponse<CgQtSsxxValid> ssxxDetail = ssxxValidService.getList(request);
		return ssxxDetail;
    }
    
    /**
     * 承建项目
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/cjxm")
    @ResponseBody
    public PageResponse<CgQtCjxmValid>  getCjxmDetail(PageRequest request) throws Exception {
    	PageResponse<CgQtCjxmValid> ssxxDetail = cjxmValidService.getList(request);
		return ssxxDetail;
    }
}
