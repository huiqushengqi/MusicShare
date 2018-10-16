package entity;

/**
 * 工作日志类
 * 
 * @author Nsher
 *
 */
public class Log {
	private int log_id;//日志ID
	private String log_content;//日志内容
	private String log_tea;//日志记录老师
	private String log_time;//日志记录时间
	public int getLog_id() {
		return log_id;
	}
	public void setLog_id(int logId) {
		log_id = logId;
	}
	public String getLog_content() {
		return log_content;
	}
	public void setLog_content(String logContent) {
		log_content = logContent;
	}
	public String getLog_tea() {
		return log_tea;
	}
	public void setLog_tea(String logTea) {
		log_tea = logTea;
	}
	public String getLog_time() {
		return log_time;
	}
	public void setLog_time(String logTime) {
		log_time = logTime;
	}
	
}
