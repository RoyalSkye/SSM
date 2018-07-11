package com.neusoft.mapper;

import java.util.List;

import com.neusoft.po.Refund;
import com.neusoft.tools.Page;

public interface RefundMapper {
   public int deleteById(Integer oid) throws Exception;

   public int insert(Refund record)throws Exception;;

   public int insertSelective(Refund record)throws Exception;;

   public Refund selectById(Integer oid)throws Exception;;

   public int updateByIdSelective(Refund record)throws Exception;;

   public int updateById(Refund record)throws Exception;;
    
   public Refund findById(Integer oid)throws Exception;;

   public List<Refund> findAllRefund(Page page)throws Exception;
   
   public int findCount(int qid) throws Exception;
}