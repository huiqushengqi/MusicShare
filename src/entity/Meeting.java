package entity;

/**
 * 会议类
 * 
 * @author Nsher
 * 
 */
public class Meeting {

	private int meeting_id;// 会议id;
	private String meeting_time;// 会议时间;
	private String meeting_tea;// 会议记录的老师
	private String meeting_content;// 会议内容
	private String meeting_class;// 会议班级

	public int getMeeting_id() {
		return meeting_id;
	}

	public void setMeeting_id(int meetingId) {
		meeting_id = meetingId;
	}

	public String getMeeting_time() {
		return meeting_time;
	}

	public void setMeeting_time(String meetingTime) {
		meeting_time = meetingTime;
	}

	public String getMeeting_tea() {
		return meeting_tea;
	}

	public void setMeeting_tea(String meetingTea) {
		meeting_tea = meetingTea;
	}

	public String getMeeting_class() {
		return meeting_class;
	}

	public void setMeeting_class(String meetingClass) {
		meeting_class = meetingClass;
	}

	public String getMeeting_content() {
		return meeting_content;
	}

	public void setMeeting_content(String meetingContent) {
		meeting_content = meetingContent;
	}

}
