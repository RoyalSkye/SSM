package com.neusoft.service;

import java.util.List;

import com.neusoft.po.Message;
import com.neusoft.po.Messagereply;

public interface MessageService {

	

	public List<Message>  findAllMessage() throws Exception;
	public List<Messagereply> findAllMessagereply() throws Exception;
	public boolean updateMessage(Message message) throws Exception;
	public boolean deleteMessage(int mid) throws Exception;
	public boolean deleteMessagereply(int id) throws Exception;
	//public boolean updateIndexphoto():是否要把首页照片存到某个地址？
	
	/*public List<Messagelike> findAllMessagelike() throws Exception; 与前端关联，需多表连接
	  public boolean saveMessagelike(Message) 前端想要
	  public boolean saveMessagereply(Messagereply) 前端需要 
	*/
}
