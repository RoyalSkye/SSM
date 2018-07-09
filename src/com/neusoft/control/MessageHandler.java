package com.neusoft.control;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Message;
import com.neusoft.po.Messagereply;
import com.neusoft.po.Swiper;
import com.neusoft.service.MessageService;
import com.neusoft.service.SwiperService;
import com.neusoft.tools.FileTools;

@Controller
public class MessageHandler {

	@Autowired
	private MessageService messageService;
	@Autowired
	private SwiperService swiperService;
	
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
	
	@RequestMapping(value="/test/MessageHandler_findimgurl")
	@ResponseBody
	public String findimgurl(HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		int qid=(int)session.getAttribute("qid");
		String imgurl="/upload/"+messageService.findimgurl(qid).getImgurl();
		return imgurl;
	}
	
	@RequestMapping(value="/test/MessageHandler_saveimg")
	@ResponseBody
	public String saveimg(MultipartFile file,HttpServletRequest request) throws Exception{
		if(file==null){
			System.out.println("文件为空");
			return "{\"result\":false}";
		}
		String url=FileTools.saveimg(file,request);
		//System.out.println("---------------------url:"+url);
		if(url==null||url==""){
			return "{\"result\":false}";
		}else{
			//result="../upload/15307951697841.jpg";
			//System.out.println("{\"result\":true,\"imgurl\":\""+url+"\"}");
			return "{\"result\":true,\"imgurl\":\""+url+"\"}";
		}
	}
	
	@RequestMapping(value="/test/MessageHandler_saveswiperimg")
	@ResponseBody
	public String saveswiperimg(MultipartFile file,HttpServletRequest request) throws Exception{
		if(file==null){
			System.out.println("文件为空");
			return "{\"result\":false}";
		}
		String url=FileTools.saveimg(file,request);
		if(url==null||url==""){
			return "{\"result\":false}";
		}else{
			HttpSession session=request.getSession();
			int qid=(int)session.getAttribute("qid");
			Swiper swiper=new Swiper();
			swiper.setCategory("D");
			swiper.setQid(qid);
			String imgurl=url.substring(10);
			swiper.setImgurl(imgurl);
			if(swiperService.updateSwiper(swiper)){
				return "{\"result\":true,\"imgurl\":\""+url+"\"}";
			}else{
				return "{\"result\":false}";
			}
		}
	}
	
}
