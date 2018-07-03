package com.neusoft.po;

import java.util.Date;

public class Messagelike {

	
	private int id;
	private int mid;
	private String nickname;
	private Date stime;
	
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
	@Override
	public String toString() {
		return "Messagelike [id=" + id + ", mid=" + mid + ", nickname=" + nickname + ", stime=" + stime + "]";
	}
}
