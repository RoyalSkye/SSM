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
import com.neusoft.service.FreelistenService;

@Controller
public class FreelistenHandler {
	
	@Autowired
	private FreelistenService freelistenService;
	
	@RequestMapping(value="/test/FreelistenHandler_findAllFreelisten")
	@ResponseBody
	public List<Freelisten> findAllTeacher(int qid) throws Exception{
		return freelistenService.findAllFreelisten(qid);
	}
	
	@RequestMapping(value="/test/FreelistenHandler_findFreelistenById")
	@ResponseBody
	public Freelisten findFreelistenById(int fid) throws Exception{
		return freelistenService.findFreelistenById(fid);
	}
	
	@RequestMapping(value="/test/FreelistenHandler_deleteFreelistenById")
	@ResponseBody
	public String deleteFreelistenById(int fid) throws Exception{
		if(freelistenService.deleteFreelistenById(fid)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/FreelistenHandler_saveFreelisten")
	@ResponseBody
	public String saveFreelisten(Freelisten freelisten) throws Exception{
		if(freelistenService.saveFreelisten(freelisten)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/FreelistenHandler_updateFreelisten")
	@ResponseBody
	public String updateFreelisten(Freelisten freelisten) throws Exception{
		if(freelistenService.updateFreelisten(freelisten)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
}


