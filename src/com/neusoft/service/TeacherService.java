package com.neusoft.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Branch;
import com.neusoft.po.Teacher;

public interface TeacherService {
	public List<Teacher> findAllTeacher();

	public String addTeacher(int tid,String tname,MultipartFile file,String introduction,int qid,HttpServletRequest request);
	
	public void addPhoto(MultipartFile file,HttpServletRequest request);
}
