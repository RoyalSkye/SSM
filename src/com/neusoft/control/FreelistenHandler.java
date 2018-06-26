package com.neusoft.control;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Freelisten;
import com.neusoft.po.Teacher;
import com.neusoft.service.FreelistenService;
import com.neusoft.service.TeacherService;

@Controller
public class FreelistenHandler {
	
	@Autowired
	private FreelistenService	freelistenService;
	
	@RequestMapping(value="/test/FreelistenHandler_findAllFreelisten")
	@ResponseBody
	public List<Freelisten> findAllTeacher(){
		return freelistenService.findAllFreelisten();
	}
	
	@RequestMapping(value="/test/FreelistenHandler_findFreelistenById")
	@ResponseBody
	public Freelisten findFreelistenById(int fid){
		return freelistenService.findFreelistenById(fid);
	}
	
	
	

	
	@RequestMapping(value="/test/FreelistenHandler_deleteFreelistenById")
	@ResponseBody
	public String deleteFreelistenById(int id){
		String flag = freelistenService.deleteFreelistenById(id)==true?"{\"result\":true}":"{\"result\":false}";
		return flag;
	}
	
	
	@RequestMapping(value="/test/FreelistenHandler_saveFreelisten")
	@ResponseBody
	public String saveFreelisten(int fid,String title,String fdesc,String status,String qid,String bid,Date pubtime,MultipartFile file,HttpServletRequest request){
		String flag = freelistenService.saveFreelisten(fid,title,fdesc,status,qid,bid,pubtime,file,request)==true?"{\"result\":true}":"{\"result\":false}";
		return flag;
	}
	
	
	@RequestMapping(value="/test/FreelistenHandler_updateFreelisten")
	@ResponseBody
	public String updateFreelisten(int fid,String title,String fdesc,String status,String qid,String bid,Date pubtime,MultipartFile file,HttpServletRequest request){
		String flag = freelistenService.updateFreelisten(fid,title,fdesc,status,qid,bid,pubtime,file,request)==true?"{\"result\":true}":"{\"result\":false}";
		return flag;
	}
	

}


