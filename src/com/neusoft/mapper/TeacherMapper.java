package com.neusoft.mapper;

import java.util.List;

import com.neusoft.po.Swiper;
import com.neusoft.po.Teacher;

public interface TeacherMapper {
	
	public List<Teacher> findAllTeacher(int qid) throws Exception;
	public Teacher findTeacherById(int tid) throws Exception;
	public int saveTeacher(Teacher t) throws Exception;
	public int deleteTeacherById(int tid) throws Exception;
	public int updateTeacher(Teacher t) throws Exception;
	public Swiper findimgurl(int qid) throws Exception;
}
