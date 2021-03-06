package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by FENG on 2017/5/8.
 */
public class DayLogCount {
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date taskTime;

    public BigDecimal taskFlow;

    private Integer taskReadTotal;

    private Integer taskWriteTotal;

    private BigDecimal taskWriteSpeed;

    public BigDecimal getTaskWriteSpeed() {
        return taskWriteSpeed;
    }

    public void setTaskWriteSpeed(BigDecimal taskWriteSpeed) {
        this.taskWriteSpeed = taskWriteSpeed;
    }

    public Date getTaskTime() {
        return taskTime;
    }

    public void setTaskTime(Date taskTime) {
        this.taskTime = taskTime;
    }

    public BigDecimal getTaskFlow() {
        return taskFlow;
    }

    public void setTaskFlow(BigDecimal taskFlow) {
        this.taskFlow = taskFlow;
    }

    public Integer getTaskReadTotal() {
        return taskReadTotal;
    }

    public void setTaskReadTotal(Integer taskReadTotal) {
        this.taskReadTotal = taskReadTotal;
    }

    public Integer getTaskWriteTotal() {
        return taskWriteTotal;
    }

    public void setTaskWriteTotal(Integer taskWriteTotal) {
        this.taskWriteTotal = taskWriteTotal;
    }
}
