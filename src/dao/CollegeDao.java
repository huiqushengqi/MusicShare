package dao;

import java.util.List;
import entity.College;

/**
 * 学院类方法的接口
 * 
 * @author Nsher
 *
 */
public interface CollegeDao {
	/**
	 * 查询所有学院信息
	 * @return List
	 */
	public List<College> all_college ();
	
}
