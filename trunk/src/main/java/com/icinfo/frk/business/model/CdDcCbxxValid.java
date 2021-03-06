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
 * 描述:  cd_dc_cbxx_valid 对应的实体类.<br>
 * WARNING：不是表中字段的属性必须加@Transient注解
 * @author framework generator
 * @date 2017年07月06日
 */
@Table(name = "frk.cd_dc_cbxx_valid")
public class CdDcCbxxValid implements Serializable {
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

    @Column(name = "cbch")
    private String cbch;

    @Column(name = "cbssdq")
    private String cbssdq;

    @Column(name = "cbjyr")
    private String cbjyr;

    @Column(name = "cbctcz")
    private String cbctcz;

    @Column(name = "cbzjgl")
    private BigDecimal cbzjgl;

    @Column(name = "cbzjzsxh")
    private String cbzjzsxh;

    @Column(name = "cbzdw")
    private BigDecimal cbzdw;

    @Column(name = "cbjdw")
    private BigDecimal cbjdw;

    @Column(name = "cbcd")
    private BigDecimal cbcd;

    @Column(name = "cbxs")
    private BigDecimal cbxs;

    @Column(name = "cbxk")
    private BigDecimal cbxk;

    @Column(name = "cbwgrq")
    @JsonFormat(pattern = "yyyy-MM-dd  ",timezone = "GMT+8")
    private Date cbwgrq;

    @Column(name = "cbzzfs")
    private String cbzzfs;

    @Column(name = "cbhdcy")
    private Integer cbhdcy;

    @Column(name = "cbjzfs")
    private String cbjzfs;

    @Column(name = "cbhdhq")
    private String cbhdhq;

    @Column(name = "cbsyqz")
    private String cbsyqz;

    @Column(name = "cbdjz")
    private String cbdjz;

    @Column(name = "cbxkz")
    private String cbxkz;

    @Column(name = "cbsyqsxrq")
    @JsonFormat(pattern = "yyyy-MM-dd  ",timezone = "GMT+8")
    private Date cbsyqsxrq;

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
     * @return cbch
     */
    public String getCbch() {
        return cbch;
    }

    /**
     * @param cbch
     */
    public void setCbch(String cbch) {
        this.cbch = cbch;
    }

    /**
     * @return cbssdq
     */
    public String getCbssdq() {
        return cbssdq;
    }

    /**
     * @param cbssdq
     */
    public void setCbssdq(String cbssdq) {
        this.cbssdq = cbssdq;
    }

    /**
     * @return cbjyr
     */
    public String getCbjyr() {
        return cbjyr;
    }

    /**
     * @param cbjyr
     */
    public void setCbjyr(String cbjyr) {
        this.cbjyr = cbjyr;
    }

    /**
     * @return cbctcz
     */
    public String getCbctcz() {
        return cbctcz;
    }

    /**
     * @param cbctcz
     */
    public void setCbctcz(String cbctcz) {
        this.cbctcz = cbctcz;
    }

    /**
     * @return cbzjgl
     */
    public BigDecimal getCbzjgl() {
        return cbzjgl;
    }

    /**
     * @param cbzjgl
     */
    public void setCbzjgl(BigDecimal cbzjgl) {
        this.cbzjgl = cbzjgl;
    }

    /**
     * @return cbzjzsxh
     */
    public String getCbzjzsxh() {
        return cbzjzsxh;
    }

    /**
     * @param cbzjzsxh
     */
    public void setCbzjzsxh(String cbzjzsxh) {
        this.cbzjzsxh = cbzjzsxh;
    }

    /**
     * @return cbzdw
     */
    public BigDecimal getCbzdw() {
        return cbzdw;
    }

    /**
     * @param cbzdw
     */
    public void setCbzdw(BigDecimal cbzdw) {
        this.cbzdw = cbzdw;
    }

    /**
     * @return cbjdw
     */
    public BigDecimal getCbjdw() {
        return cbjdw;
    }

    /**
     * @param cbjdw
     */
    public void setCbjdw(BigDecimal cbjdw) {
        this.cbjdw = cbjdw;
    }

    /**
     * @return cbcd
     */
    public BigDecimal getCbcd() {
        return cbcd;
    }

    /**
     * @param cbcd
     */
    public void setCbcd(BigDecimal cbcd) {
        this.cbcd = cbcd;
    }

    /**
     * @return cbxs
     */
    public BigDecimal getCbxs() {
        return cbxs;
    }

    /**
     * @param cbxs
     */
    public void setCbxs(BigDecimal cbxs) {
        this.cbxs = cbxs;
    }

    /**
     * @return cbxk
     */
    public BigDecimal getCbxk() {
        return cbxk;
    }

    /**
     * @param cbxk
     */
    public void setCbxk(BigDecimal cbxk) {
        this.cbxk = cbxk;
    }

    /**
     * @return cbwgrq
     */
    public Date getCbwgrq() {
        return cbwgrq;
    }

    /**
     * @param cbwgrq
     */
    public void setCbwgrq(Date cbwgrq) {
        this.cbwgrq = cbwgrq;
    }

    /**
     * @return cbzzfs
     */
    public String getCbzzfs() {
        return cbzzfs;
    }

    /**
     * @param cbzzfs
     */
    public void setCbzzfs(String cbzzfs) {
        this.cbzzfs = cbzzfs;
    }

    /**
     * @return cbhdcy
     */
    public Integer getCbhdcy() {
        return cbhdcy;
    }

    /**
     * @param cbhdcy
     */
    public void setCbhdcy(Integer cbhdcy) {
        this.cbhdcy = cbhdcy;
    }

    /**
     * @return cbjzfs
     */
    public String getCbjzfs() {
        return cbjzfs;
    }

    /**
     * @param cbjzfs
     */
    public void setCbjzfs(String cbjzfs) {
        this.cbjzfs = cbjzfs;
    }

    /**
     * @return cbhdhq
     */
    public String getCbhdhq() {
        return cbhdhq;
    }

    /**
     * @param cbhdhq
     */
    public void setCbhdhq(String cbhdhq) {
        this.cbhdhq = cbhdhq;
    }

    /**
     * @return cbsyqz
     */
    public String getCbsyqz() {
        return cbsyqz;
    }

    /**
     * @param cbsyqz
     */
    public void setCbsyqz(String cbsyqz) {
        this.cbsyqz = cbsyqz;
    }

    /**
     * @return cbdjz
     */
    public String getCbdjz() {
        return cbdjz;
    }

    /**
     * @param cbdjz
     */
    public void setCbdjz(String cbdjz) {
        this.cbdjz = cbdjz;
    }

    /**
     * @return cbxkz
     */
    public String getCbxkz() {
        return cbxkz;
    }

    /**
     * @param cbxkz
     */
    public void setCbxkz(String cbxkz) {
        this.cbxkz = cbxkz;
    }

    /**
     * @return cbsyqsxrq
     */
    public Date getCbsyqsxrq() {
        return cbsyqsxrq;
    }

    /**
     * @param cbsyqsxrq
     */
    public void setCbsyqsxrq(Date cbsyqsxrq) {
        this.cbsyqsxrq = cbsyqsxrq;
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