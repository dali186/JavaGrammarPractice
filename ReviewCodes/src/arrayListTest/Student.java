package arrayListTest;

import java.util.ArrayList;

//학번과 이름 생성, 리스트 생성 후 과목 객체로 배열만들기
public class Student {
	
	private int stdNum;
	private String name;
	private ArrayList<Subject> scoreBoard = new ArrayList<>();	//얘는 클래스 내에서 메소드 만들 때 쓸 것
	
	public Student(int stdNum, String name) {
		this.stdNum = stdNum;
		this.name = name;
		ArrayList<Subject> scoreBoard = new ArrayList<>();		//얘는 메인에서 사용될 배열을 생성 초기화
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
	
	public void putScore(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScore(score);
		scoreBoard.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s : scoreBoard) {
			total += s.getScore();
			System.out.println(name + "학생은 " + s.getName() + "과목 성적은 " + s.getScore() + "입니다.");
		}
		System.out.println(name + "학생의 총점은" + total + "입니다.");
	}
	
}
