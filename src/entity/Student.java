package entity;

/**
 * 学生类
 * 
 * @author Nsher
 * 
 */
public class Student {

	private int stu_id;// 学生id
	private String stu_name;// 学生姓名
	private String stu_class;// 学生所在班级
	private String stu_addr;// 学生寝室
	private String stu_position;// 学生职位
	private String stu_num;// 学生学号
	private String stu_remarks;//学生备注
	private String stu_status;// 学生的状态
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stuId) {
		stu_id = stuId;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stuName) {
		stu_name = stuName;
	}
	public String getStu_class() {
		return stu_class;
	}
	public void setStu_class(String stuClass) {
		stu_class = stuClass;
	}
	public String getStu_addr() {
		return stu_addr;
	}
	public void setStu_addr(String stuAddr) {
		stu_addr = stuAddr;
	}
	public String getStu_position() {
		return stu_position;
	}
	public void setStu_position(String stuPosition) {
		stu_position = stuPosition;
	}
	public String getStu_num() {
		return stu_num;
	}
	public void setStu_num(String stuNum) {
		stu_num = stuNum;
	}
	public String getStu_remarks() {
		return stu_remarks;
	}
	public void setStu_remarks(String stuRemarks) {
		stu_remarks = stuRemarks;
	}
	public String getStu_status() {
		return stu_status;
	}
	public void setStu_status(String stuStatus) {
		stu_status = stuStatus;
	}
	@Override
	public String toString() {
		return "学生 [寝室 =" + stu_addr
				+ ", 学号 =" + stu_num + ", 职位 =" + stu_position
				+ ", 备注 =" + stu_remarks + ", 状态 =" + stu_status
				+ "]";
	}

	
}
