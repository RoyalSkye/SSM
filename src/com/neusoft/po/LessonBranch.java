package com.neusoft.po;

public class LessonBranch {
	int id;
	int qid;
	int bid;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public LessonBranch(int id, int qid, int bid) {
		super();
		this.id = id;
		this.qid = qid;
		this.bid = bid;
	}
	
	public LessonBranch(int qid, int bid) {
		super();
		this.qid = qid;
		this.bid = bid;
	}
	
	public LessonBranch() {
		super();
	}
	
}
