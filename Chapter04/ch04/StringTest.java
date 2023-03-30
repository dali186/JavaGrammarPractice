package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
	public static void main(String[] args) throws ClassNotFoundException {
	
		Class c = Class.forName("java.lang.String");
		
		//생성자 종류 보기
		Constructor[] cons = c.getConstructors();
		for(Constructor co : cons) {
			System.out.println(co);
		}
		//메소드 종류 보기
		Method[] m = c.getMethods();
		for(Method me : m) {
			System.out.println(me);
		}
	}
}
