package com.neusoft.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Branch;
import com.neusoft.po.Teacher;

public interface TeacherService {
	public List<Teacher> findAllTeacher();
	public Teacher findTeacherById(int tid);
	public boolean deleteTeacherById(int tid);
	public boolean updateTeacher(Teacher t);
	public boolean saveTeacher(Teacher t);
	
	//public void addPhoto(MultipartFile file,HttpServletRequest request);
}
