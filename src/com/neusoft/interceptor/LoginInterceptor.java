package com.neusoft.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("...LoginInterceptor...afterCompletion()...����֪ͨ...");

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("...LoginInterceptor...postHandle()...����֪ͨ...");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("...LoginInterceptor...preHandle()...ǰ��֪ͨ...");
		HttpSession session=request.getSession();
		boolean isLoginOK=Boolean.parseBoolean((session.getAttribute("isLoginOK")+""));
		//boolean app=Boolean.parseBoolean((session.getAttribute("app")+""));
		//int key=Integer.parseInt((session.getAttribute("key")+""));
		if(isLoginOK){   //(isLoginOK&&(!app)&&(key==1))||(isLoginOK&&app&&(key==1))||((!isLoginOK)&&app&&(key==2))
			System.out.println("��¼�ɹ�");
			System.out.println("session:"+session);
			return true;
		}else{
			System.out.println("����δ��¼�����ȵ�¼");
			System.out.println("session:"+session);
			//request.getRequestDispatcher("/login.html").forward(request, response);
			//response.sendRedirect(request.getContextPath() +"/login.html");
			response.sendRedirect(response.encodeURL("/SSM/login.html"));
			return false;
		}
	}

}
