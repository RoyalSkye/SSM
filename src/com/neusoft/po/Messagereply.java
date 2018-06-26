package com.neusoft.po;

import java.util.Date;

public class Messagereply {

	private int id;
	private int mid;
	private String content;
	private String nickname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Date getStime() {
		return stime;
	}
	public void setStime(Date stime) {
		this.stime = stime;
	}
	private Date stime;
	@Override
	public String toString() {
		return "Messagereply [id=" + id + ", mid=" + mid + ", content=" + content + ", nickname=" + nickname
				+ ", stime=" + stime + "]";
	}
}
