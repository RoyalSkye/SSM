package com.neusoft.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AddheaderInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("...MyInterceptor...afterCompletion()...����֪ͨ...");

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("...MyInterceptor...postHandle()...����֪ͨ...");

	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		System.out.println("...MyInterceptor...preHandle()...ǰ��֪ͨ...");
		HttpSession session=request.getSession();
		boolean isLoginOK=Boolean.parseBoolean((session.getAttribute("isLoginOK")+""));
		System.out.println("isLoginOK"+isLoginOK);
		if(isLoginOK){
			System.out.println("��¼�ɹ�");
			return true;
		}else{
			System.out.println("����δ��¼�����ȵ�¼");
			//request.getRequestDispatcher("/login.html").forward(request, response);
			response.sendRedirect(request.getContextPath() +"/login.html");
			return false;
		}
	}

}
