package controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import dao.MeetingDao;

@Controller
public class MeetingController {
	@Resource
	private MeetingDao md;

	public MeetingDao getMd() {
		return md;
	}

	public void setMd(MeetingDao md) {
		this.md = md;
	}
	
}
