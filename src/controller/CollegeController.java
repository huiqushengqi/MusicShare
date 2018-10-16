package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import dao.CollegeDao;

@Controller
public class CollegeController {
	@Resource
	private CollegeDao cd;

	public CollegeDao getCd() {
		return cd;
	}

	public void setCd(CollegeDao cd) {
		this.cd = cd;
	}
	
}
