package com.neusoft.mapper;

import java.util.List;

import com.neusoft.po.Refund;

public interface RefundMapper {
    int deleteById(Integer oid);

    int insert(Refund record);

    int insertSelective(Refund record);

    Refund selectById(Integer oid);

    int updateByIdSelective(Refund record);

    int updateById(Refund record);
    
    
    Refund findById(Integer oid);

	List<Refund> findAllRefund(int qid);
}