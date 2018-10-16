package dao;

import entity.Teacher;

/**
 * 教师类方法的接口
 * 
 * @author Nsher
 * 
 */
public interface TeacherDao {

	/**
	 * 登录
	 * 
	 * @param name
	 *            教师姓名
	 * @return Teacher
	 */
	public Teacher query_tea(String name);

	/**
	 * 添加教师信息
	 * 
	 * @param t
	 *            教师对象
	 * @return 1成功 0失败
	 */
	public int add_tea(Teacher t);

	/**
	 * 修改教师信息
	 * 
	 * @param t
	 *            教师对象
	 * @return 1成功 0失败
	 */
	public int update_tea(Teacher t);

	/**
	 * 查询教师信息
	 * 
	 * @param 教师ID
	 * @return Teacher
	 */
	public Teacher query_tea(int teacher_id);
}
