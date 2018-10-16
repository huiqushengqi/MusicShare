package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import dao.CourseDao;

@Controller
public class CourseController {
	@Resource
	private CourseDao cd;

	public CourseDao getCd() {
		return cd;
	}

	public void setCd(CourseDao cd) {
		this.cd = cd;
	}
	
}	
