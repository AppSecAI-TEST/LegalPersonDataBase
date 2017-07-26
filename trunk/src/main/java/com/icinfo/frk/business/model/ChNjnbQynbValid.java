package com.icinfo.frk.business.model;

import javax.persistence.Table;
/**
 * @AUTHOR:Code Templates
 * @DATE:- 2017-07-11 17:04:50
 **/



/**
 * 
 * @author Guanzhou Song
 */
@Table(name="frk.ch_njnb_qynb_valid")
public class ChNjnbQynbValid  implements java.io.Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	//columns START
	//
	private java.lang.String id;
	//
	private java.lang.String frwybs;
	//
	private java.lang.String hashUnique;
	//
	private java.lang.String qywybs;
	//
	private java.lang.String qymc;
	//
	private java.lang.String nbxh;
	//
	private java.lang.Integer nbnd;
	//
	private java.util.Date ndbgrq;
	//
	private java.lang.Integer ndbgzt;
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


	public void setFrwybs(java.lang.String value) {
		this.frwybs = value;
	}

	public java.lang.String getFrwybs() {
		return this.frwybs;
	}

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

	public void setQywybs(java.lang.String value) {
		this.qywybs = value;
	}

	public java.lang.String getQywybs() {
		return this.qywybs;
	}

	public void setQymc(java.lang.String value) {
		this.qymc = value;
	}

	public java.lang.String getQymc() {
		return this.qymc;
	}

	public void setNbxh(java.lang.String value) {
		this.nbxh = value;
	}

	public java.lang.String getNbxh() {
		return this.nbxh;
	}

	public void setNbnd(java.lang.Integer value) {
		this.nbnd = value;
	}

	public java.lang.Integer getNbnd() {
		return this.nbnd;
	}

	public void setNdbgrq(java.util.Date value) {
		this.ndbgrq = value;
	}

	public java.util.Date getNdbgrq() {
		return this.ndbgrq;
	}

	public void setNdbgzt(java.lang.Integer value) {
		this.ndbgzt = value;
	}

	public java.lang.Integer getNdbgzt() {
		return this.ndbgzt;
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

