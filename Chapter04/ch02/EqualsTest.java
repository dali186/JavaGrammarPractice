package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std4 = new Student(200, "Kim");
		Student std3 = std1;
		
		System.out.println(std1 == std2);		//false
		System.out.println(std1.equals(std2));	//false
		System.out.println(std1.equals(std3));	//true
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		String str2 = new String("abc");
		String str1 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		std1.setStudentName("JOO");
		Student copyStd = (Student)std1.clone();
		System.out.println(copyStd.toString());	//오류 -> 클론에이블 노우
	}
	
}
