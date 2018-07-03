package com.neusoft.control;

import java.util.ArrayList;
import java.util.List;

import com.neusoft.po.Message;
import com.neusoft.po.Messagereply;
import com.neusoft.service.MessageService;

public class MessageHandler {

	MessageService service;
	
	public List<Message>  findAllMessage() {
		List<Message> list = new ArrayList();
		
		try {
			list = service.findAllMessage();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	public List<Messagereply> findAllMessagereply() {
		List<Messagereply> list = new ArrayList();
		
		try {
			list = service.findAllMessagereply();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public String updateMessage(Message message) {
		
		try {
			if(service.updateMessage(message)) return "{\"result\":true}";
			else return "{\"result\":false}";
		} catch (Exception e) {
			
			e.printStackTrace();
			return  "{\"result\":false}";
		}
	}
	
	public String deleteMessage(int mid) {
		
		try {
			if(service.deleteMessage(mid)) return "{\"result\":true}";
			else return "{\"result\":false}";
		} catch (Exception e) {
			
			e.printStackTrace();
			return  "{\"result\":false}";
		}
	}
	public String deleteMessagereply(int id){
		try {
			if(service.deleteMessagereply(id)) return "{\"result\":true}";
			else return "{\"result\":false}";
		} catch (Exception e) {
			
			e.printStackTrace();
			return  "{\"result\":false}";
		}
	
}
}
