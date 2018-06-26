package com.neusoft.po;

import java.util.Date;

public class Message {

	private int mid;
	private String mtitle;
	private Date mtime;
	private int qid;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMtitle() {
		return mtitle;
	}
	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}
	public Date getMtime() {
		return mtime;
	}
	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	@Override
	public String toString() {
		return "Message [mid=" + mid + ", mtitle=" + mtitle + ", mtime=" + mtime + ", qid=" + qid + "]";
	}
}
