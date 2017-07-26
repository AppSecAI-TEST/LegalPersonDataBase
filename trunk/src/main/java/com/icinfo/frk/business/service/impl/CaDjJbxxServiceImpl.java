/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.framework.mybatis.pagehelper.Page;
import com.icinfo.framework.mybatis.pagehelper.PageHelper;
import com.icinfo.framework.mybatis.pagehelper.PageInfo;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageRequest;
import com.icinfo.framework.mybatis.pagehelper.datatables.PageResponse;
//import com.icinfo.frk.api.dto.FrCheckDto;
import com.icinfo.frk.api.dto.FrCheckDto;
import com.icinfo.frk.business.dto.CaDjJbxxDto;
import com.icinfo.frk.business.mapper.CaCodeFrdjztMapper;
import com.icinfo.frk.business.mapper.CaCxBgxxValidMapper;
import com.icinfo.frk.business.mapper.CaCyDzxxValidMapper;
import com.icinfo.frk.business.mapper.CaDjJbxxMapper;
import com.icinfo.frk.business.model.CaCyDzxxValid;
import com.icinfo.frk.business.model.CaDjJbxx;
import com.icinfo.frk.business.service.*;
import com.icinfo.frk.common.utils.CollectionUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述:  ca_dj_jbxx 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年06月27日
 */
@Service
public class CaDjJbxxServiceImpl extends MyBatisServiceSupport implements ICaDjJbxxService {
    /**
     * 日志记录器
     */
    private static final Logger logger = LoggerFactory.getLogger(CaDjJbxxServiceImpl.class);

    @Autowired
    private CaDjJbxxMapper caDjJbxxMapper;

    /**
     * 地址信息服务
     */
    @Autowired
    private CaCyDzxxValidMapper caCyDzxxValidMapper;

    /**
     * 变更信息服务
     */
    @Autowired
    private CaCxBgxxValidMapper caCxBgxxValidMapper;

    /**
     * 车辆信息服务
     */
    @Autowired
    private ICdDcClxxValidService cdDcClxxValidService;

    /**
     * 不动产信息服务
     */
    @Autowired
    private ICdGdBdcxxValidService cdGdBdcxxValidService;

    /**
     * 拖拉机信息服务
     */
    @Autowired
    private ICdDcTljxxValidService cdDcTljxxValidService;

    /**
     * 船舶信息服务
     */
    @Autowired
    private ICdDcCbxxValidService cdDcCbxxValidService;

    /**
     * 股东及出资信息服务
     */
    @Autowired
    private ICdZbGdczxxValidService cdZbGdczxxValidService;

    /**
     * 股权信息服务
     */
    @Autowired
    private ICdZbGqxxValidService cdZbGqxxValidService;

    /**
     * 动产抵押信息服务
     */
    @Autowired
    private ICdGdDcdyrValidService cdGdDcdyrValidService;

    /**
     * 知识产权信息服务
     */
    @Autowired
    private ICdWxzcZscqxxValidService cdWxzcZscqxxValidService;

    /**
     * 土地使用权信息服务
     */
    @Autowired
    private ICdWxzcGtsyqxxValidService cdWxzcGtsyqxxValidService;

    /**
     * 采矿权信息服务
     */
    @Autowired
    private ICdWxzcCksyqxxValidService cdWxzcCksyqxxValidService;

    /**
     * 林业使用权信息服务
     */
    @Autowired
    private ICdWxzcLysyqxxValidService cdWxzcLysyqxxValidService;

    /**
     * 生物资产信息服务
     */
    @Autowired
    private ICdQtSwzcValidService cdQtSwzcValidService;
    
    @Autowired
    private CaCodeFrdjztMapper caCodeFrdjztMapper;

    /**
     * 分页获取法人登记基本信息。
     *
     * @param map      参数map
     * @param pageNum  当前页码
     * @param pageSize 每页条数
     * @return 法人登记证列表
     */
    @Override
    public PageInfo<CaDjJbxx> getByKeyword(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<CaDjJbxx> page = (Page<CaDjJbxx>) caDjJbxxMapper.selectListByKeyword(map);
        return page.toPageInfo();
    }

    @Override
    public PageInfo<CaDjJbxx> getBasic(Map<String, Object> map, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        Page<CaDjJbxx> page = (Page<CaDjJbxx>) caDjJbxxMapper.selectList(map);
        return page.toPageInfo();
    }

    /**
     * 获取法人登记证基本信息列表
     *
     * @param map 参数map
     * @return 法人登记证列表
     */
    @Override
    public List<CaDjJbxx> getList(Map<String, Object> map) {
        return caDjJbxxMapper.selectList(map);
    }

    /**
     * 获取法人基本信息
     *
     * @param frwybs 法人唯一标识
     * @return
     */
    @Override
    public Map<String, Object> getFrJbxx(String frwybs) throws Exception {
        Map<String, Object> map = new HashMap<>();

        // 1.获取主体登记信息
        map.put("ztdj", caDjJbxxMapper.GetOneWithStatus(frwybs));
        
        // 3.获取地址信息
        List<CaCyDzxxValid> list = caCyDzxxValidMapper.GetOne(frwybs);
        if(list.size()<1)
            map.put("dzxx", null);
        else
            map.put("dzxx", caCyDzxxValidMapper.GetOne(frwybs).get(0));

        // 4.获取法人变更信息
        map.put("bgxx", caCxBgxxValidMapper.GetList(frwybs));
        return map;
    }

    /**
     * 获取法人资本与资产信息
     *
     * @param frwybs 法人唯一标识
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> getFrZbyzc(String frwybs) throws Exception {
        Map<String, Object> map = new HashMap<>();

        // 1.获取主体登记信息
        map.put("ztdj", caDjJbxxMapper.GetOne(frwybs));

        // 2.获取车辆数量
        map.put("clsl", cdDcClxxValidService.getCountByFrwybs(frwybs));

        // 3.获取房屋数量
        map.put("fwsl", cdGdBdcxxValidService.getCountByFrwybs(frwybs));

        // 4.获取拖拉机数量
        map.put("tljsl", cdDcTljxxValidService.getCountByFrwybs(frwybs));

        // 5.获取船舶数量
        map.put("cbsl", cdDcCbxxValidService.getCountByFrwybs(frwybs));

        // 6.获取股东及出资信息
        map.put("gdczxx", cdZbGdczxxValidService.getList(frwybs));

        // 7.获取股权信息
        map.put("gqxx", cdZbGqxxValidService.getList(frwybs));

        // 8.获取不动产查封信息
        map.put("bdccfxx", cdGdBdcxxValidService.getList(frwybs));

        // 9.获取动产抵押信息
        map.put("dcdyxx", cdGdDcdyrValidService.getList(frwybs));

        // 10.获取知识产权信息
        map.put("zscqxx", cdWxzcZscqxxValidService.getList(frwybs));

        // 11.获取土地使用权信息
        map.put("tdsyqxx", cdWxzcGtsyqxxValidService.getList(frwybs));

        // 12.获取采矿权信息
        map.put("ckqxx", cdWxzcCksyqxxValidService.getList(frwybs));

        // 13.获取林业使用权信息
        map.put("lysyqxx", cdWxzcLysyqxxValidService.getList(frwybs));

        // 14.获取生物资产信息
        map.put("swzcxx", cdQtSwzcValidService.getList(frwybs));
        return map;
    }

    /**
     * 法人校核
     *
     * @param tyxydm 统一信用代码
     * @param frdwmc 法人单位名称
     * @param zzjgdm 组织机构代码
     * @return 校核结果
     * @throws Exception 异常
     */
    @Override
    public List<FrCheckDto> frCheck(String tyxydm, String frdwmc, String zzjgdm) throws Exception {
        List<FrCheckDto> list = caDjJbxxMapper.frCheck(tyxydm, frdwmc, zzjgdm);
        return CollectionUtils.unique(list,"frwybs");
    }
    
    /**
     * 获取所有登记状态
     * @return
     */
	@Override
	public List<String> getRegistStates() {
		List<String> states = caCodeFrdjztMapper.selectCxzts();
		ArrayList<String> list = new ArrayList<String>();
		if(states.contains("")||states.contains(null)){
			for(String string : states){
				if(!"".equals(string)&& null != string){
					list.add(string);
				}
			}
			return list;
		}
		return states;
	}

	@Override
	public PageResponse<CaDjJbxxDto> getFrHighDetail(PageRequest request)
			throws Exception {
		PageHelper.startPage(request.getPageNum(), request.getLength());
		Map<String, Object> params = request.getParams();
		String hydm = (String) params.get("hydm");
		if(null != hydm && !"".equals(hydm)){
			String[] hydmStr = null;
			hydmStr = hydm.split(",");
			List<String> asList = Arrays.asList(hydmStr );
			params.put("hydmStr", asList);
		}
		List<CaDjJbxxDto> list = caDjJbxxMapper.selectFrHighDetail(params);
		return new PageResponse<CaDjJbxxDto>(list);
	}
	
	
}