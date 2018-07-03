package com.neusoft.po;

import java.util.Date;

public class Freelisten {

	private int fid;
	private String title;
	private String imgurl;
	private String fdesc;
	private String status;
	private String qid;
	private String bid;
	private Date pubtime;
	
	
	public Freelisten() {
		super();
	}
	

	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getFdesc() {
		return fdesc;
	}
	public void setFdesc(String fdesc) {
		this.fdesc = fdesc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getQid() {
		return qid;
	}
	public void setQid(String qid) {
		this.qid = qid;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public Date getPubtime() {
		return pubtime;
	}
	public void setPubtime(Date pubtime) {
		this.pubtime = pubtime;
	}
	
	@Override
	public String toString() {
		return "Freelisten [fid=" + fid + ", title=" + title + ", imgurl=" + imgurl + ", fdesc=" + fdesc + ", status="
				+ status + ", qid=" + qid + ", bid=" + bid + ", pubtime=" + pubtime + "]";
	}
}
