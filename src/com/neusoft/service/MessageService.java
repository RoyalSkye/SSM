package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Message;
import com.neusoft.po.Messagereply;
import com.neusoft.po.Swiper;

public interface MessageService {

	
	public List<Message> findAllMessage(int qid) throws Exception;
	public Message findMessageById(int mid) throws Exception;
	public boolean updateMessage(Message message) throws Exception;
	public boolean deleteMessage(int mid) throws Exception;
	public List<Messagereply> findMessagereplyById(int mid) throws Exception;
	public boolean deleteMessagereply(int id) throws Exception;
	public Swiper findimgurl(int qid) throws Exception;
	
	//public boolean updateIndexphoto():是否要把首页照片存到某个地址？
	/*public List<Messagelike> findAllMessagelike() throws Exception; 与前端关联，需多表连接
	  public boolean saveMessagelike(Message) 前端想要
	  public boolean saveMessagereply(Messagereply) 前端需要 
	*/
}
