package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.TeacherMapper;
import com.neusoft.po.Teacher;
import com.neusoft.service.TeacherService;

@Service
public class TeacherServiceBean implements TeacherService {

	@Autowired
	private TeacherMapper mapper;
	
	@Override
	public List<Teacher> findAllTeacher() throws Exception{
		return mapper.findAllTeacher();
	}

	@Override
	public Teacher findTeacherById(int tid) throws Exception{
		return mapper.findTeacherById(tid);
	}

	@Override
	public boolean deleteTeacherById(int tid) throws Exception{
		boolean isok=false;
		int result=mapper.deleteTeacherById(tid);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public boolean updateTeacher(Teacher t) throws Exception{
		boolean isok=false;
		int result=mapper.updateTeacher(t);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public boolean saveTeacher(Teacher t) throws Exception{
		boolean isok=false;
		int result=mapper.saveTeacher(t);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

}
