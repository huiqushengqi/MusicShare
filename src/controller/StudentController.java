package controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import dao.StudentDao;
import entity.Student;

@Controller
public class StudentController {
	@Resource
	private StudentDao sd;

	public StudentDao getSd() {
		return sd;
	}

	public void setSd(StudentDao sd) {
		this.sd = sd;
	}

	protected Logger log = Logger.getLogger(TeacherController.class);

	@RequestMapping("teacher")
	public String tea_checklogin(String username, String pwd) {
		System.out.println(username);
		return "index1";
	}

	@RequestMapping("index")
	public String tea_index() {
		System.out.println("进入首页");
		return "homepage";
	}

	@RequestMapping("house_list")
	public ModelAndView stu_all(int page) {
		log.info("开始分页查询学生信息");
		ModelAndView mvc = new ModelAndView();
		List<Student> list = sd.all_stu(page, 20);
		int pagenum = sd.query_stu_num();
		mvc.addObject("list", list);
		mvc.addObject("pagenum", pagenum);
		mvc.setViewName("house_list");
		return mvc;
	}

	@RequestMapping("house_edit")
	public ModelAndView stu_edit(String stu_id) {
		ModelAndView mvc = new ModelAndView();
		log.info("进入学生信息编辑");
		Student s = sd.query_stu_id(stu_id);
		mvc.addObject("stu", s);
		mvc.setViewName("house_edit");
		return mvc;
	}

	@RequestMapping(value = "querystu", method = RequestMethod.POST)
	@ResponseBody
	public String house3(String stu_num, String stu_name, String stu_status) {
		Gson g = new Gson();
		log.info("查询学生信息");
		List<Student> list = sd.query_stu(stu_num, stu_name, stu_status);
		String str = g.toJson(list);
		return str;

	}
	@RequestMapping(value = "updatestu")
	@ResponseBody
	public void tea_update_stu(String stu_num,String stu_addr,String stu_position,String stu_status,String stu_remarks){
		Student s = new Student();
		s.setStu_num(stu_num);
		s.setStu_addr(stu_addr);
		s.setStu_position(stu_position);
		s.setStu_status(stu_status);
		s.setStu_remarks(stu_remarks);
		sd.update_stu(s);
		log.info("修改了"+s.toString());
		
	}
}
