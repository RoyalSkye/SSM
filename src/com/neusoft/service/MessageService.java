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
	
	//public boolean updateIndexphoto():�Ƿ�Ҫ����ҳ��Ƭ�浽ĳ����ַ��
	/*public List<Messagelike> findAllMessagelike() throws Exception; ��ǰ�˹�������������
	  public boolean saveMessagelike(Message) ǰ����Ҫ
	  public boolean saveMessagereply(Messagereply) ǰ����Ҫ 
	*/
}
