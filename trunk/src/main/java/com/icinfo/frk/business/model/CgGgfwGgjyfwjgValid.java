package com.icinfo.frk.business.model;
import java.util.*;
import javax.persistence.Table;


/**
 * 
 * @author Guanzhou Song
 */
@Table(name="frk.cg_ggfw_ggjyfwjg_valid")
public class CgGgfwGgjyfwjgValid  implements java.io.Serializable{

	private static final long serialVersionUID = 5454155825314635342L;

	//columns START
	//
	private java.lang.String id;
	//
	private java.lang.String hashUnique;
	//
	private java.lang.String frwybs;
	//
	private java.lang.String dwmc;
	//
	private java.lang.String tyshxydm;
	//
	private java.lang.String zzjgdm;
	//
	private java.lang.String dz;
	//
	private java.lang.String dh;
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

	public void setDwmc(java.lang.String value) {
		this.dwmc = value;
	}

	public java.lang.String getDwmc() {
		return this.dwmc;
	}

	public void setTyshxydm(java.lang.String value) {
		this.tyshxydm = value;
	}

	public java.lang.String getTyshxydm() {
		return this.tyshxydm;
	}

	public void setZzjgdm(java.lang.String value) {
		this.zzjgdm = value;
	}

	public java.lang.String getZzjgdm() {
		return this.zzjgdm;
	}

	public void setDz(java.lang.String value) {
		this.dz = value;
	}

	public java.lang.String getDz() {
		return this.dz;
	}

	public void setDh(java.lang.String value) {
		this.dh = value;
	}

	public java.lang.String getDh() {
		return this.dh;
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

