package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;

import biz.UserBiz;

@Controller
public class MyController {
	@Resource
	private UserBiz biz;
	
	
	public UserBiz getBiz() {
		return biz;
	}


	public void setBiz(UserBiz biz) {
		this.biz = biz;
	}
	protected Logger log = Logger.getLogger(TeacherController.class);

	@RequestMapping(value="logincheck")
	public void checklogin(String name,String pwd,HttpSession session,HttpServletResponse response){
		PrintWriter out =null;
		response.setContentType("text/html;charset=utf-8");
		User user=biz.checkLogin(name, pwd);
		try {
			out=response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(user!=null){
			
			session.setAttribute("user", user);
			
			out.print("<script>alert('��½�ɹ�');location.href='welcome.jsp'</script>");
		}else{
			
			out.print("<script>alert('��½ʧ��');history.go(-1);</script>");
		}
		
		out.flush();
		out.close();
	}
	
	


}
