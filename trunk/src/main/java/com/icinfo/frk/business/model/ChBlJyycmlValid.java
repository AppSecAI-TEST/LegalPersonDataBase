package com.icinfo.frk.business.model;

import javax.persistence.Table;
/**
 * @AUTHOR:Code Templates
 * @DATE:- 2017-07-11 17:04:46
 **/



/**
 * 
 * @author Guanzhou Song
 */
@Table(name="frk.ch_bl_jyycml_valid")
public class ChBlJyycmlValid  implements java.io.Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	//columns START
	//
	private java.lang.String id;
	//
	private java.lang.String hashUnique;
	//
	private java.lang.String nbxh;
	//
	private java.lang.String frwybs;
	//
	private java.lang.String lrjyycmlyy;
	//
	private java.util.Date lrjyycmlrq;
	//
	private java.lang.String zclrjdjg;
	//
	private java.lang.String ycjyycmlyy;
	//
	private java.util.Date ycjyycmlrq;
	//
	private java.lang.String zcycjdjg;
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

	public void setNbxh(java.lang.String value) {
		this.nbxh = value;
	}

	public java.lang.String getNbxh() {
		return this.nbxh;
	}

	public void setFrwybs(java.lang.String value) {
		this.frwybs = value;
	}

	public java.lang.String getFrwybs() {
		return this.frwybs;
	}

	public void setLrjyycmlyy(java.lang.String value) {
		this.lrjyycmlyy = value;
	}

	public java.lang.String getLrjyycmlyy() {
		return this.lrjyycmlyy;
	}

	public void setLrjyycmlrq(java.util.Date value) {
		this.lrjyycmlrq = value;
	}

	public java.util.Date getLrjyycmlrq() {
		return this.lrjyycmlrq;
	}

	public void setZclrjdjg(java.lang.String value) {
		this.zclrjdjg = value;
	}

	public java.lang.String getZclrjdjg() {
		return this.zclrjdjg;
	}

	public void setYcjyycmlyy(java.lang.String value) {
		this.ycjyycmlyy = value;
	}

	public java.lang.String getYcjyycmlyy() {
		return this.ycjyycmlyy;
	}

	public void setYcjyycmlrq(java.util.Date value) {
		this.ycjyycmlrq = value;
	}

	public java.util.Date getYcjyycmlrq() {
		return this.ycjyycmlrq;
	}

	public void setZcycjdjg(java.lang.String value) {
		this.zcycjdjg = value;
	}

	public java.lang.String getZcycjdjg() {
		return this.zcycjdjg;
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

