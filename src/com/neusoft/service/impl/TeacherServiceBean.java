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
	public List<Teacher> findAllTeacher() {
		try {
			return mapper.findAllTeacher();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Teacher findTeacherById(int tid) {
		try {
			return mapper.findTeacherById(tid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteTeacherById(int tid) {
		boolean isok=false;
		try {
			int result=mapper.deleteTeacherById(tid);
			if(result>0){
				isok=true;
			}else{
				isok=false;
			}
		} catch (Exception e) {
			isok=false;
			e.printStackTrace();
		}
		return isok;
	}

	@Override
	public boolean updateTeacher(Teacher t) {
		boolean isok=false;
		try {
			int result=mapper.updateTeacher(t);
			if(result>0){
				isok=true;
			}else{
				isok=false;
			}
		} catch (Exception e) {
			isok=false;
			e.printStackTrace();
		}
		return isok;
	}

	@Override
	public boolean saveTeacher(Teacher t) {
		boolean isok=false;
		try {
			int result=mapper.saveTeacher(t);
			if(result>0){
				isok=true;
			}else{
				isok=false;
			}
		} catch (Exception e) {
			isok=false;
			e.printStackTrace();
		}
		return isok;
	}

}
