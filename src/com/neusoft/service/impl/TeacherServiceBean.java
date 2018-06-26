package com.neusoft.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.mapper.BranchMapper;
import com.neusoft.mapper.TeacherMapper;
import com.neusoft.po.Branch;
import com.neusoft.po.Teacher;
import com.neusoft.service.BranchService;
import com.neusoft.service.TeacherService;
import com.neusoft.tools.Tools;

@Service
public class TeacherServiceBean implements TeacherService{

	@Autowired
	private TeacherMapper mapper;
	
	
	@Override
	public List<Teacher> findAll() {
		try {
			return mapper.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public String addTeacher(int tid,String tname,MultipartFile file,String introduction,int qid,HttpServletRequest request) {
		String url = null;
		try {
			url = Tools.upload(file,request);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			mapper.addTeacher(new Teacher(tid,tname,url,introduction,qid));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//error
			return "{\"result\":false}";
		}
		
		//sucess
		return "{\"result\":true}";
	}


	@Override
	public void addPhoto(MultipartFile file,HttpServletRequest request) {
		String url = null;
		try {
			url = Tools.upload(file, request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}