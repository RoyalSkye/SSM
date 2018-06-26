package com.neusoft.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Teacher;
import com.neusoft.service.TeacherService;

public class TeacherServiceBean implements TeacherService {

	@Override
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addPhoto(MultipartFile file, HttpServletRequest request) {
		// TODO Auto-generated method stub

	}

}
