package com.neusoft.tools;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;

public class FileTools {
	
	public static String saveimg(MultipartFile upload,HttpServletRequest request){
		String url=null;
		//1.�ļ��ϴ�
		//1.1 ������ ʱ���+�ļ���/UUID+�ļ���  ʱ���:��ǰϵͳʱ�����1970��ʱ��ԭ���ܵĺ�����
		String filename=System.currentTimeMillis()+upload.getOriginalFilename();
		//1.2 �ļ�������ǰ���̵�ͬ��Ŀ¼��
		String path=request.getServletContext().getRealPath("/");
		File f =new File(path);
		String ppath=f.getParent();
		//1.3 ��ʱ�ļ�������Ŀ���ַ�� '/'�κβ���ϵͳ����ʶ
		File dest=new File(ppath+"/upload",filename);
		try {
			upload.transferTo(dest);
			url="../upload/"+filename;
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return url;
	}
	
	public static String addHeader(Object obj,int count) {
		Gson gson = new Gson();
		String str = " {\"code\":0,\"msg\":\"\",\"count\":"+count+",\"data\":"+(gson.toJson(obj))+"}";
		System.out.println("str:"+str);
		return str;
	}
	
	
}