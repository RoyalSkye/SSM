package com.neusoft.mapper;

import java.util.Date;
import java.util.List;

import com.neusoft.po.Order;
import com.neusoft.vo.OrderVo;


//log 7.2:退款、订单状态处理。等
public interface OrderMapper {

	public List<Order> findAllOrder() throws Exception;
	public List<Order> findOrder(OrderVo vo) throws Exception;
	public boolean updateOrder(OrderVo vo) throws Exception;

}
