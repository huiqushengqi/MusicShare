package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import dao.SClassDao;

@Controller
public class SClassController {
	@Resource
	private SClassDao sd;

	public SClassDao getSd() {
		return sd;
	}

	public void setSd(SClassDao sd) {
		this.sd = sd;
	}
	
}
