package com.neusoft.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.OrderMapper;
import com.neusoft.po.Order;
import com.neusoft.service.OrderService;
import com.neusoft.tools.Page;

@Service
public class OrderServiceBean implements OrderService {

	@Autowired
	private OrderMapper mapper;
	
	@Override
	public List<Order> findAllOrder(Page page) throws Exception {
		return mapper.findAllOrder(page);
	}

	@Override
	public List<Order> findOrder(Map map) throws Exception {
		return mapper.findOrder(map);
	}

	@Override
	public boolean updateOrder(Order order) throws Exception {
		boolean isok=false;
		int result=mapper.updateOrder(order);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public List<Order> findAllOrderByPhone(String phone) throws Exception {
		return mapper.findAllOrderByPhone(phone);
	}

	@Override
	public boolean saveOrder(Order order) throws Exception {
		boolean isok=false;
		int result=mapper.saveOrder(order);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}
	
	@Override
	public int findCount(int qid) throws Exception {
		return mapper.findCount(qid);
	}

	@Override
	public int findCountByCondition(Map map) throws Exception {
		return mapper.findCountByCondition(map);
	}
}
