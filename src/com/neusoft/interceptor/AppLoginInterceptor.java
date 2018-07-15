package com.neusoft.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AppLoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("...AppLoginInterceptor...afterCompletion()...����֪ͨ...");

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("...AppLoginInterceptor...postHandle()...����֪ͨ...");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("...AppLoginInterceptor...preHandle()...ǰ��֪ͨ...");
		HttpSession session=request.getSession();
		boolean app=Boolean.parseBoolean((session.getAttribute("app")+""));
		if(app){
			System.out.println("��¼�ɹ�");
			System.out.println("session:"+session);
			return true;
		}else{
			System.out.println("����δ��¼�����ȵ�¼");
			System.out.println("session:"+session);
			//request.getRequestDispatcher("/SSM/build/index.html#/login").forward(request, response);
			//response.sendRedirect(request.getContextPath() +"/login.html");
			response.sendRedirect(response.encodeURL("/SSM/build/index.html#/login"));
			return false;
		}
	}

}
