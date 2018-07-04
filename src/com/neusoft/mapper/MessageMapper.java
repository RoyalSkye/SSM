package com.neusoft.mapper;

import java.util.List;

import com.neusoft.po.Message;
import com.neusoft.po.Messagereply;

public interface MessageMapper {
	
	public List<Message> findAllMessage(int qid) throws Exception;
	public Message findMessageById(int mid) throws Exception;
	public int updateMessage(Message message) throws Exception;
	public int deleteMessage(int mid) throws Exception;
	public List<Messagereply> findMessagereplyById(int mid) throws Exception;
	public int deleteMessagereply(int id) throws Exception;
	
	//public boolean updateIndexphoto():是否要把首页照片存到某个地址？
	/*public List<Messagelike> findAllMessagelike() throws Exception; 与前端关联，需多表连接
	  public boolean saveMessagelike(Message) 前端想要
	  public boolean saveMessagereply(Messagereply) 前端需要 
	*/
}
