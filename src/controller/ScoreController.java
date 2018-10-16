package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import dao.ScoreDao;

@Controller
public class ScoreController {
	@Resource
	private ScoreDao sd;

	public ScoreDao getSd() {
		return sd;
	}

	public void setSd(ScoreDao sd) {
		this.sd = sd;
	}
	
}
