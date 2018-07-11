package com.neusoft.mapper;

import java.util.List;
import java.util.Map;

import com.neusoft.po.Lesson;
import com.neusoft.po.LessonBranch;
import com.neusoft.po.Swiper;

public interface LessonMapper {

	public List<Lesson> findAllLesson(int qid) throws Exception;
	public Lesson findLessonById(int lid)throws Exception;
	public int deleteLessonById(int lid)throws Exception;
	public int updateLesson(Lesson lesson)throws Exception;
	public Swiper findimgurl(int qid) throws Exception;
	public int saveLesson(Lesson lesson)throws Exception;
	public int saveLessonbranch(LessonBranch lessonbranch) throws Exception;
	public List<String> selectCategory() throws Exception;
}
	

