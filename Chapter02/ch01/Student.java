package ch01;

//public 공용 어디서든지 접근 가능 public은 단 하나 ->  자바파일 이름은 동일
public class Student {
		private int studentNumber;
		private String studentName;
		private int majorCode;
		private String majorName;
		private int grade;
		public int getStudentNumber() {
			return studentNumber;
		}
		public void setStudentNumber(int studentNumber) {
			this.studentNumber = studentNumber;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public int getMajorCode() {
			return majorCode;
		}
		public void setMajorCode(int majorCode) {
			this.majorCode = majorCode;
		}
		public String getMajorName() {
			return majorName;
		}
		public void setMajorName(String majorName) {
			this.majorName = majorName;
		}
		public int getGrade() {
			return grade;
		}
		public void setGrade(int grade) {
			this.grade = grade;
		}
		
		public void showStudentInfo() {
			System.out.println("학번 : " + studentNumber  + ", 학생 이름 : " + studentName + ", 학년 : " + grade);
		}
}
