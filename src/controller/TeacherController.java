package controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.TeacherDao;

import entity.Teacher;

@Controller
public class TeacherController {
	@Resource
	private TeacherDao td;

	public TeacherDao getTd() {
	return td;
	}

	public void setTd(TeacherDao td) {
	this.td = td;
	}
	protected Logger log = Logger.getLogger(TeacherController.class);
	@RequestMapping ("login")
	public String checklogin (String name,HttpSession session){
		Teacher t=td.query_tea(name);
		if(t.equals(null)){
			return "index";
		}
		session.setAttribute("teacher", t);
		log.info("登录成功，进入首页");
		return "homepage";
	}
	
	@RequestMapping("introduce")
	public String introduce1(){
		log.info("进入系统介绍");
		
		return "introduce";
	}
	
	
	
	
	
	@RequestMapping("loginout")
	public String tea_login_out(){

		log.info("老师退出系统");
		
		return "loupanchart";
	}
	
	
 
}
