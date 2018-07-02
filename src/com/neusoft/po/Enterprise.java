package com.neusoft.po;

public class Enterprise {
 
	private int qid;
	private String name;
	private String videopath;
	private String introduction;
	private String text;
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
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Enterprise [qid=" + qid + ", name=" + name + ", videopath=" + videopath + ", inrtoduction="
				+ introduction + ", text=" + text + "]";
	}
	public Enterprise(int qid, String name, String videopath, String inrtoduction, String text) {
		super();
		this.qid = qid;
		this.name = name;
		this.videopath = videopath;
		this.introduction = inrtoduction;
		this.text = text;
	}
}
