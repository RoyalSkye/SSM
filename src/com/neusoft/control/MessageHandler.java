package com.neusoft.control;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Message;
import com.neusoft.po.Messagereply;
import com.neusoft.service.MessageService;
import com.neusoft.tools.FileTools;

@Controller
public class MessageHandler {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping(value="/test/MessageHandler_findAllMessage")
	@ResponseBody
	public List<Message> findAllMessage(int qid) throws Exception{
		return messageService.findAllMessage(qid);
	}
	
	@RequestMapping(value="/test/MessageHandler_findMessageById")
	@ResponseBody
	public Message findMessageById(int mid) throws Exception{
		return messageService.findMessageById(mid);
	}
	
	@RequestMapping(value="/test/MessageHandler_updateMessage")
	@ResponseBody
	public String updateMessage(Message message) throws Exception{
		if(messageService.updateMessage(message)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/MessageHandler_deleteMessage")
	@ResponseBody
	public String deleteMessage(int mid) throws Exception{
		if(messageService.deleteMessage(mid)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/MessageHandler_findMessagereplyById")
	@ResponseBody
	public List<Messagereply> findMessagereplyById(int mid) throws Exception{
		return messageService.findMessagereplyById(mid);
	}
	
	@RequestMapping(value="/test/MessageHandler_deleteMessagereply")
	@ResponseBody
	public String deleteMessagereply(int id) throws Exception{
		if(messageService.deleteMessagereply(id)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/MessageHandler_saveimg")
	@ResponseBody
	public String saveimg(MultipartFile file,HttpServletRequest request) throws Exception{
		if(file==null){
			System.out.println("�ļ�Ϊ��");
			return "{\"result\":false}";
		}
		String url=FileTools.saveimg(file,request);
		System.out.println("---------------------url:"+url);
		if(url==null||url==""){
			return "{\"result\":false}";
		}else{
			return "{\"result\":true}";
		}
	}
	
}
