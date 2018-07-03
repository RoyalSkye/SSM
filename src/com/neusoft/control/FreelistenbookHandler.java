package com.neusoft.control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.po.Freelistenbook;
import com.neusoft.service.FreelistenbookService;
import com.neusoft.service.impl.FreelistenbookServiceBean;
import com.neusoft.vo.FreelistenbookVo;

@Controller
public class FreelistenbookHandler {
	
	FreelistenbookService service;
	
	
	
	@RequestMapping(value="/test/FreelistenbookHandler_findAllFreelistenbook")
	@ResponseBody
	public List<Freelistenbook> findAllFreelistenbook() {
		
		List<Freelistenbook> list = new ArrayList<Freelistenbook>();
		try {
			list = service.findAllFreelistenbook();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return list;
		
	}
	
	
	@RequestMapping(value="/test/FreelistenbookHandler_findFreelistenbook")
	@ResponseBody
	public List<Freelistenbook> findFreelistenbook(int id,String cname,String status,Date beginDate,Date endDate){
		FreelistenbookVo vo = new FreelistenbookVo(id,cname,status,beginDate,endDate);
		List<Freelistenbook> list = new ArrayList<Freelistenbook>();
		try {
			list = service.FindFreelistenbook(vo);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return list;
		
		
	}
	
	@RequestMapping(value="/test/FreelistenbookHandler_updateFreelistenbook")
	@ResponseBody
	public String updateFreelistenbook(int id) {
		try {
			if(service.updateFreelistenbook(id)) return "{\"result\":true}";
			else return "{\"result\":false}";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "{\"result\":false}";
		}
			
		
		
	}
	
	

}
