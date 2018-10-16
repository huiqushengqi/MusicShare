package entity;

/**
 * 班级类
 * 
 * @author Nsher
 * 
 */
public class SClass {

	private int class_id;// 班级id
	private String class_name;// 班级名称
	private String class_tea;// 班级的班主任
	private String class_people;// 班级人数
	private String class_starttime;// 班级建立时间

	public int getClass_id() {
		return class_id;
	}

	public void setClass_id(int classId) {
		class_id = classId;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String className) {
		class_name = className;
	}

	public String getClass_tea() {
		return class_tea;
	}

	public void setClass_tea(String classTea) {
		class_tea = classTea;
	}

	public String getClass_people() {
		return class_people;
	}

	public void setClass_people(String classPeople) {
		class_people = classPeople;
	}

	public String getClass_starttime() {
		return class_starttime;
	}

	public void setClass_starttime(String classStarttime) {
		class_starttime = classStarttime;
	}

}
