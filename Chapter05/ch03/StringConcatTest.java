package ch03;

public class StringConcatTest {
	public static void main(String[] args) {
	
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatImpl strlmpl = new StringConcatImpl();
		strlmpl.makeString(s1, s2);
		
		StringConcat sc = (s,v) -> System.out.println(s + "," + v);
		sc.makeString(s1, s2);
		
		StringConcat concat2  = new StringConcat() {
			
			@Override
			public void makeString(String a, String b) {
				System.out.println(s1 + "....." + s2);
			}
		};
		
		concat2.makeString(s1, s2);
		
	}
}
