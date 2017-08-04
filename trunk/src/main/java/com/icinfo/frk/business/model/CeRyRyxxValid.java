/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:  cd_gd_bdcxx_valid 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年07月06日
 */
@Table(name = "frk.ce_ry_ryxx_valid")
public class CeRyRyxxValid implements Serializable {
    @Column(name = "id")
    private String id;

    @Column(name = "frwybs")
    private String frwybs;

    @Column(name = "dwmc")
    private String dwmc;

    @Column(name = "tyshxydm")
    private String tyshxydm;

    @Column(name = "zzjgdm")
    private String zzjgdm;

    @Column(name = "rylb")
    private String rylb;

    @Column(name = "rymc")
    private String rymc;

    @Column(name = "ryjldx")
    private String ryjldx;

    @Column(name = "zjlx")
    private String zjlx;

    @Column(name = "zjhm")
    private String zjhm;

    @Column(name = "ryrq")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date ryrq;

    @Column(name = "ryqs")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date ryqs;

    @Column(name = "ryjz")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date ryjz;

    @Column(name = "ryjg")
    private String ryjg;

    @Column(name = "rybh")
    private String rybh;

    @Column(name = "rywh")
    private String rywh;

    @Column(name = "rynd")
    private String rynd;

    @Column(name = "rynr")
    private String rynr;

    @Column(name = "ryzt")
    private String ryzt;

    @Column(name = "rydx")
    private String rydx;

    @Column(name = "datasrdep")
    private String datasrdep;

    @Column(name = "datasource")
    private String datasource;

    @Column(name = "datakeycontent")
    private String datakeycontent;

    @Column(name = "createtime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createtime;

    @Column(name = "updatetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    private String frmc;

    /**
     * @return frmc
     */
    public String getFrmc() {
        return frmc;
    }

    /**
     * @param frmc
     */
    public void setFrmc(String frmc) {
        this.frmc = frmc;
    }

    /**
     * @return 
     */
    public String getid() {
        return id;
    }

    /**
     * @param 
     */
    public void setid(String id) {
        this.id = id;
    }
    
    /**
     * @return 
     */
    public String getfrwybs() {
        return frwybs;
    }

    /**
     * @param 
     */
    public void setfrwybs(String frwybs) {
        this.frwybs = frwybs;
    }
    
    /**
     * @return 
     */
    public String getrylb() {
        return rylb;
    }

    /**
     * @param 
     */
    public void setrylb(String rylb) {
        this.rylb = rylb;
    }

    /**
     * @return 
     */
    public String getrymc() {
        return rymc;
    }

    /**
     * @param 
     */
    public void setrymc(String rymc) {
        this. rymc= rymc;
    }
    
    /**
     * @return 
     */
    public String getryjldx() {
        return ryjldx;
    }

    /**
     * @param 
     */
    public void setryjldx(String ryjldx) {
        this. ryjldx= ryjldx;
    }
    
    /**
     * @return 
     */
    public Date getryrq() {
        return ryrq;
    }

    /**
     * @param 
     */
    public void setryrq(Date ryrq) {
        this. ryrq= ryrq;
    }
    
    /**
     * @return 
     */
    public Date getryqs() {
        return ryqs;
    }

    /**
     * @param 
     */
    public void setryqs(Date ryqs) {
        this. ryqs= ryqs;
    }
    
    /**
     * @return 
     */
    public Date getryjz() {
        return ryjz;
    }

    /**
     * @param 
     */
    public void setryjz(Date ryjz) {
        this.ryjz = ryjz;
    }
    
    /**
     * @return 
     */
    public String getryjg() {
        return ryjg;
    }

    /**
     * @param 
     */
    public void setryjg(String ryjg) {
        this. ryjg= ryjg;
    }
    
    /**
     * @return 
     */
    public String getrynd() {
        return rynd;
    }

    /**
     * @param 
     */
    public void setrynd(String rynd) {
        this. rynd= rynd;
    }
    
    /**
     * @return 
     */
    public String getrynr() {
        return rynr;
    }

    /**
     * @param 
     */
    public void setrynr(String rynr) {
        this. rynr= rynr;
    }
    
    /**
     * @return 
     */
    public String getryzt() {
        return ryzt;
    }

    /**
     * @param 
     */
    public void setryzt(String ryzt) {
        this. ryzt= ryzt;
    }
    
}