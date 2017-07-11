/*
 * Powered By [rapid-framework]
 * Web Site: http://www.rapid-framework.org.cn
 * Google Code: http://code.google.com/p/rapid-framework/
 * Since 2008 - 2017
 */

package com.icinfo.frk.business.model;

import java.util.*;

import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;



/**
 * @author badqiu email:badqiu(a)gmail.com
 * @version 1.0
 * @since 1.0
 */

@Table(name = "frk.cf_ggzf_zyxx_valid")
public class CfGgzfZyxxValid implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;




	//可以直接使用: @Length(max=50,message="用户名长度不能大于50")显示错误消息
	//columns START
	@Length(max=2147483647)
	private java.lang.String id;
	@Length(max=2147483647)
	private java.lang.String hashUnique;
	@Length(max=2147483647)
	private java.lang.String frwybs;
	@Length(max=2147483647)
	private java.lang.String tyxydm;
	@Length(max=2147483647)
	private java.lang.String dwmc;
	@Length(max=2147483647)
	private java.lang.String zzjgdm;
	@Length(max=2147483647)
	private java.lang.String dlhh;
	
	private java.util.Date dljfsj;
	
	private Long zydl;
	@Length(max=2147483647)
	private java.lang.String ydlx;
	@Length(max=2147483647)
	private java.lang.String jfzh;
	
	private java.util.Date djsj;
	@Length(max=2147483647)
	private java.lang.String yhlx;
	
	private java.util.Date cbsj;
	@Length(max=2147483647)
	private java.lang.String ydssq;
	
	private Long ydl;
	
	private Long ydje;
	
	private java.util.Date jfrq;
	
	private Long jfje;
	@Length(max=2147483647)
	private java.lang.String yddz;
	
	private Long qdl;
	@Length(max=2147483647)
	private java.lang.String dfqfsd;
	
	private Long dfqfze;
	@Length(max=2147483647)
	private java.lang.String mhsyfw;
	@Length(max=2147483647)
	private java.lang.String mhzy;
	@Length(max=2147483647)
	private java.lang.String mhzsbh;
	
	private java.lang.Integer mhwc;
	@Length(max=2147483647)
	private java.lang.String mhyt;
	
	private java.util.Date mhyxqz;
	@Length(max=2147483647)
	private java.lang.String datasrdep;
	@Length(max=2147483647)
	private java.lang.String datasource;
	@Length(max=2147483647)
	private java.lang.String datakeycontent;
	@Length(max=2147483647)
	private java.lang.String createtime;
	
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

	public void setDwmc(java.lang.String value) {
		this.dwmc = value;
	}

	public java.lang.String getDwmc() {
		return this.dwmc;
	}

	public void setZzjgdm(java.lang.String value) {
		this.zzjgdm = value;
	}

	public java.lang.String getZzjgdm() {
		return this.zzjgdm;
	}

	public void setDlhh(java.lang.String value) {
		this.dlhh = value;
	}

	public java.lang.String getDlhh() {
		return this.dlhh;
	}

	public void setDljfsj(java.util.Date value) {
		this.dljfsj = value;
	}

	public java.util.Date getDljfsj() {
		return this.dljfsj;
	}

	public void setZydl(Long value) {
		this.zydl = value;
	}

	public Long getZydl() {
		return this.zydl;
	}

	public void setYdlx(java.lang.String value) {
		this.ydlx = value;
	}

	public java.lang.String getYdlx() {
		return this.ydlx;
	}

	public void setJfzh(java.lang.String value) {
		this.jfzh = value;
	}

	public java.lang.String getJfzh() {
		return this.jfzh;
	}

	public void setDjsj(java.util.Date value) {
		this.djsj = value;
	}

	public java.util.Date getDjsj() {
		return this.djsj;
	}

	public void setYhlx(java.lang.String value) {
		this.yhlx = value;
	}

	public java.lang.String getYhlx() {
		return this.yhlx;
	}

	public void setCbsj(java.util.Date value) {
		this.cbsj = value;
	}

	public java.util.Date getCbsj() {
		return this.cbsj;
	}

	public void setYdssq(java.lang.String value) {
		this.ydssq = value;
	}

	public java.lang.String getYdssq() {
		return this.ydssq;
	}

	public void setYdl(Long value) {
		this.ydl = value;
	}

	public Long getYdl() {
		return this.ydl;
	}

	public void setYdje(Long value) {
		this.ydje = value;
	}

	public Long getYdje() {
		return this.ydje;
	}

	public void setJfrq(java.util.Date value) {
		this.jfrq = value;
	}

	public java.util.Date getJfrq() {
		return this.jfrq;
	}

	public void setJfje(Long value) {
		this.jfje = value;
	}

	public Long getJfje() {
		return this.jfje;
	}

	public void setYddz(java.lang.String value) {
		this.yddz = value;
	}

	public java.lang.String getYddz() {
		return this.yddz;
	}

	public void setQdl(Long value) {
		this.qdl = value;
	}

	public Long getQdl() {
		return this.qdl;
	}

	public void setDfqfsd(java.lang.String value) {
		this.dfqfsd = value;
	}

	public java.lang.String getDfqfsd() {
		return this.dfqfsd;
	}

	public void setDfqfze(Long value) {
		this.dfqfze = value;
	}

	public Long getDfqfze() {
		return this.dfqfze;
	}

	public void setMhsyfw(java.lang.String value) {
		this.mhsyfw = value;
	}

	public java.lang.String getMhsyfw() {
		return this.mhsyfw;
	}

	public void setMhzy(java.lang.String value) {
		this.mhzy = value;
	}

	public java.lang.String getMhzy() {
		return this.mhzy;
	}

	public void setMhzsbh(java.lang.String value) {
		this.mhzsbh = value;
	}

	public java.lang.String getMhzsbh() {
		return this.mhzsbh;
	}

	public void setMhwc(java.lang.Integer value) {
		this.mhwc = value;
	}

	public java.lang.Integer getMhwc() {
		return this.mhwc;
	}

	public void setMhyt(java.lang.String value) {
		this.mhyt = value;
	}

	public java.lang.String getMhyt() {
		return this.mhyt;
	}

	public void setMhyxqz(java.util.Date value) {
		this.mhyxqz = value;
	}

	public java.util.Date getMhyxqz() {
		return this.mhyxqz;
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

