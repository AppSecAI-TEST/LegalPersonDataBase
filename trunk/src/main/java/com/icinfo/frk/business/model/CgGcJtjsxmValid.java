package com.icinfo.frk.business.model;
import javax.persistence.Table;
/**
 * @AUTHOR:Code Templates
 * @DATE:- 2017-07-11 11:26:10
 **/



/**
 * 
 * @author Guanzhou Song
 */
@Table(name="frk.cg_gc_jtjsxm_valid")
public class CgGcJtjsxmValid  implements java.io.Serializable{

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
	private java.lang.String xmdm;
	//
	private java.lang.String xmmc;
	//
	private java.lang.String gczt;
	//
	private java.lang.String xmlx;
	//
	private java.util.Date kgsj;
	//
	private java.util.Date jgsj;
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

	public void setXmdm(java.lang.String value) {
		this.xmdm = value;
	}

	public java.lang.String getXmdm() {
		return this.xmdm;
	}

	public void setXmmc(java.lang.String value) {
		this.xmmc = value;
	}

	public java.lang.String getXmmc() {
		return this.xmmc;
	}

	public void setGczt(java.lang.String value) {
		this.gczt = value;
	}

	public java.lang.String getGczt() {
		return this.gczt;
	}

	public void setXmlx(java.lang.String value) {
		this.xmlx = value;
	}

	public java.lang.String getXmlx() {
		return this.xmlx;
	}

	public void setKgsj(java.util.Date value) {
		this.kgsj = value;
	}

	public java.util.Date getKgsj() {
		return this.kgsj;
	}

	public void setJgsj(java.util.Date value) {
		this.jgsj = value;
	}

	public java.util.Date getJgsj() {
		return this.jgsj;
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

