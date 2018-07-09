package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.RefundMapper;
import com.neusoft.po.Refund;
import com.neusoft.service.RefundService;

@Service
public class RefundServiceBean  implements RefundService{
	
	@Autowired
	RefundMapper mapper ;
	
	@Override
	public int deleteById(Integer oid)throws Exception {
		
		return mapper.deleteById(oid);
	}

	@Override
	public int insert(Refund record) throws Exception{
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Refund record) throws Exception{
		// TODO Auto-generated method stub
		return mapper.insertSelective(record);
	}

	@Override
	public Refund selectById(Integer oid) throws Exception{
		
		return mapper.selectById(oid);
	}

	@Override
	public int updateByIdSelective(Refund record) throws Exception{
		
		return mapper.updateByIdSelective(record);
	}

	@Override
	public int updateById(Refund record)throws Exception {
		return mapper.updateById(record);
	}

	@Override
	public List<Refund> findAllRefund(int qid) throws Exception{
		
		return mapper.findAllRefund(qid);
	}

}
