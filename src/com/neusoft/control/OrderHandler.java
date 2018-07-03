package com.neusoft.control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.po.Order;
import com.neusoft.service.OrderService;
import com.neusoft.vo.OrderVo;

@Controller
public class OrderHandler {
	
	OrderService service;
	
	
	
	@RequestMapping(value="/test/OrderHandler_findAllOrder")
	@ResponseBody
	public List<Order> findAllOrder() {
		
		List<Order> list = new ArrayList<Order>();
		try {
			list = service.findAllOrder();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return list;
		
	}
	@RequestMapping(value="/test/OrderHandler_findOrder")
	@ResponseBody
	public List<Order> findOrder(int oid,String status,Date beginDate,Date endDate,int qid){
		OrderVo vo = new OrderVo(oid,qid,status,beginDate,endDate);
		List<Order> list = new ArrayList<Order>();
		try {
			list = service.findOrder(vo);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return list;
		
		
	}
	
	@RequestMapping(value="/test/OrderHandler_updateOrder")
	@ResponseBody
	public String updateOrder(int oid,String status){
		OrderVo vo  = new OrderVo(oid,status);
		try {
			if(service.updateOrder(vo)) return "{\"result\":true}";
			else return "{\"result\":false}";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return  "{\"result\":false}";
		}
			
		
		
	}
	
	

}
