package com.neusoft.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.po.Refund;
import com.neusoft.service.RefundService;
import com.neusoft.tools.FileTools;

@Controller
public class RefundHandler {
	@Autowired
	 private RefundService refundservice ;
	
	@RequestMapping(value="/test/RefundHandler_findAllRefund")
	@ResponseBody
	 public String findAllRefund(int qid)throws Exception{
		return FileTools.addHeader(refundservice.findAllRefund(qid));
	}
	
	@RequestMapping(value="/test/RefundHandler_deleteRefundById")
	@ResponseBody
	public String deleteRefundById(Integer oid) throws Exception{
		String str = refundservice.deleteById(oid)>0?"{\"result\":true}":"{\"result\":false}";
		return str;
	}
	@RequestMapping(value="/test/RefundHandler_insertRefund")
	@ResponseBody
	public String insert(Refund record)throws Exception{
		String str = refundservice.insert(record)>0?"{\"result\":true}":"{\"result\":false}";
		return str;
	}
	@RequestMapping(value="/test/RefundHandler_ insertSelective")
	@ResponseBody
	public String insertSelective(Refund record)throws Exception{
		String str = refundservice.insertSelective(record)>0?"{\"result\":true}":"{\"result\":false}";
		return str;
	}
		@RequestMapping(value="/test/RefundHandler_ findRefundById")
		@ResponseBody
	   public Refund findRefundById(Integer oid)throws Exception{
			return refundservice.selectById(oid);
		}
		@RequestMapping(value="/test/RefundHandler_ updateByIdSelective")
		@ResponseBody
	    public String updateByIdSelective(Refund record) throws Exception{
			String str = refundservice.updateByIdSelective(record)>0?"{\"result\":true}":"{\"result\":false}";
			return str;
	    }
		@RequestMapping(value="/test/RefundHandler_ updateById")
		@ResponseBody
	    public String updateById(Refund record)throws Exception{
			String str = refundservice.updateById(record)>0?"{\"result\":true}":"{\"result\":false}";
			return str;
			
		}
	    
	   
}
