package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.FreelistenMapper;
import com.neusoft.mapper.LessonMapper;
import com.neusoft.po.Lesson;
import com.neusoft.service.LessonService;

@Service
public class LessonServiceBean implements LessonService {

	@Autowired
	private LessonMapper mapper;
	
	@Override
	public List<Lesson> findAllLesson() throws Exception {
		return mapper.findAllLesson();
	}

	@Override
	public Lesson findLessonById(int lid) throws Exception {
		return mapper.findLessonById(lid);
	}

	@Override
	public boolean deleteLessonById(int lid) throws Exception {
		boolean isok=false;
		int result=mapper.deleteLessonById(lid);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public boolean saveLesson(Lesson lesson) throws Exception {
		boolean isok=false;
		int result=mapper.saveLesson(lesson);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public boolean updateLesson(Lesson lesson) throws Exception {
		boolean isok=false;
		int result=mapper.updateLesson(lesson);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

}
