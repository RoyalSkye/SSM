package com.neusoft.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.mapper.BranchMapper;
import com.neusoft.mapper.FreelistenMapper;
import com.neusoft.po.Freelisten;
import com.neusoft.service.FreelistenService;
import com.neusoft.tools.Tools;

public class FreelistenServiceBean implements FreelistenService {

	@Autowired
	private FreelistenMapper mapper;
	

	@Override
	public Freelisten findFreelistenById(int fid) {
		try {
			return mapper.findFreelistenById(fid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteFreelistenById(int fid) {
		boolean  flag = false;
		try {
			flag = (mapper.deleteFreelistenById(fid)>0)?true:false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean saveFreelisten(int fid,String title,String fdesc,String status,String qid,String bid,Date pubtime,MultipartFile file,HttpServletRequest request) {
		boolean flag;
		try {
			flag = mapper.saveFreelisten(new Freelisten(fid,title,Tools.upload(file, request),fdesc,status,qid,bid,pubtime))>0?true:false;
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		} 
		return flag;
	}
	


	
	public boolean updateFreelisten(int fid,String title,String fdesc,String status,String qid,String bid,Date pubtime,MultipartFile file,HttpServletRequest request) {
		boolean flag;
		try {
			flag = mapper.updateFreelisten(new Freelisten(fid,title,Tools.upload(file, request),fdesc,status,qid,bid,pubtime))>0?true:false;
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		} 
		return flag;
	}

	@Override
	public List<Freelisten> findAllFreelisten(){
		List<Freelisten> list = new ArrayList<Freelisten>();
		try {
			list = mapper.findAllFreelisten();
			return list;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
