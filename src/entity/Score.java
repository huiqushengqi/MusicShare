package entity;

/**
 * 成绩类
 * 
 * @author wtl
 * 
 */
public class Score {

	private int score_id;// 成绩id
	private String score_frac;// 成绩分数
	private String score_stunum;// 成绩所属的学生学号
	private Course score_course;// 成绩所属的课程
	private int score_re;// 成绩重考标记
	private int score_uo;// 成绩补考标记

	public int getScore_re() {
		return score_re;
	}

	public void setScore_re(int scoreRe) {
		score_re = scoreRe;
	}

	public int getScore_uo() {
		return score_uo;
	}

	public void setScore_uo(int scoreUo) {
		score_uo = scoreUo;
	}

	public String getScore_stunum() {
		return score_stunum;
	}

	public void setScore_stunum(String scoreStunum) {
		score_stunum = scoreStunum;
	}

	public int getScore_id() {
		return score_id;
	}

	public void setScore_id(int scoreId) {
		score_id = scoreId;
	}

	public String getScore_frac() {
		return score_frac;
	}

	public void setScore_frac(String scoreFrac) {
		score_frac = scoreFrac;
	}

	public Course getScore_course() {
		return score_course;
	}

	public void setScore_course(Course scoreCourse) {
		score_course = scoreCourse;
	}

}
