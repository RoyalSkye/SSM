package com.neusoft.control;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Branch;
import com.neusoft.po.Teacher;
import com.neusoft.service.BranchService;
import com.neusoft.service.TeacherService;
import com.neusoft.tools.Tools;

@Controller
public class TeacherHandler {

	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping(value="/test/TeacherHandler_findAll")
	@ResponseBody
	public List<Teacher> findAll(HttpServletRequest request){
		return teacherService.findAll();
	}
	
	@RequestMapping(value="/test/TeacherHandler_add")
	@ResponseBody
	public String addTeacher(int tid,String tname,MultipartFile file,String introduction,int qid,HttpServletRequest request)
	{
			return teacherService.addTeacher(tid, tname, file, introduction, qid, request);
	}
	
	
	public void addPhoto(MultipartFile file,HttpServletRequest request){
			teacherService.addPhoto(file,request);
	}

}

