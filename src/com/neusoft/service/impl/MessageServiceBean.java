package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.mapper.MessageMapper;
import com.neusoft.po.Message;
import com.neusoft.po.Messagereply;
import com.neusoft.po.Swiper;
import com.neusoft.service.MessageService;
import com.neusoft.tools.Page;

@Service
public class MessageServiceBean implements MessageService {

	@Autowired
	private MessageMapper mapper;
	
	@Override
	public List<Message> findAllMessage(int qid) throws Exception {
		return mapper.findAllMessage(qid);
	}

	@Override
	public Message findMessageById(int mid) throws Exception {
		return mapper.findMessageById(mid);
	}

	@Override
	public boolean updateMessage(Message message) throws Exception {
		boolean isok=false;
		int result=mapper.updateMessage(message);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public boolean deleteMessage(int mid) throws Exception {
		boolean isok=false;
		int result=mapper.deleteMessage(mid);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public List<Messagereply> findMessagereplyById(Page page) throws Exception {
		return mapper.findMessagereplyById(page);
	}

	@Override
	public boolean deleteMessagereply(int id) throws Exception {
		boolean isok=false;
		int result=mapper.deleteMessage(id);
		if(result>0){
			isok=true;
		}else{
			isok=false;
		}
		return isok;
	}

	@Override
	public Swiper findimgurl(int qid) throws Exception {
		return mapper.findimgurl(qid);
	}
	
	
	@Override
	public int findCount(int mid)throws Exception{
		return mapper.findCount(mid);
	}
	

}
