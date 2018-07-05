package com.neusoft.tools;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileTools {

	/*public static String saveimg(MultipartFile upload,HttpServletRequest request){
		String url=null;
		//1.�ļ��ϴ�
		//1.1 ������ ʱ���+�ļ���/UUID+�ļ���  ʱ���:��ǰϵͳʱ�����1970��ʱ��ԭ���ܵĺ�����
		String filename=Long.toString(System.currentTimeMillis());
		 if(null!=upload) filename+=upload.getOriginalFilename();
		//1.2 �ļ�������ǰ���̵�ͬ��Ŀ¼��
		String path=request.getServletContext().getRealPath("/");
		File f =new File(path);
		String ppath=f.getParent();
		//1.3 ��ʱ�ļ�������Ŀ���ַ�� '/'�κβ���ϵͳ����ʶ
		File dest=new File(ppath+"/upload",filename);
		if(upload==null) return "nmsl";
		try {
			upload.transferTo(dest);
			url=dest.getPath();
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return url;
		} catch (IOException e) {
			e.printStackTrace();
			return url;
		}
		return url;
	}*/
	
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
			url=dest.getPath();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return url;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return url;
		}
		return url;
	}
	
}