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
import com.neusoft.po.Order;
import com.neusoft.service.OrderService;
import com.neusoft.tools.FileTools;
import com.neusoft.tools.Page;

@Controller
public class OrderHandler {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/test/OrderHandler_findAllOrder")
	@ResponseBody
	public String findAllOrder(HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		Page page = new Page((int)session.getAttribute("limit"),(int)session.getAttribute("page"),(int)session.getAttribute("qid"));
		page.setTotalPage(orderService.findCount(page.getId()));
		return FileTools.addHeader(orderService.findAllOrder(page),page.getTotalPage());
	}
	
	
	
	@RequestMapping(value="/test/OrderHandler_findOrder")
	@ResponseBody
	public String findOrder(HttpServletRequest request) throws Exception{
		Map<String,Object> map=new HashMap<String,Object>();
		HttpSession session = request.getSession();
		String oid=request.getParameter("oid");
		String status=request.getParameter("status");
		String starttime=request.getParameter("starttime");
		String endtime=request.getParameter("endtime");
		String qid = request.getParameter("qid");
		Page page = new Page((int)session.getAttribute("limit"),(int)session.getAttribute("currentPage"));
		page.setTotalPage(orderService.findCount(Integer.parseInt(qid)));
		map.put("oid", oid);
		map.put("status", status);
		map.put("starttime", starttime);
		map.put("endtime", endtime);
		map.put("qid", qid);
		map.put("minNum", page.getMinNum());
		map.put("quantity", page.getQuantity());
		return FileTools.addHeader(orderService.findOrder(map),page.getTotalPage());
	}
	
	@RequestMapping(value="/test/OrderHandler_updateOrder")
	@ResponseBody
	public String updateOrder(Order order) throws Exception{
		if(orderService.updateOrder(order)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/OrderHandler_findAllOrderByPhone")
	@ResponseBody
	public List<Order> findAllOrderByPhone(HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		String phone=(String)session.getAttribute("phone");
		return orderService.findAllOrderByPhone(phone);
	}

	@RequestMapping(value="/test/OrderHandler_saveOrder")
	@ResponseBody
	public String saveOrder(Order order,HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		String phone=(String)session.getAttribute("phone");
		order.setOpenid(phone);
		Date date=new Date();
		SimpleDateFormat ft =new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		order.setOrdertime(ft.format(date));
		int qid=(int)session.getAttribute("qid");
		order.setQid(qid);
		String transactionid=System.currentTimeMillis()+"";
		order.setTransactionid(transactionid);
		System.out.println("transactionid"+transactionid+"test");
		order.setStatus("´ý¸¶¿î");
		order.setActual(0);
		if(orderService.saveOrder(order)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
}
