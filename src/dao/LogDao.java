package dao;

import java.util.List;

import entity.Log;



/**
 * 日志管理类接口
 * 
 * @author Nsher
 *
 */
public interface LogDao {
	/**
	 * 查询日志
	 * @return
	 */
	public List<Log> all_log();
	/**
	 * 添加日志
	 * @return
	 */
	public int add_log ();
	/**
	 * 更新日志
	 * @return
	 */
	public int update_log();
	/**
	 * 删除日志
	 * @return
	 */
	public int delete_log();
}
