/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.icinfo.framework.mybatis.mapper.annotation.Before;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:  dt_process_log 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年05月08日
 */
@Table(name = "frk.dt_process_log")
public class DtProcessLog implements Serializable {
    @Id
    @Column(name = "id")
    @Before
    private Integer id;

    /**
     * 任务名称
     */
    @Column(name = "task_name")
    private String taskName;

    /**
     * 执行时间
     */
    @Column(name = "task_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date taskTime;

    /**
     * 任务执行耗时
     */
    @Column(name = "task_long")
    private Long taskLong;

    /**
     * 流量单位M
     */
    @Column(name = "task_flow")
    private BigDecimal taskFlow;

    /**
     * 写入速度
     */
    @Column(name = "task_write_speed")
    private Long taskWriteSpeed;

    /**
     * 读出记录总数
     */
    @Column(name = "task_read_total")
    private Integer taskReadTotal;

    /**
     * 失败数量
     */
    @Column(name = "task_fail_total")
    private Integer taskFailTotal;

    /**
     * 写入记录总数
     */
    @Column(name = "task_write_total")
    private Integer taskWriteTotal;

    /**
     * 原表
     */
    @Column(name = "task_source_table")
    private String taskSourceTable;

    /**
     * 目标表
     */
    @Column(name = "task_target_table")
    private String taskTargetTable;

    @Column(name = "task_status")
    private Integer taskStatus;

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
     * 获取任务名称
     *
     * @return task_name - 任务名称
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * 设置任务名称
     *
     * @param taskName 任务名称
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * 获取执行时间
     *
     * @return task_time - 执行时间
     */
    public Date getTaskTime() {
        return taskTime;
    }

    /**
     * 设置执行时间
     *
     * @param taskTime 执行时间
     */
    public void setTaskTime(Date taskTime) {
        this.taskTime = taskTime;
    }

    /**
     * 获取任务执行耗时
     *
     * @return task_long - 任务执行耗时
     */
    public Long getTaskLong() {
        return taskLong;
    }

    /**
     * 设置任务执行耗时
     *
     * @param taskLong 任务执行耗时
     */
    public void setTaskLong(Long taskLong) {
        this.taskLong = taskLong;
    }

    /**
     * 获取流量单位M
     *
     * @return task_flow - 流量单位M
     */
    public BigDecimal getTaskFlow() {
        return taskFlow;
    }

    /**
     * 设置流量单位M
     *
     * @param taskFlow 流量单位M
     */
    public void setTaskFlow(BigDecimal taskFlow) {
        this.taskFlow = taskFlow;
    }

    /**
     * 获取写入速度
     *
     * @return task_write_speed - 写入速度
     */
    public Long getTaskWriteSpeed() {
        return taskWriteSpeed;
    }

    /**
     * 设置写入速度
     *
     * @param taskWriteSpeed 写入速度
     */
    public void setTaskWriteSpeed(Long taskWriteSpeed) {
        this.taskWriteSpeed = taskWriteSpeed;
    }

    /**
     * 获取读出记录总数
     *
     * @return task_read_total - 读出记录总数
     */
    public Integer getTaskReadTotal() {
        return taskReadTotal;
    }

    /**
     * 设置读出记录总数
     *
     * @param taskReadTotal 读出记录总数
     */
    public void setTaskReadTotal(Integer taskReadTotal) {
        this.taskReadTotal = taskReadTotal;
    }

    /**
     * 获取失败数量
     *
     * @return task_fail_total - 失败数量
     */
    public Integer getTaskFailTotal() {
        return taskFailTotal;
    }

    /**
     * 设置失败数量
     *
     * @param taskFailTotal 失败数量
     */
    public void setTaskFailTotal(Integer taskFailTotal) {
        this.taskFailTotal = taskFailTotal;
    }

    /**
     * 获取写入记录总数
     *
     * @return task_write_total - 写入记录总数
     */
    public Integer getTaskWriteTotal() {
        return taskWriteTotal;
    }

    /**
     * 设置写入记录总数
     *
     * @param taskWriteTotal 写入记录总数
     */
    public void setTaskWriteTotal(Integer taskWriteTotal) {
        this.taskWriteTotal = taskWriteTotal;
    }

    /**
     * 获取原表
     *
     * @return task_source_table - 原表
     */
    public String getTaskSourceTable() {
        return taskSourceTable;
    }

    /**
     * 设置原表
     *
     * @param taskSourceTable 原表
     */
    public void setTaskSourceTable(String taskSourceTable) {
        this.taskSourceTable = taskSourceTable;
    }

    /**
     * 获取目标表
     *
     * @return task_target_table - 目标表
     */
    public String getTaskTargetTable() {
        return taskTargetTable;
    }

    /**
     * 设置目标表
     *
     * @param taskTargetTable 目标表
     */
    public void setTaskTargetTable(String taskTargetTable) {
        this.taskTargetTable = taskTargetTable;
    }

    /**
     * @return task_status
     */
    public Integer getTaskStatus() {
        return taskStatus;
    }

    /**
     * @param taskStatus
     */
    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }
}