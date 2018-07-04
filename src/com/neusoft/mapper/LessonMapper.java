package com.neusoft.mapper;

import java.util.List;

import com.neusoft.po.Lesson;

public interface LessonMapper {

	public List<Lesson> findAllLesson(int qid) throws Exception;
	public Lesson findLessonById(int lid)throws Exception;
	public int deleteLessonById(int lid)throws Exception;
	public int saveLesson(Lesson lesson)throws Exception;
	public int updateLesson(Lesson lesson)throws Exception;
}
	

