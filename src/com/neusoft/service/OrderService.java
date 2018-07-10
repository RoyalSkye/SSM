package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.po.Order;

public interface OrderService {

	public List<Order> findAllOrder(int qid) throws Exception;
	public List<Order> findOrder(Map map) throws Exception;
	public boolean updateOrder(Order order) throws Exception;
	public List<Order> findAllOrderByPhone(String phone) throws Exception;
}
