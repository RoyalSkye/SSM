package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Refund;

public interface RefundService {
    int deleteById(Integer oid) throws Exception;

    int insert(Refund record)throws Exception;

    int insertSelective(Refund record)throws Exception;

    Refund selectById(Integer oid)throws Exception;

    int updateByIdSelective(Refund record)throws Exception;

    int updateById(Refund record)throws Exception;
    
    List<Refund> findAllRefund(int qid)throws Exception;
}