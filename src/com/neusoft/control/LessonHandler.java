package com.neusoft.control;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.neusoft.po.Lesson;
import com.neusoft.po.Swiper;
import com.neusoft.service.LessonService;
import com.neusoft.service.SwiperService;
import com.neusoft.tools.FileTools;
import com.neusoft.tools.Page;

@Controller
public class LessonHandler {
	
	@Autowired
	private LessonService lessonService;
	@Autowired
	private SwiperService swiperService;
	
	@RequestMapping(value="/test/LessonHandler_findAllLesson")
	@ResponseBody
	public String findAllLesson(HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		Page page = new Page((int)session.getAttribute("limit"),(int)session.getAttribute("page"),(int)session.getAttribute("qid"));
		page.setTotalPage(lessonService.findCount(page.getId()));
		return	FileTools.addHeader(lessonService.findAllLesson(page), page.getTotalPage());
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
	public String saveLesson() throws Exception{  //Lesson lesson
		Lesson lesson=new Lesson();
		lesson.setCategory("test");
		lesson.setImgurl("test");
		lesson.setLdesc("test");
		//lesson.setPubtime("test");
		lesson.setLname("test");
		lesson.setLprice(0.01);
		lesson.setQid(1);
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
	
	@RequestMapping(value="/test/LessonHandler_findimgurl")
	@ResponseBody
	public String findimgurl(HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		int qid=(int)session.getAttribute("qid");
		String imgurl="/upload/"+lessonService.findimgurl(qid).getImgurl();
		return imgurl;
	}
	
	@RequestMapping(value="/test/LessonHandler_saveimg")
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
	
	@RequestMapping(value="/test/LessonHandler_saveswiperimg")
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
			swiper.setCategory("C");
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


