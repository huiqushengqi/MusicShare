package dao;

import java.util.List;

import entity.SClass;

/**
 * 班级类方法的接口
 * 
 * @author Nsher
 *
 */
public interface SClassDao {
	/**
	 * 查询所有班级信息
	 * @return List
	 */
	public List<SClass> all_class ();
	/**
	 * 添加班级信息
	 * @param s 班级对象
	 * @return 1成功 0失败
	 */
	public int add_class (SClass s);
	
	/**
	 * 修改班级信息
	 * @param s 班级对象
	 * @return 1成功 0失败
	 */
	public int update_class (SClass s);
	
}
