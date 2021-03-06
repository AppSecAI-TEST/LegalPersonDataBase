/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:  cd_dc_tljxx_valid 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年07月06日
 */
@Table(name = "frk.cd_dc_tljxx_valid")
public class CdDcTljxxValid implements Serializable {
    @Column(name = "id")
    private String id;

    @Column(name = "hash_unique")
    private String hashUnique;

    @Column(name = "frwybs")
    private String frwybs;

    @Column(name = "syzbh")
    private String syzbh;

    @Column(name = "syzmc")
    private String syzmc;

    @Column(name = "syzmcen")
    private String syzmcen;

    @Column(name = "syzdz")
    private String syzdz;

    @Column(name = "syzdzen")
    private String syzdzen;

    @Column(name = "syzdh")
    private String syzdh;

    @Column(name = "tljhdfs")
    private String tljhdfs;

    @Column(name = "tljppxh")
    private String tljppxh;

    @Column(name = "tljlx")
    private String tljlx;

    @Column(name = "tljfdjh")
    private String tljfdjh;

    @Column(name = "tljjsh")
    private String tljjsh;

    @Column(name = "tljgcjh")
    private String tljgcjh;

    @Column(name = "tljzzc")
    private String tljzzc;

    @Column(name = "tljccrq")
    @JsonFormat(pattern = "yyyy-MM-dd  ",timezone = "GMT+8")
    private Date tljccrq;

    @Column(name = "tljzlqd")
    private String tljzlqd;

    @Column(name = "tljdszzrx")
    private String tljdszzrx;

    @Column(name = "tljdjrq")
    @JsonFormat(pattern = "yyyy-MM-dd  ",timezone = "GMT+8")
    private Date tljdjrq;

    @Column(name = "datasrdep")
    private String datasrdep;

    @Column(name = "datasource")
    private String datasource;

    @Column(name = "datakeycontent")
    private String datakeycontent;

    @Column(name = "createtime")
    private String createtime;

    @Column(name = "updatetime")
    @JsonFormat(pattern = "yyyy-MM-dd  ",timezone = "GMT+8")
    private Date updatetime;

    private static final long serialVersionUID = 1L;

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
     * @return syzbh
     */
    public String getSyzbh() {
        return syzbh;
    }

    /**
     * @param syzbh
     */
    public void setSyzbh(String syzbh) {
        this.syzbh = syzbh;
    }

    /**
     * @return syzmc
     */
    public String getSyzmc() {
        return syzmc;
    }

    /**
     * @param syzmc
     */
    public void setSyzmc(String syzmc) {
        this.syzmc = syzmc;
    }

    /**
     * @return syzmcen
     */
    public String getSyzmcen() {
        return syzmcen;
    }

    /**
     * @param syzmcen
     */
    public void setSyzmcen(String syzmcen) {
        this.syzmcen = syzmcen;
    }

    /**
     * @return syzdz
     */
    public String getSyzdz() {
        return syzdz;
    }

    /**
     * @param syzdz
     */
    public void setSyzdz(String syzdz) {
        this.syzdz = syzdz;
    }

    /**
     * @return syzdzen
     */
    public String getSyzdzen() {
        return syzdzen;
    }

    /**
     * @param syzdzen
     */
    public void setSyzdzen(String syzdzen) {
        this.syzdzen = syzdzen;
    }

    /**
     * @return syzdh
     */
    public String getSyzdh() {
        return syzdh;
    }

    /**
     * @param syzdh
     */
    public void setSyzdh(String syzdh) {
        this.syzdh = syzdh;
    }

    /**
     * @return tljhdfs
     */
    public String getTljhdfs() {
        return tljhdfs;
    }

    /**
     * @param tljhdfs
     */
    public void setTljhdfs(String tljhdfs) {
        this.tljhdfs = tljhdfs;
    }

    /**
     * @return tljppxh
     */
    public String getTljppxh() {
        return tljppxh;
    }

    /**
     * @param tljppxh
     */
    public void setTljppxh(String tljppxh) {
        this.tljppxh = tljppxh;
    }

    /**
     * @return tljlx
     */
    public String getTljlx() {
        return tljlx;
    }

    /**
     * @param tljlx
     */
    public void setTljlx(String tljlx) {
        this.tljlx = tljlx;
    }

    /**
     * @return tljfdjh
     */
    public String getTljfdjh() {
        return tljfdjh;
    }

    /**
     * @param tljfdjh
     */
    public void setTljfdjh(String tljfdjh) {
        this.tljfdjh = tljfdjh;
    }

    /**
     * @return tljjsh
     */
    public String getTljjsh() {
        return tljjsh;
    }

    /**
     * @param tljjsh
     */
    public void setTljjsh(String tljjsh) {
        this.tljjsh = tljjsh;
    }

    /**
     * @return tljgcjh
     */
    public String getTljgcjh() {
        return tljgcjh;
    }

    /**
     * @param tljgcjh
     */
    public void setTljgcjh(String tljgcjh) {
        this.tljgcjh = tljgcjh;
    }

    /**
     * @return tljzzc
     */
    public String getTljzzc() {
        return tljzzc;
    }

    /**
     * @param tljzzc
     */
    public void setTljzzc(String tljzzc) {
        this.tljzzc = tljzzc;
    }

    /**
     * @return tljccrq
     */
    public Date getTljccrq() {
        return tljccrq;
    }

    /**
     * @param tljccrq
     */
    public void setTljccrq(Date tljccrq) {
        this.tljccrq = tljccrq;
    }

    /**
     * @return tljzlqd
     */
    public String getTljzlqd() {
        return tljzlqd;
    }

    /**
     * @param tljzlqd
     */
    public void setTljzlqd(String tljzlqd) {
        this.tljzlqd = tljzlqd;
    }

    /**
     * @return tljdszzrx
     */
    public String getTljdszzrx() {
        return tljdszzrx;
    }

    /**
     * @param tljdszzrx
     */
    public void setTljdszzrx(String tljdszzrx) {
        this.tljdszzrx = tljdszzrx;
    }

    /**
     * @return tljdjrq
     */
    public Date getTljdjrq() {
        return tljdjrq;
    }

    /**
     * @param tljdjrq
     */
    public void setTljdjrq(Date tljdjrq) {
        this.tljdjrq = tljdjrq;
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