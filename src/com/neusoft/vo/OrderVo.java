package com.neusoft.vo;

import java.util.Date;

public class OrderVo {

	public int oid;
	public String status;
	public Date beginDate;
	public Date endDate;
	public int qid;
	
	
	public OrderVo(int oid, String status) {
		super();
		this.oid = oid;
		this.status = status;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public OrderVo(int qid,int oid, String status, Date beginDate, Date endDate) {
		super();
		this.qid = qid;
		this.oid = oid;
		this.status = status;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getBeginDate() {
		return beginDate;
	}
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}
