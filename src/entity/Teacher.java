package entity;

/**
 * 教师类
 * 
 */
public class Teacher {

	private int teacher_id;// 教师id
	private String teacher_position;// 教师职位
	private String teacher_cell;// 教师电话
	private String teacher_college;// 教师所在学院
	private String teacher_name;// 教师名字
    
	public String getTeacher_college() {
		return teacher_college;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacherName) {
		teacher_name = teacherName;
	}

	public void setTeacher_college(String teacherCollege) {
		teacher_college = teacherCollege;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacherId) {
		teacher_id = teacherId;
	}

	public String getTeacher_position() {
		return teacher_position;
	}

	public void setTeacher_position(String teacherPosition) {
		teacher_position = teacherPosition;
	}

	public String getTeacher_cell() {
		return teacher_cell;
	}

	public void setTeacher_cell(String teacherCell) {
		teacher_cell = teacherCell;
	}
}
