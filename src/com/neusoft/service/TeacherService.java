package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Teacher;

public interface TeacherService {
	public List<Teacher> findAllTeacher(int qid) throws Exception;
	public Teacher findTeacherById(int tid) throws Exception;
	public boolean deleteTeacherById(int tid) throws Exception;
	public boolean updateTeacher(Teacher t) throws Exception;
	public boolean saveTeacher(Teacher t) throws Exception;
	
	//public void addPhoto(MultipartFile file,HttpServletRequest request);
}
