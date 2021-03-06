package com.icinfo.frk.business.model;
import javax.persistence.Table;
/**
 * @AUTHOR:Code Templates
 * @DATE:- 2017-07-11 11:26:11
 **/

import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * 
 * @author Guanzhou Song
 */
@Table(name="frk.cg_gc_qytzxm_valid")
public class CgGcQytzxmValid  implements java.io.Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	//columns START
	//
	private java.lang.String id;
	//
	private java.lang.String hashUnique;
	//
	private java.lang.String frwybs;
	//
	private java.lang.String tyxydm;
	//
	private java.lang.String xmdw;
	//
	private java.lang.String jbr;
	//
	private java.lang.String jbrlxdh;
	//
	private java.lang.String jsxmmc;
	//
	private java.lang.String xmlx;
	//
	private java.lang.String njdz;
	//
	private java.lang.String zyjsnrjgm;
	//
	private java.lang.String cjdwssxy;
	//
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private java.util.Date jsqssj;
	//
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	private java.util.Date jsjssj;
	//
	private Long xmzd;
	//
	private Long xzjsmj;
	//
	private Long xmztz;
	//
	private Long tjtz;
	//
	private Long sbtz;
	//
	private Long pdldzj;
	//
	private Long qsyzyzj;
	//
	private Long yxdk;
	//
	private Long gpzq;
	//
	private java.lang.String qt;
	//
	private java.lang.Integer sfyq;
	//
	private java.lang.Integer spzt;
	//
	private java.util.Date spsj;
	//
	private java.lang.Integer sfxg;
	//
	private java.lang.String xgyy;
	//
	private java.lang.String tcyy;
	//
	private java.lang.String qxyy;
	//
	private java.lang.String datasrdep;
	//
	private java.lang.String datasource;
	//
	private java.lang.String datakeycontent;
	//
	private java.lang.String createtime;
	//
	private java.util.Date updatetime;
	//columns END



	public void setId(java.lang.String value) {
		this.id = value;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setHashUnique(java.lang.String value) {
		this.hashUnique = value;
	}

	public java.lang.String getHashUnique() {
		return this.hashUnique;
	}

	public void setFrwybs(java.lang.String value) {
		this.frwybs = value;
	}

	public java.lang.String getFrwybs() {
		return this.frwybs;
	}

	public void setTyxydm(java.lang.String value) {
		this.tyxydm = value;
	}

	public java.lang.String getTyxydm() {
		return this.tyxydm;
	}

	public void setXmdw(java.lang.String value) {
		this.xmdw = value;
	}

	public java.lang.String getXmdw() {
		return this.xmdw;
	}

	public void setJbr(java.lang.String value) {
		this.jbr = value;
	}

	public java.lang.String getJbr() {
		return this.jbr;
	}

	public void setJbrlxdh(java.lang.String value) {
		this.jbrlxdh = value;
	}

	public java.lang.String getJbrlxdh() {
		return this.jbrlxdh;
	}

	public void setJsxmmc(java.lang.String value) {
		this.jsxmmc = value;
	}

	public java.lang.String getJsxmmc() {
		return this.jsxmmc;
	}

	public void setXmlx(java.lang.String value) {
		this.xmlx = value;
	}

	public java.lang.String getXmlx() {
		return this.xmlx;
	}

	public void setNjdz(java.lang.String value) {
		this.njdz = value;
	}

	public java.lang.String getNjdz() {
		return this.njdz;
	}

	public void setZyjsnrjgm(java.lang.String value) {
		this.zyjsnrjgm = value;
	}

	public java.lang.String getZyjsnrjgm() {
		return this.zyjsnrjgm;
	}

	public void setCjdwssxy(java.lang.String value) {
		this.cjdwssxy = value;
	}

	public java.lang.String getCjdwssxy() {
		return this.cjdwssxy;
	}

	public void setJsqssj(java.util.Date value) {
		this.jsqssj = value;
	}

	public java.util.Date getJsqssj() {
		return this.jsqssj;
	}

	public void setJsjssj(java.util.Date value) {
		this.jsjssj = value;
	}

	public java.util.Date getJsjssj() {
		return this.jsjssj;
	}

	public void setXmzd(Long value) {
		this.xmzd = value;
	}

	public Long getXmzd() {
		return this.xmzd;
	}

	public void setXzjsmj(Long value) {
		this.xzjsmj = value;
	}

	public Long getXzjsmj() {
		return this.xzjsmj;
	}

	public void setXmztz(Long value) {
		this.xmztz = value;
	}

	public Long getXmztz() {
		return this.xmztz;
	}

	public void setTjtz(Long value) {
		this.tjtz = value;
	}

	public Long getTjtz() {
		return this.tjtz;
	}

	public void setSbtz(Long value) {
		this.sbtz = value;
	}

	public Long getSbtz() {
		return this.sbtz;
	}

	public void setPdldzj(Long value) {
		this.pdldzj = value;
	}

	public Long getPdldzj() {
		return this.pdldzj;
	}

	public void setQsyzyzj(Long value) {
		this.qsyzyzj = value;
	}

	public Long getQsyzyzj() {
		return this.qsyzyzj;
	}

	public void setYxdk(Long value) {
		this.yxdk = value;
	}

	public Long getYxdk() {
		return this.yxdk;
	}

	public void setGpzq(Long value) {
		this.gpzq = value;
	}

	public Long getGpzq() {
		return this.gpzq;
	}

	public void setQt(java.lang.String value) {
		this.qt = value;
	}

	public java.lang.String getQt() {
		return this.qt;
	}

	public void setSfyq(java.lang.Integer value) {
		this.sfyq = value;
	}

	public java.lang.Integer getSfyq() {
		return this.sfyq;
	}

	public void setSpzt(java.lang.Integer value) {
		this.spzt = value;
	}

	public java.lang.Integer getSpzt() {
		return this.spzt;
	}

	public void setSpsj(java.util.Date value) {
		this.spsj = value;
	}

	public java.util.Date getSpsj() {
		return this.spsj;
	}

	public void setSfxg(java.lang.Integer value) {
		this.sfxg = value;
	}

	public java.lang.Integer getSfxg() {
		return this.sfxg;
	}

	public void setXgyy(java.lang.String value) {
		this.xgyy = value;
	}

	public java.lang.String getXgyy() {
		return this.xgyy;
	}

	public void setTcyy(java.lang.String value) {
		this.tcyy = value;
	}

	public java.lang.String getTcyy() {
		return this.tcyy;
	}

	public void setQxyy(java.lang.String value) {
		this.qxyy = value;
	}

	public java.lang.String getQxyy() {
		return this.qxyy;
	}

	public void setDatasrdep(java.lang.String value) {
		this.datasrdep = value;
	}

	public java.lang.String getDatasrdep() {
		return this.datasrdep;
	}

	public void setDatasource(java.lang.String value) {
		this.datasource = value;
	}

	public java.lang.String getDatasource() {
		return this.datasource;
	}

	public void setDatakeycontent(java.lang.String value) {
		this.datakeycontent = value;
	}

	public java.lang.String getDatakeycontent() {
		return this.datakeycontent;
	}

	public void setCreatetime(java.lang.String value) {
		this.createtime = value;
	}

	public java.lang.String getCreatetime() {
		return this.createtime;
	}

	public void setUpdatetime(java.util.Date value) {
		this.updatetime = value;
	}

	public java.util.Date getUpdatetime() {
		return this.updatetime;
	}

}

