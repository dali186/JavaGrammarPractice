package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	
		//이래 인스턴스를 생성 할 수도 있다.
		Class c1 = Class.forName("ch04.Person");
		
		Person person = (Person)c1.newInstance();
		
		person.setName("name");
		System.out.println(person);
		
		//인스턴스가 있는 상태에서 getClass 할 수 있다.
		Class c2 = person.getClass();
		Person p = (Person)c2.newInstance();
		System.out.println(p);
		
		Class[] pt = {String.class};
		Constructor cons = c2.getConstructor(pt);
		
		Object[] initargs = {"Kim"};
		Person kimPerson = (Person)cons.newInstance(initargs);
		System.out.println(kimPerson);
		
		//위에 과정이 이거임 ㅋ
		//Person kim2 = new Person("Kim");
	}
}
