package com.icinfo.frk.business.model;

import javax.persistence.Table;
/**
 * @AUTHOR:Code Templates
 * @DATE:- 2017-07-11 17:04:48
 **/



/**
 * 
 * @author Guanzhou Song
 */
@Table(name="frk.ch_ccjc_xcjy_valid")
public class ChCcjcXcjyValid  implements java.io.Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	//columns START
	//
	private java.lang.String id;
	//
	private java.lang.String hashUnique;
	//
	private java.lang.String frwybs;
	//
	private java.lang.String syldjyzzdw;
	//
	private java.lang.String syldjydw;
	//
	private java.lang.String syldjydwzz;
	//
	private java.util.Date syldjysj;
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

	public void setSyldjyzzdw(java.lang.String value) {
		this.syldjyzzdw = value;
	}

	public java.lang.String getSyldjyzzdw() {
		return this.syldjyzzdw;
	}

	public void setSyldjydw(java.lang.String value) {
		this.syldjydw = value;
	}

	public java.lang.String getSyldjydw() {
		return this.syldjydw;
	}

	public void setSyldjydwzz(java.lang.String value) {
		this.syldjydwzz = value;
	}

	public java.lang.String getSyldjydwzz() {
		return this.syldjydwzz;
	}

	public void setSyldjysj(java.util.Date value) {
		this.syldjysj = value;
	}

	public java.util.Date getSyldjysj() {
		return this.syldjysj;
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

