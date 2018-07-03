package com.neusoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.neusoft.mapper.MessageMapper;
import com.neusoft.po.Message;
import com.neusoft.po.Messagereply;
import com.neusoft.service.MessageService;

public class MessageServiceBean implements MessageService {
	
	@Autowired
	MessageMapper mapper;
	
	@Override
	public List<Message> findAllMessage() throws Exception {

		return mapper.findAllMessage();
	}

	@Override
	public List<Messagereply> findAllMessagereply() throws Exception {
		
		return mapper.findAllMessagereply();
	}

	@Override
	public boolean updateMessage(Message message) throws Exception {
		
		return mapper.updateMessage(message);
	}

	@Override
	public boolean deleteMessage(int mid) throws Exception {
		
		return mapper.deleteMessage(mid);
	}

	@Override
	public boolean deleteMessagereply(int id) throws Exception {
		
		return mapper.deleteMessagereply(id);
	}

}
