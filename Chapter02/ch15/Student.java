package ch15;
import java.util.ArrayList;

public class Student {

	private int stdNum;
	private String name;
	private ArrayList<Subject> scoreBoard = new ArrayList<>();
	
	public Student(int stdNum, String name) {
		stdNum++;
		this.stdNum = stdNum;
		this.name = name;
		
		ArrayList<Subject> scoreBoard = new ArrayList<>();
	}
	
	public int getStdNum() {
		return stdNum;
	}
	public void setStdNum(int stdNum) {
		this.stdNum = stdNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Subject> getScoreBoard() {
		return scoreBoard;
	}
	public void setScoreBoard(ArrayList<Subject> scoreBoard) {
		this.scoreBoard = scoreBoard;
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : scoreBoard) {
			total += s.getScore();
		System.out.println("학생 " + name + "의 " + s.getName() + " 과목 성적은 " + s.getScore() + "입니다.");
		}
		System.out.println("학생 " + name + "의 총점은 " + total + "입니다.");
	}

	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		
		scoreBoard.add(subject);
	}
	
}
