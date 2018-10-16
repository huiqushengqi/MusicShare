package dao;

import java.util.List;

import entity.Student;

/**
 * 学生类方法的接口
 * 
 * @author Nsher
 * 
 */
public interface StudentDao {

	/**
	 * 查询所有学生信息
	 * 
	 * @return List
	 */
	public List<Student> all_stu(int page,int pagesize);

	/**
	 * 添加学生信息
	 * 
	 * @param s
	 *            学生对象
	 * @return 1成功 0失败
	 */
	public int add_stu(Student s);

	/**
	 * 修改学生信息
	 * 
	 * @param s
	 *            学生对象
	 * @return 1成功 0失败
	 */
	public int update_stu(Student s);

	/**
	 * 删除学生信息
	 * 
	 * @param 学生ID
	 * @return 1成功 0失败
	 */
	public int delete_stu(String stu_id);
	
	/**
	 * 通过学生ID查询学生信息
	 * 
	 * @param stu_id
	 * @return
	 */
	public Student query_stu_id(String stu_id);
	
	/**
	 * 根据学生姓名，学生学号，学生状态查询学生信息
	 * 
	 * @param stu_num
	 * @param stu_name
	 * @param stu_status
	 * @return
	 */
	public List<Student> query_stu(String stu_num,String stu_name,String stu_status);
	
	/**
	 * 查询学生信息记录条数
	 * @return
	 */
	public int query_stu_num();
}
