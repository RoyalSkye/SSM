package com.neusoft.control;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Lesson;
import com.neusoft.service.LessonService;
import com.neusoft.tools.FileTools;

@Controller
public class LessonHandler {
	
	@Autowired
	private LessonService lessonService;
	
	@RequestMapping(value="/test/LessonHandler_findAllLesson")
	@ResponseBody
	public List<Lesson> findAllLesson(int qid) throws Exception{
		return lessonService.findAllLesson(qid);
	}
	
	@RequestMapping(value="/test/LessonHandler_findLessonById")
	@ResponseBody
	public Lesson findLessonById(int lid) throws Exception{
		return lessonService.findLessonById(lid);
	}
	
	@RequestMapping(value="/test/LessonHandler_deleteLessonById")
	@ResponseBody
	public String deleteLessonById(int lid) throws Exception{
		if(lessonService.deleteLessonById(lid)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/LessonHandler_saveLesson")
	@ResponseBody
	public String saveLesson(Lesson lesson) throws Exception{
		if(lessonService.saveLesson(lesson)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/LessonHandler_updateLesson")
	@ResponseBody
	public String updateLesson(Lesson lesson) throws Exception{
		if(lessonService.updateLesson(lesson)){
			return "{\"result\":true}";
		}else{
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/LessonHandler_saveimg")
	@ResponseBody
	public String saveimg(MultipartFile file,HttpServletRequest request) throws Exception{
		if(file==null){
			System.out.println("ÎÄ¼þÎª¿Õ");
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
	
}


