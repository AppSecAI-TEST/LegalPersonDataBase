/**
 * Copyright© 2003-2016 浙江汇信科技有限公司, All Rights Reserved. <br/>
 */
package com.icinfo.frk.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * 描述:  cd_wxzc_zscqxx_valid 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年07月06日
 */
@Table(name = "frk.cd_wxzc_zscqxx_valid")
public class CdWxzcZscqxxValid implements Serializable {
    @Column(name = "id")
    private String id;

    @Column(name = "hash_unique")
    private String hashUnique;

    @Column(name = "frwybs")
    private String frwybs;

    @Column(name = "syzmc")
    private String syzmc;

    @Column(name = "syzbh")
    private String syzbh;

    @Column(name = "bqdjh")
    private String bqdjh;

    @Column(name = "zpmc")
    private String zpmc;

    @Column(name = "zplb")
    private String zplb;

    @Column(name = "bqdjrq")
    private String bqdjrq;

    @Column(name = "sbzch")
    private String sbzch;

    @Column(name = "sbmc")
    private String sbmc;

    @Column(name = "zscqlx")
    private String zscqlx;

    @Column(name = "zqr")
    private String zqr;

    @Column(name = "zqr_bh")
    private String zqrBh;

    @Column(name = "czqsrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date czqsrq;

    @Column(name = "czjzrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date czjzrq;

    @Column(name = "zqbgrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date zqbgrq;

    @Column(name = "zqzxrq")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date zqzxrq;

    @Column(name = "zqzxyy")
    private String zqzxyy;

    @Column(name = "zqqtwxrq")
    private String zqqtwxrq;

    @Column(name = "zqqtwxyy")
    private String zqqtwxyy;

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
     * @return bqdjh
     */
    public String getBqdjh() {
        return bqdjh;
    }

    /**
     * @param bqdjh
     */
    public void setBqdjh(String bqdjh) {
        this.bqdjh = bqdjh;
    }

    /**
     * @return zpmc
     */
    public String getZpmc() {
        return zpmc;
    }

    /**
     * @param zpmc
     */
    public void setZpmc(String zpmc) {
        this.zpmc = zpmc;
    }

    /**
     * @return zplb
     */
    public String getZplb() {
        return zplb;
    }

    /**
     * @param zplb
     */
    public void setZplb(String zplb) {
        this.zplb = zplb;
    }

    /**
     * @return bqdjrq
     */
    public String getBqdjrq() {
        return bqdjrq;
    }

    /**
     * @param bqdjrq
     */
    public void setBqdjrq(String bqdjrq) {
        this.bqdjrq = bqdjrq;
    }

    /**
     * @return sbzch
     */
    public String getSbzch() {
        return sbzch;
    }

    /**
     * @param sbzch
     */
    public void setSbzch(String sbzch) {
        this.sbzch = sbzch;
    }

    /**
     * @return sbmc
     */
    public String getSbmc() {
        return sbmc;
    }

    /**
     * @param sbmc
     */
    public void setSbmc(String sbmc) {
        this.sbmc = sbmc;
    }

    /**
     * @return zscqlx
     */
    public String getZscqlx() {
        return zscqlx;
    }

    /**
     * @param zscqlx
     */
    public void setZscqlx(String zscqlx) {
        this.zscqlx = zscqlx;
    }

    /**
     * @return zqr
     */
    public String getZqr() {
        return zqr;
    }

    /**
     * @param zqr
     */
    public void setZqr(String zqr) {
        this.zqr = zqr;
    }

    /**
     * @return zqr_bh
     */
    public String getZqrBh() {
        return zqrBh;
    }

    /**
     * @param zqrBh
     */
    public void setZqrBh(String zqrBh) {
        this.zqrBh = zqrBh;
    }

    /**
     * @return czqsrq
     */
    public Date getCzqsrq() {
        return czqsrq;
    }

    /**
     * @param czqsrq
     */
    public void setCzqsrq(Date czqsrq) {
        this.czqsrq = czqsrq;
    }

    /**
     * @return czjzrq
     */
    public Date getCzjzrq() {
        return czjzrq;
    }

    /**
     * @param czjzrq
     */
    public void setCzjzrq(Date czjzrq) {
        this.czjzrq = czjzrq;
    }

    /**
     * @return zqbgrq
     */
    public Date getZqbgrq() {
        return zqbgrq;
    }

    /**
     * @param zqbgrq
     */
    public void setZqbgrq(Date zqbgrq) {
        this.zqbgrq = zqbgrq;
    }

    /**
     * @return zqzxrq
     */
    public Date getZqzxrq() {
        return zqzxrq;
    }

    /**
     * @param zqzxrq
     */
    public void setZqzxrq(Date zqzxrq) {
        this.zqzxrq = zqzxrq;
    }

    /**
     * @return zqzxyy
     */
    public String getZqzxyy() {
        return zqzxyy;
    }

    /**
     * @param zqzxyy
     */
    public void setZqzxyy(String zqzxyy) {
        this.zqzxyy = zqzxyy;
    }

    /**
     * @return zqqtwxrq
     */
    public String getZqqtwxrq() {
        return zqqtwxrq;
    }

    /**
     * @param zqqtwxrq
     */
    public void setZqqtwxrq(String zqqtwxrq) {
        this.zqqtwxrq = zqqtwxrq;
    }

    /**
     * @return zqqtwxyy
     */
    public String getZqqtwxyy() {
        return zqqtwxyy;
    }

    /**
     * @param zqqtwxyy
     */
    public void setZqqtwxyy(String zqqtwxyy) {
        this.zqqtwxyy = zqqtwxyy;
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