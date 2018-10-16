package dao;

import java.util.List;

import entity.Score;

/**
 * 学生成绩类方法的接口
 * 
 * @author Nsher
 *
 */
public interface ScoreDao {
	/**
	 * 查询所有学生成绩信息
	 * @return List
	 */
	public List<Score> all_score ();
	/**
	 * 添加学生成绩信息
	 * @param s 学生成绩对象
	 * @return 1成功 0失败
	 */
	public int add_score (Score s);
	
	/**
	 * 修改学生成绩信息
	 * @param s 学生成绩对象
	 * @return 1成功 0失败
	 */
	public int update_score (Score s);
	
	/**
	 * 删除学生成绩信息
	 * @param 成绩ID
	 * @return 1成功 0失败
	 */
	public int delete_score (String score_id);
}
