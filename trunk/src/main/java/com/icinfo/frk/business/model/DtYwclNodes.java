/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.icinfo.framework.mybatis.mapper.annotation.Before;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:    dt_ywcl_nodes 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年05月09日
 */
@Table(name = "frk.dt_ywcl_nodes")
public class DtYwclNodes implements Serializable {
    @Id
    @Column(name = "id")
    @Before
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator="select replace(uuid(), '-', '')")
    private Integer id;

    /**
     * 表名
     */
    @Column(name = "node_name")
    private String nodeName;

    /**
     * 校验失败率
     */
    @Column(name = "node_fail")
    private Integer nodeFail;

    /**
     * 失败原因
     */
    @Column(name = "node_reason")
    private String nodeReason;

    /**
     * 校验成功率
     */
    @Column(name = "node_success")
    private Integer nodeSuccess;

    /**
     * 处理日期
     */
    @Column(name = "node_date")
    private Date nodeDate;

    /**
     * 维度
     */
    @Column(name = "node_dim")
    private String nodeDim;

    /**
     * 是否是原始表
     */
    @Column(name = "node_src")
    private String nodeSrc;

    /**
     * 节点中文描述
     */
    @Column(name = "node_desc")
    private String nodeDesc;

    //成功节点数目
    @Column(name="node_success_count")
    private Integer nodeSuccessCount;
    
    //失败节点数目
    @Column(name="node_fail_count")
    private Integer nodeFailCount;
    
   
    private static final long serialVersionUID = 1L;

    
    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取表名
     *
     * @return node_name - 表名
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * 设置表名
     *
     * @param nodeName 表名
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    /**
     * 获取校验失败率
     *
     * @return node_fail - 校验失败率
     */
    public Integer getNodeFail() {
        return nodeFail;
    }

    /**
     * 设置校验失败率
     *
     * @param nodeFail 校验失败率
     */
    public void setNodeFail(Integer nodeFail) {
        this.nodeFail = nodeFail;
    }

    /**
     * 获取失败原因
     *
     * @return node_reason - 失败原因
     */
    public String getNodeReason() {
        return nodeReason;
    }

    /**
     * 设置失败原因
     *
     * @param nodeReason 失败原因
     */
    public void setNodeReason(String nodeReason) {
        this.nodeReason = nodeReason;
    }

    /**
     * 获取校验成功率
     *
     * @return node_success - 校验成功率
     */
    public Integer getNodeSuccess() {
        return nodeSuccess;
    }

    /**
     * 设置校验成功率
     *
     * @param nodeSuccess 校验成功率
     */
    public void setNodeSuccess(Integer nodeSuccess) {
        this.nodeSuccess = nodeSuccess;
    }

    /**
     * 获取处理日期
     *
     * @return node_date - 处理日期
     */
    public Date getNodeDate() {
        return nodeDate;
    }

    /**
     * 设置处理日期
     *
     * @param nodeDate 处理日期
     */
    public void setNodeDate(Date nodeDate) {
        this.nodeDate = nodeDate;
    }

    /**
     * 获取维度
     *
     * @return node_dim - 维度
     */
    public String getNodeDim() {
        return nodeDim;
    }

    /**
     * 设置维度
     *
     * @param nodeDim 维度
     */
    public void setNodeDim(String nodeDim) {
        this.nodeDim = nodeDim;
    }

    /**
     * 获取是否是原始表
     *
     * @return node_src - 是否是原始表
     */
    public String getNodeSrc() {
        return nodeSrc;
    }

    /**
     * 设置是否是原始表
     *
     * @param nodeSrc 是否是原始表
     */
    public void setNodeSrc(String nodeSrc) {
        this.nodeSrc = nodeSrc;
    }

    /**
     * 获取节点中文描述
     *
     * @return node_desc - 节点中文描述
     */
    public String getNodeDesc() {
        return nodeDesc;
    }

    /**
     * 设置节点中文描述
     *
     * @param nodeDesc 节点中文描述
     */
    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc;
    }
    
    //Get node_success_count
    public int getNodeSuccessCount() {
        return nodeSuccessCount;
    }
  
    //set node_success_count
    public void setNodeSuccessCount(Integer nodeSuccessCount) {
        this.nodeSuccessCount = nodeSuccessCount;
    }
    
   //Get node_fail_count
    public int getNodeFailCount() {
        return nodeFailCount;
    }

    //Set node_fail_Count
    public void setNodeFailCount(Integer nodeFailCount) {
        this.nodeFailCount = nodeFailCount;
    }
    
    
}