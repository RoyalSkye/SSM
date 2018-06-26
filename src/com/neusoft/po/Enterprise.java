package com.neusoft.po;

public class Enterprise {
 
	private int qid;
	private String name;
	private String videopath;
	private String inrtoduction;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVideopath() {
		return videopath;
	}
	public void setVideopath(String videopath) {
		this.videopath = videopath;
	}
	public String getInrtoduction() {
		return inrtoduction;
	}
	public void setInrtoduction(String inrtoduction) {
		this.inrtoduction = inrtoduction;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	private String text;
	@Override
	public String toString() {
		return "Enterprise [qid=" + qid + ", name=" + name + ", videopath=" + videopath + ", inrtoduction="
				+ inrtoduction + ", text=" + text + "]";
	}
}
