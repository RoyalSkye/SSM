package com.neusoft.control;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.po.Freelistenbook;
import com.neusoft.service.FreelistenbookService;
import com.neusoft.service.impl.FreelistenbookServiceBean;
import com.neusoft.tools.FileTools;
import com.neusoft.tools.Page;

@Controller
public class FreelistenbookHandler {
	
	@Autowired
	private FreelistenbookService freelistenbookService;
	
	@RequestMapping(value="/test/FreelistenbookHandler_findAllFreelistenbook")
	@ResponseBody
	public String findAllFreelistenbook(HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		Page page = new Page((int)session.getAttribute("limit"),(int)session.getAttribute("page"),(int)session.getAttribute("bid"));
		page.setTotalPage(freelistenbookService.findCount(page.getId()));
		return FileTools.addHeader(freelistenbookService.findAllFreelistenbook(page), page.getTotalPage());
	}
	
	@RequestMapping(value="/test/FreelistenbookHandler_findFreelistenbook")
	@ResponseBody
	public String findFreelistenbook(HttpServletRequest request) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		String fid=request.getParameter("fid");
		String cname=request.getParameter("cname");
		String starttime=request.getParameter("starttime");
		String endtime=request.getParameter("endtime");
		String qid=request.getParameter("qid");
		HttpSession session=request.getSession();
		Page page = new Page((int)session.getAttribute("limit"),(int)session.getAttribute("currentPage"));
		map.put("fid", fid);
		map.put("cname", cname);
		map.put("starttime", starttime);
		map.put("endtime", endtime);
		map.put("qid",qid);
		map.put("minNum", page.getMinNum());
		map.put("maxNum", page.getMaxNum());
		return FileTools.addHeader(freelistenbookService.findFreelistenbook(map),page.getTotalPage());
	}
	
	@RequestMapping(value="/test/FreelistenbookHandler_updateFreelistenbook")
	@ResponseBody
	public String updateFreelistenbook(Freelistenbook freelistenbook) throws Exception{
		freelistenbook.setStatus("已处理");
		if(freelistenbookService.updateFreelistenbook(freelistenbook)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/FreelistenbookHandler_saveFreelistenbook")
	@ResponseBody
	public String saveFreelistenbook(Freelistenbook freelistenbook,HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		String phone=(String)session.getAttribute("phone");
		freelistenbook.setStatus("待处理");
		freelistenbook.setOpenid(phone);
		Date date=new Date();
		SimpleDateFormat ft =new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		freelistenbook.setBooktime(ft.format(date));
		if(freelistenbookService.saveFreelistenbook(freelistenbook)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}

}
