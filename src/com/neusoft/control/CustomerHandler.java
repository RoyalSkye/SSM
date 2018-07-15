package com.neusoft.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.po.Customer;
import com.neusoft.service.CustomerService;
import com.neusoft.tools.*;

@Controller
public class CustomerHandler {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/test/CustomerHandler_islogin",produces = "application/json; charset=utf-8")
	@ResponseBody
	public String islogin(HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		boolean isLoginOK=Boolean.parseBoolean((session.getAttribute("app")+""));
		if(isLoginOK){
			System.out.println("app�ѵ�¼");
			 return "{\"result\":true}";
		}else{
			System.out.println("appδ��¼");
			return "{\"result\":false}";
		}
	}
	
	@RequestMapping(value="/test/CustomerHandler_findCustomerByPhone",produces = "application/json; charset=utf-8")
	@ResponseBody
	public Customer findCustomerByPhone(HttpServletRequest request) throws Exception{
		HttpSession session=request.getSession();
		String phone=(String)session.getAttribute("phone");
		return customerService.findCustomerByPhone(phone);
	}
	
	@RequestMapping(value="/test/CustomerHandler_getcode",produces = "application/json; charset=utf-8")
	@ResponseBody
	public String getcode(Customer customer,HttpServletRequest request) throws Exception{  //phone
		 String mobileNumber = customer.getPhone();//������֤����ֻ�����
	        try {
	            String str = MobileMessageSend.sendMsg(mobileNumber);
	            if("success".equals(str)){
	                System.out.println("���ͳɹ���");
	                return "{\"result\":true}";
	            }else{
	                System.out.println("����ʧ�ܣ�");
	                return "{\"result\":false}";
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            return "{\"result\":false}";
	        }
	}
	
	@RequestMapping(value="/test/CustomerHandler_login",produces = "application/json; charset=utf-8")
	@ResponseBody
	public String login(Customer customer,HttpServletRequest request) throws Exception{  //phone password(code)
		String mobileNumber = customer.getPhone();//������֤����ֻ�����
        String code = customer.getPassword();//��֤��
        HttpSession session=request.getSession();
        try {
            String str = MobileMessageCheck.checkMsg(mobileNumber,code);
            if("success".equals(str)){
                System.out.println("��֤�ɹ���");
                Customer c=customerService.findCustomerByPhone(mobileNumber);
                if(c==null){
                	System.out.println("customer is null");
                	if(customerService.saveCustomer(customer)){
                		session.setAttribute("app", true);
                		session.setAttribute("key", 2);//�������ֺ�˻���ǰ��
                    	session.setAttribute("customer", customer);
                    	session.setAttribute("qid", 1);
                        session.setAttribute("phone", customer.getPhone());
                        session.setMaxInactiveInterval(60*100);
                        return "{\"result\":true}";
                	}else{
                		 return "{\"result\":false}";
                	}
                }else{
                	session.setAttribute("app", true);
                	session.setAttribute("customer", c);
                	session.setAttribute("qid", 1);
                    session.setAttribute("phone", c.getPhone());
                    session.setMaxInactiveInterval(60*30);
                    return "{\"result\":true}";
                }
            }else{
                System.out.println("��֤ʧ�ܣ�");
                return "{\"result\":false}";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"result\":false}";
        }  
	}
	
}
