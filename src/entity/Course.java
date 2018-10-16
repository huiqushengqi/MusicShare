package entity;

/**
 * 课程类
 * 
 * @author Nsher
 * 
 */
public class Course {

	private int course_id;// 课程id
	private String course_name;// 课程名称
	private Teacher course_head;// 课程所属的老师
	private College course_college;// 课程所属的学院
	private String coures_people;// 课程人数

	public String getCoures_people() {
		return coures_people;
	}

	public void setCoures_people(String couresPeople) {
		coures_people = couresPeople;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int courseId) {
		course_id = courseId;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String courseName) {
		course_name = courseName;
	}

	public Teacher getCourse_head() {
		return course_head;
	}

	public void setCourse_head(Teacher courseHead) {
		course_head = courseHead;
	}

	public College getCourse_college() {
		return course_college;
	}

	public void setCourse_college(College courseCollege) {
		course_college = courseCollege;
	}

}
