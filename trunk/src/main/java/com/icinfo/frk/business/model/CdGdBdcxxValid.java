/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:  cd_gd_bdcxx_valid 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年07月06日
 */
@Table(name = "frk.cd_gd_bdcxx_valid")
public class CdGdBdcxxValid implements Serializable {
    @Column(name = "id")
    private String id;

    @Column(name = "hash_unique")
    private String hashUnique;

    @Column(name = "frwybs")
    private String frwybs;

    @Column(name = "fwbh")
    private String fwbh;

    @Column(name = "fwsyqzh")
    private String fwsyqzh;

    @Column(name = "lx_fwsyqr")
    private String lxFwsyqr;

    @Column(name = "fwsyqr")
    private String fwsyqr;

    @Column(name = "sfzhm")
    private String sfzhm;

    @Column(name = "fjh")
    private String fjh;

    @Column(name = "fwszxzqh")
    private String fwszxzqh;

    @Column(name = "fwzl")
    private String fwzl;

    @Column(name = "fwszzcs")
    private Integer fwszzcs;

    @Column(name = "fwjzmj")
    private BigDecimal fwjzmj;

    @Column(name = "tnjzmj")
    private BigDecimal tnjzmj;

    @Column(name = "fwghyt")
    private String fwghyt;

    @Column(name = "fwxz")
    private String fwxz;

    @Column(name = "fwgyqk")
    private String fwgyqk;

    @Column(name = "fwqlbl")
    private String fwqlbl;

    @Column(name = "fwdjbbh")
    private String fwdjbbh;

    @Column(name = "fwsyqdjsj")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date fwsyqdjsj;

    @Column(name = "fwsyqbgsj")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date fwsyqbgsj;

    @Column(name = "lx_fwsyqdj")
    private String lxFwsyqdj;

    @Column(name = "bm_cjcs")
    private String bmCjcs;

    @Column(name = "wh_fwcf")
    private String whFwcf;

    @Column(name = "fwcfrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date fwcfrq;

    @Column(name = "sqfwcfdw")
    private String sqfwcfdw;

    @Column(name = "zt_fwcf")
    private String ztFwcf;

    @Column(name = "fwcfdw")
    private String fwcfdw;

    @Column(name = "cxfwcfrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date cxfwcfrq;

    @Column(name = "datasrdep")
    private String datasrdep;

    @Column(name = "datasource")
    private String datasource;

    @Column(name = "datakeycontent")
    private String datakeycontent;

    @Column(name = "createtime")
    private String createtime;

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
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return hash_unique
     */
    public String getHashUnique() {
        return hashUnique;
    }

    /**
     * @param hashUnique
     */
    public void setHashUnique(String hashUnique) {
        this.hashUnique = hashUnique;
    }

    /**
     * @return frwybs
     */
    public String getFrwybs() {
        return frwybs;
    }

    /**
     * @param frwybs
     */
    public void setFrwybs(String frwybs) {
        this.frwybs = frwybs;
    }

    /**
     * @return fwbh
     */
    public String getFwbh() {
        return fwbh;
    }

    /**
     * @param fwbh
     */
    public void setFwbh(String fwbh) {
        this.fwbh = fwbh;
    }

    /**
     * @return fwsyqzh
     */
    public String getFwsyqzh() {
        return fwsyqzh;
    }

    /**
     * @param fwsyqzh
     */
    public void setFwsyqzh(String fwsyqzh) {
        this.fwsyqzh = fwsyqzh;
    }

    /**
     * @return lx_fwsyqr
     */
    public String getLxFwsyqr() {
        return lxFwsyqr;
    }

    /**
     * @param lxFwsyqr
     */
    public void setLxFwsyqr(String lxFwsyqr) {
        this.lxFwsyqr = lxFwsyqr;
    }

    /**
     * @return fwsyqr
     */
    public String getFwsyqr() {
        return fwsyqr;
    }

    /**
     * @param fwsyqr
     */
    public void setFwsyqr(String fwsyqr) {
        this.fwsyqr = fwsyqr;
    }

    /**
     * @return sfzhm
     */
    public String getSfzhm() {
        return sfzhm;
    }

    /**
     * @param sfzhm
     */
    public void setSfzhm(String sfzhm) {
        this.sfzhm = sfzhm;
    }

    /**
     * @return fjh
     */
    public String getFjh() {
        return fjh;
    }

    /**
     * @param fjh
     */
    public void setFjh(String fjh) {
        this.fjh = fjh;
    }

    /**
     * @return fwszxzqh
     */
    public String getFwszxzqh() {
        return fwszxzqh;
    }

    /**
     * @param fwszxzqh
     */
    public void setFwszxzqh(String fwszxzqh) {
        this.fwszxzqh = fwszxzqh;
    }

    /**
     * @return fwzl
     */
    public String getFwzl() {
        return fwzl;
    }

    /**
     * @param fwzl
     */
    public void setFwzl(String fwzl) {
        this.fwzl = fwzl;
    }

    /**
     * @return fwszzcs
     */
    public Integer getFwszzcs() {
        return fwszzcs;
    }

    /**
     * @param fwszzcs
     */
    public void setFwszzcs(Integer fwszzcs) {
        this.fwszzcs = fwszzcs;
    }

    /**
     * @return fwjzmj
     */
    public BigDecimal getFwjzmj() {
        return fwjzmj;
    }

    /**
     * @param fwjzmj
     */
    public void setFwjzmj(BigDecimal fwjzmj) {
        this.fwjzmj = fwjzmj;
    }

    /**
     * @return tnjzmj
     */
    public BigDecimal getTnjzmj() {
        return tnjzmj;
    }

    /**
     * @param tnjzmj
     */
    public void setTnjzmj(BigDecimal tnjzmj) {
        this.tnjzmj = tnjzmj;
    }

    /**
     * @return fwghyt
     */
    public String getFwghyt() {
        return fwghyt;
    }

    /**
     * @param fwghyt
     */
    public void setFwghyt(String fwghyt) {
        this.fwghyt = fwghyt;
    }

    /**
     * @return fwxz
     */
    public String getFwxz() {
        return fwxz;
    }

    /**
     * @param fwxz
     */
    public void setFwxz(String fwxz) {
        this.fwxz = fwxz;
    }

    /**
     * @return fwgyqk
     */
    public String getFwgyqk() {
        return fwgyqk;
    }

    /**
     * @param fwgyqk
     */
    public void setFwgyqk(String fwgyqk) {
        this.fwgyqk = fwgyqk;
    }

    /**
     * @return fwqlbl
     */
    public String getFwqlbl() {
        return fwqlbl;
    }

    /**
     * @param fwqlbl
     */
    public void setFwqlbl(String fwqlbl) {
        this.fwqlbl = fwqlbl;
    }

    /**
     * @return fwdjbbh
     */
    public String getFwdjbbh() {
        return fwdjbbh;
    }

    /**
     * @param fwdjbbh
     */
    public void setFwdjbbh(String fwdjbbh) {
        this.fwdjbbh = fwdjbbh;
    }

    /**
     * @return fwsyqdjsj
     */
    public Date getFwsyqdjsj() {
        return fwsyqdjsj;
    }

    /**
     * @param fwsyqdjsj
     */
    public void setFwsyqdjsj(Date fwsyqdjsj) {
        this.fwsyqdjsj = fwsyqdjsj;
    }

    /**
     * @return fwsyqbgsj
     */
    public Date getFwsyqbgsj() {
        return fwsyqbgsj;
    }

    /**
     * @param fwsyqbgsj
     */
    public void setFwsyqbgsj(Date fwsyqbgsj) {
        this.fwsyqbgsj = fwsyqbgsj;
    }

    /**
     * @return lx_fwsyqdj
     */
    public String getLxFwsyqdj() {
        return lxFwsyqdj;
    }

    /**
     * @param lxFwsyqdj
     */
    public void setLxFwsyqdj(String lxFwsyqdj) {
        this.lxFwsyqdj = lxFwsyqdj;
    }

    /**
     * @return bm_cjcs
     */
    public String getBmCjcs() {
        return bmCjcs;
    }

    /**
     * @param bmCjcs
     */
    public void setBmCjcs(String bmCjcs) {
        this.bmCjcs = bmCjcs;
    }

    /**
     * @return wh_fwcf
     */
    public String getWhFwcf() {
        return whFwcf;
    }

    /**
     * @param whFwcf
     */
    public void setWhFwcf(String whFwcf) {
        this.whFwcf = whFwcf;
    }

    /**
     * @return fwcfrq
     */
    public Date getFwcfrq() {
        return fwcfrq;
    }

    /**
     * @param fwcfrq
     */
    public void setFwcfrq(Date fwcfrq) {
        this.fwcfrq = fwcfrq;
    }

    /**
     * @return sqfwcfdw
     */
    public String getSqfwcfdw() {
        return sqfwcfdw;
    }

    /**
     * @param sqfwcfdw
     */
    public void setSqfwcfdw(String sqfwcfdw) {
        this.sqfwcfdw = sqfwcfdw;
    }

    /**
     * @return zt_fwcf
     */
    public String getZtFwcf() {
        return ztFwcf;
    }

    /**
     * @param ztFwcf
     */
    public void setZtFwcf(String ztFwcf) {
        this.ztFwcf = ztFwcf;
    }

    /**
     * @return fwcfdw
     */
    public String getFwcfdw() {
        return fwcfdw;
    }

    /**
     * @param fwcfdw
     */
    public void setFwcfdw(String fwcfdw) {
        this.fwcfdw = fwcfdw;
    }

    /**
     * @return cxfwcfrq
     */
    public Date getCxfwcfrq() {
        return cxfwcfrq;
    }

    /**
     * @param cxfwcfrq
     */
    public void setCxfwcfrq(Date cxfwcfrq) {
        this.cxfwcfrq = cxfwcfrq;
    }

    /**
     * @return datasrdep
     */
    public String getDatasrdep() {
        return datasrdep;
    }

    /**
     * @param datasrdep
     */
    public void setDatasrdep(String datasrdep) {
        this.datasrdep = datasrdep;
    }

    /**
     * @return datasource
     */
    public String getDatasource() {
        return datasource;
    }

    /**
     * @param datasource
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    /**
     * @return datakeycontent
     */
    public String getDatakeycontent() {
        return datakeycontent;
    }

    /**
     * @param datakeycontent
     */
    public void setDatakeycontent(String datakeycontent) {
        this.datakeycontent = datakeycontent;
    }

    /**
     * @return createtime
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * @return updatetime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}