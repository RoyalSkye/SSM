package com.neusoft.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class GlobalExceptionResolver implements HandlerExceptionResolver {

	//����һ����־����
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionResolver.class);
	
	/**
	 * ȫ���쳣������ͨ�����ajax����Ĵ���Ҫ����
	 */
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object arg2,
			Exception ex) {
		//1.��¼������־
		logger.info("ϵͳ�쳣info");
		logger.error("ϵͳ�쳣", ex);
		if (!(request.getHeader("accept").indexOf("application/json") > -1 || (request  
                .getHeader("X-Requested-With")!= null && request  
                .getHeader("X-Requested-With").indexOf("XMLHttpRequest") > -1))) {  
            // ��������첽����  
        	ModelAndView mav = new ModelAndView();
    		//mav.setViewName("/error.html");
    		return mav; 
        } else {  
            try {  
            	// ������һ���ַ���
                PrintWriter writer = response.getWriter();  
                writer.write(ex.getMessage());  
                writer.flush();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
            return null;   
        }
		
	
		/**
		 * if(ajax)
		 * {
		 * 	response��Ӧ
		 * }else{
		 * 	��ת��ȫ���쳣ҳ
		 * }
		 */
		//ModelAndView mav=new ModelAndView();
		/**
		 * ����·��:
		 * 
		 * ��̨����:
		 * ����ת��: /   http://ip:port/projectname/
		 * �����ض���: /  http://ip:port/
		 * 
		 * ǰ̨����(html,jsp):
		 * 		/  http://ip:port/
		 * 
		 */
		//mav.setViewName("/globalerror.html");
		//return null;  dataType:json�ַ���ת�ɶ��� NumberFormatException:"S" �޷�ת��json�ַ���������ajax��error��
	}
}
