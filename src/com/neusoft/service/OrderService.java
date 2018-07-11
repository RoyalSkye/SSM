package com.neusoft.service;

import java.util.List;
import java.util.Map;

import com.neusoft.po.Order;
import com.neusoft.tools.Page;

public interface OrderService {

	public List<Order> findAllOrder(Page page) throws Exception;
	public List<Order> findOrder(Map map) throws Exception;
	public boolean updateOrder(Order order) throws Exception;
	public int findCount(int qid) throws Exception;
}
