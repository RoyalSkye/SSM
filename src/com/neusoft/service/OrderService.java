package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Order;
import com.neusoft.vo.OrderVo;

public interface OrderService {

	public List<Order> findAllOrder() throws Exception;
	public List<Order> findOrder(OrderVo vo) throws Exception;
	public boolean updateOrder(OrderVo vo) throws Exception;
}
