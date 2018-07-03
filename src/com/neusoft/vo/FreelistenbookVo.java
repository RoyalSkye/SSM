package com.neusoft.vo;

import java.util.Date;

public class FreelistenbookVo {

	private int id;
	private String cname;
	private String status;
	private Date beginDate;
	private Date endDate;
	
	
	
	public FreelistenbookVo(int id, String cname, String status, Date beginDate, Date endDate) {
		super();
		this.id = id;
		this.cname = cname;
		this.status = status;
		this.beginDate = beginDate;
		this.endDate = endDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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
