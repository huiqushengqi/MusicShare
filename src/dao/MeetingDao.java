package dao;

import java.util.List;

import entity.Meeting;

/**
 * 会议类方法的接口
 * 
 * @author Nsher
 *
 */
public interface MeetingDao {
	/**
	 * 查询所有会议信息
	 * @return List
	 */
	public List<Meeting> all_meeting ();
	/**
	 * 添加会议信息
	 * @param s 会议对象
	 * @return 1成功 0失败
	 */
	public int add_meeting (Meeting s);
	
	/**
	 * 修改会议信息
	 * @param s 会议对象
	 * @return 1成功 0失败
	 */
	public int update_meeting (Meeting s);
	
	/**
	 * 删除会议信息
	 * @param s 会议ID
	 * @return 1成功 0失败
	 */
	public int delete_meeting (String meeting_id);
}
