package com.neusoft.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.OrderMapper;
import com.neusoft.mapper.RefundMapper;
import com.neusoft.po.Order;
import com.neusoft.po.Refund;
import com.neusoft.service.RefundService;

@Service
public class RefundServiceBean  implements RefundService{
	
	@Autowired
	RefundMapper mapper;
	@Autowired
	private OrderMapper ordermapper;

	@Override
	public boolean saveRefund(Refund refund) throws Exception {
		boolean isok=false;
		int result=mapper.saveRefund(refund);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public boolean updateconfirmRefund(Refund refund) throws Exception {
		boolean isok=false;
		int result=mapper.updateRefundByOid(refund);
		if(result>0){
			isok=true;
			Order order=new Order();
			order.setOid(refund.getOid());
			order.setStatus("已退款");
			if(ordermapper.updateOrder(order)<=0) isok=false;
			//customer表中用户加钱 未写
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public boolean updatedenyRefund(Refund refund) throws Exception {
		boolean isok=false;
		int result=mapper.updateRefundByOid(refund);
		if(result>0){
			isok=true;
			Order order=new Order();
			order.setOid(refund.getOid());
			order.setStatus("已付款");
			if(ordermapper.updateOrder(order)<=0) isok=false;
		}else{
			isok=false;
		}
		return isok;
	}
	
}
