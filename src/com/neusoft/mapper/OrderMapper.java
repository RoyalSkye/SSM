package com.neusoft.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.neusoft.po.Order;

public interface OrderMapper {

	public List<Order> findAllOrder(int qid) throws Exception;
	public List<Order> findOrder(Map map) throws Exception;  //订单查询 退款处理 订单核销
	public int updateOrder(Order order) throws Exception;
	public List<Order> findAllOrderByPhone(String phone) throws Exception;  //返回一个用户的所有订单
	public int saveOrder(Order order) throws Exception;

}
