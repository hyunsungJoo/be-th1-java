package day14_io.object;

import java.io.Serializable;

public class Grade implements Serializable {
	public String subject;
	public int score ;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Grade [subject=" + subject + ", score=" + score + "]";
	}
	
	

}
