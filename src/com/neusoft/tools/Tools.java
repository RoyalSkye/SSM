package com.neusoft.tools;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public  class Tools {

	public static  String upload( MultipartFile upload,HttpServletRequest request) throws Exception
	{
		String url = null;
		//1. 文件上传
		 //1.1. 重命名 时间戳+文件名 UUID+文件名
		String filename = System.currentTimeMillis()+upload.getOriginalFilename();
		 //1.2    文件传到哪 放在当前工程同级目录下
		String path = request.getServletContext().getRealPath("/");
		File f = new File(path);
		String ppath = f.getParent();
		
		 //1.3 临时-》目的
		File dest = new File(ppath+"\\upload",filename);
			upload.transferTo(dest);
			url = dest.getPath();
		
		
		return url;
		
	}
}
