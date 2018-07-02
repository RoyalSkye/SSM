package com.neusoft.service;

import java.util.Date;
import java.util.List;

import com.neusoft.po.Lesson;

public interface LessonService {
	
	public List<Lesson> findAllLesson() throws Exception;
	public Lesson findLessonById(int lid) throws Exception;
	public boolean deleteLessonById(int lid) throws Exception;
	public boolean saveLesson(Lesson lesson) throws Exception;
	public boolean updateLesson(Lesson lesson) throws Exception;

}
