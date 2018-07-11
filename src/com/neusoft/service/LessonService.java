package com.neusoft.service;

import java.util.Date;
import java.util.List;

import com.neusoft.po.Lesson;
import com.neusoft.po.Swiper;
import com.neusoft.tools.Page;

public interface LessonService {
	
	public List<Lesson> findAllLesson(int qid) throws Exception;
	public List<Lesson> findAllLessonByPage(Page page) throws Exception;
	public Lesson findLessonById(int lid) throws Exception;
	public boolean deleteLessonById(int lid) throws Exception;
	public boolean saveLesson(Lesson lesson) throws Exception;
	public boolean updateLesson(Lesson lesson) throws Exception;
	public Swiper findimgurl(int qid) throws Exception;
	public List<String> selectCategory() throws Exception;
	public int findCount(int qid) throws Exception;
}
