package dao;

import java.util.List;

import entity.Course;

/**
 * 课程类方法的接口
 * 
 * @author Nsher
 *
 */
public interface CourseDao {
	/**
	 * 查询所有课程信息
	 * @return List
	 */
	public List<Course> all_course ();
	
	/**
	 * 修改课程信息
	 * @param c 课程对象
	 * @return 1成功 0失败
	 */
	public int update_course (Course c);
	
}
