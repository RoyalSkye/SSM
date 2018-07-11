package com.neusoft.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.neusoft.po.Order;
import com.neusoft.tools.Page;

public interface OrderMapper {

	public List<Order> findAllOrder(Page page) throws Exception;
	public List<Order> findOrder(Map map) throws Exception;  //������ѯ �˿�� ��������
	public int updateOrder(Order order) throws Exception;
	public List<Order> findAllOrderByPhone(String phone) throws Exception;  //����һ���û������ж���
	public int saveOrder(Order order) throws Exception;
	public int findCount(int qid) throws Exception;
}
