package com.neusoft.service;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Freelisten;

public interface FreelistenService {

	
	
	
	public List<Freelisten> findAllFreelisten();
	public Freelisten findFreelistenById(int fid);
	public boolean deleteFreelistenById(int id);
	public boolean saveFreelisten(int fid,String title,String fdesc,String status,String qid,String bid,Date pubtime,MultipartFile file,HttpServletRequest request);
	public boolean updateFreelisten(int fid,String title,String fdesc,String status,String qid,String bid,Date pubtime,MultipartFile file,HttpServletRequest request);//Freelisten 
}
