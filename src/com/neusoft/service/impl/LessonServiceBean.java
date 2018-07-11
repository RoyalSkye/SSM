package com.neusoft.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.FreelistenMapper;
import com.neusoft.mapper.LessonMapper;
import com.neusoft.po.Lesson;
import com.neusoft.po.LessonBranch;
import com.neusoft.po.Swiper;
import com.neusoft.service.LessonService;

@Service
public class LessonServiceBean implements LessonService {

	@Autowired
	private LessonMapper mapper;
	
	@Override
	public List<Lesson> findAllLesson(int qid) throws Exception {
		return mapper.findAllLesson(qid);
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
			LessonBranch lessonbranch=new LessonBranch();
			lessonbranch.setBid(5);
			mapper.saveLessonbranch(lessonbranch);
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

	@Override
	public Swiper findimgurl(int qid) throws Exception {
		return mapper.findimgurl(qid);
	}

	@Override
	public List<String> selectCategory() throws Exception {
		return mapper.selectCategory();
	}

}
