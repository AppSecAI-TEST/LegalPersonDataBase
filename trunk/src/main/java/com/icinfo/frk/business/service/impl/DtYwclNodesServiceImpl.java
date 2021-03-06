/*
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. 
 */
package com.icinfo.frk.business.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.icinfo.framework.core.service.support.MyBatisServiceSupport;
import com.icinfo.frk.business.dto.DtYwclNodesDto;
import com.icinfo.frk.business.mapper.DtYwclNodesMapper;
import com.icinfo.frk.business.model.Jbxx;
import com.icinfo.frk.business.service.IDtYwclNodesService;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:    dt_ywcl_nodes 对应的Service接口实现类.<br>
 *
 * @author framework generator
 * @date 2017年05月09日
 */
@Service("dtYwclNodesService")
public class DtYwclNodesServiceImpl extends MyBatisServiceSupport implements IDtYwclNodesService {
	
	
	@Autowired
	private DtYwclNodesMapper dtYwclNodesMapper;
	/**
     * 获取节点列表
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	public List<DtYwclNodesDto> doGetDtYwclNodesDtoList(String type) throws Exception{
		return dtYwclNodesMapper.doGetDtYwclNodesDtoList(type);
	}
	
	/**
     * 获取节点列表
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	public List<DtYwclNodesDto> doGetAllNodesList(String type) throws Exception{
		return dtYwclNodesMapper.doGetAllNodesList(type);
	}
	/**
     * 获取饼图json
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	public DtYwclNodesDto doGetPieChart(String id) throws Exception{
		return dtYwclNodesMapper.doGetPieChart(id);
	}
	
	/**
     * 获取nodejsonarray
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	public JSONArray doGetAllNodesJsonArray(String type) throws Exception{
		List<DtYwclNodesDto> NodesList = doGetAllNodesList(type);
		JSONArray nodes = new JSONArray();
		for(DtYwclNodesDto node:NodesList){
			JSONObject objNode = new JSONObject();
			objNode.put("id", node.getId());
			objNode.put("name", node.getNodeName());
			nodes.add(objNode);
		}
		return nodes;
	}
	/**
     * 获取nodejsonarray
     *
     * @throws Exception
     * @auther ylr
     * @date 2017年5月9日
     */
	public JSONArray doGetAllLinksJsonArray(String type) throws Exception{
		List<DtYwclNodesDto> dtYwclNodesDtoList = doGetDtYwclNodesDtoList(type);
		List<DtYwclNodesDto> NodesList = doGetAllNodesList(type);
		JSONArray links = new JSONArray();
		int size = dtYwclNodesDtoList.size();
		for(int i=0;i<size;i++){
			if(StringUtils.isBlank(dtYwclNodesDtoList.get(i).getLinkTargetName()))
				continue;
				JSONObject objLink = new JSONObject();
				objLink.put("source", doGetTargetNum(dtYwclNodesDtoList.get(i).getNodeName(),NodesList));
				objLink.put("target", doGetTargetNum(dtYwclNodesDtoList.get(i).getLinkTargetName(),NodesList));
				objLink.put("value", 50);
//				if("1".equals(dtYwclNodesDtoList.get(i).getNodeSrc()))
					objLink.put("value2", dtYwclNodesDtoList.get(i).getNodeSuccess());	
				links.add(objLink);
		}
		
		return links;
	}
	
	  /**
     * 获取target在源数据里的位置
     * @author ylr
     * @date 2017-5-9
     *
     */

	public Integer doGetTargetNum(String name,List<DtYwclNodesDto> dtYwclNodesDtoList) throws Exception{
		Integer num=null;
		int size = dtYwclNodesDtoList.size();
		for(int i=0;i<size;i++){
			if(name.equals(dtYwclNodesDtoList.get(i).getNodeName())){
				num = i;
				break;	
			}
		}
		return num;
	}
    /**
    * 描述
    * @anthor gqf
    * @param 
    * @return 
    * @date  2017/6/16
    **/
	@Override
	public List<Jbxx> doGetJbxxList(String frmc) throws Exception {
		return dtYwclNodesMapper.selectCadjjbxx(frmc);
	}
	
	public JSONObject doGetAllLinksAndNodesJsonObject(String type) throws Exception{
		JSONObject ret = new JSONObject();
		List<DtYwclNodesDto> dtYwclNodesDtoList = doGetDtYwclNodesDtoList(type);
		List<DtYwclNodesDto> NodesList = doGetAllNodesList(type);
		
		//get links
		JSONArray links = new JSONArray();
		int size = dtYwclNodesDtoList.size();
		for(int i=0;i<size;i++){
			if(StringUtils.isBlank(dtYwclNodesDtoList.get(i).getLinkTargetName()))
				continue;
				JSONObject objLink = new JSONObject();
				objLink.put("source", doGetTargetNum(dtYwclNodesDtoList.get(i).getNodeName(),NodesList));
				objLink.put("target", doGetTargetNum(dtYwclNodesDtoList.get(i).getLinkTargetName(),NodesList));
				objLink.put("value", 50);
//				if("1".equals(dtYwclNodesDtoList.get(i).getNodeSrc()))
				objLink.put("value2", dtYwclNodesDtoList.get(i).getNodeSuccess());	
				links.add(objLink);
		}
		ret.put("links", links);
		
		//get nodes
		JSONArray nodes = new JSONArray();
		for(DtYwclNodesDto node:NodesList){
			JSONObject objNode = new JSONObject();
			objNode.put("id", node.getId());
			objNode.put("name", node.getNodeName());
			nodes.add(objNode);
		}
		ret.put("nodes", nodes);
		
		return ret;
	}
}