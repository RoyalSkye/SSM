package com.neusoft.po;

import java.util.Date;

public class Refund {
    private Integer oid;

    private String refundreason;

    private Date refundtime;

    private String status;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getRefundreason() {
        return refundreason;
    }

    public void setRefundreason(String refundreason) {
        this.refundreason = refundreason == null ? null : refundreason.trim();
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
        this.status = status == null ? null : status.trim();
    }
}