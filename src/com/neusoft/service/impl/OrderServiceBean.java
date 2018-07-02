package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.mapper.OrderMapper;
import com.neusoft.po.Order;
import com.neusoft.service.OrderService;
import com.neusoft.vo.OrderVo;

public class OrderServiceBean implements OrderService {

	@Autowired
	OrderMapper mapper;
	
	@Override
	public List<Order> findAllOrder() throws Exception {
		return mapper.findAllOrder();
	}

	@Override
	public List<Order> findOrder(OrderVo vo) throws Exception {
		return mapper.findOrder(vo);
	}

	@Override
	public boolean updateOrder(OrderVo vo) throws Exception {
		
		return mapper.updateOrder(vo);
	}

}
