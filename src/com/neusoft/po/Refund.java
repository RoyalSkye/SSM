package com.neusoft.po;

import java.util.Date;

public class Refund {

	private int oid;
	private String refundreason;
	private Date refundtime;
	private String status;
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getRefundreason() {
		return refundreason;
	}
	public void setRefundreason(String refundreason) {
		this.refundreason = refundreason;
	}
	public Date getRefundtime() {
		return refundtime;
	}
	public void setRefundtime(Date refundtime) {
		this.refundtime = refundtime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Refund [oid=" + oid + ", refundreason=" + refundreason + ", refundtime=" + refundtime + ", status="
				+ status + "]";
	}
}
