package ch01;

public class AnonymousPractice {
	
	public static void main(String[] args) {
	Dog dog1 = new Dog();
	System.out.println(dog1.bark());
	Animal dog2 = new Dog();
	System.out.println(dog2.bark());
	Animal dog3 = new Animal() {
		@Override
		public String bark() {
			return "익명의 개가 짖습니다.";
		}
		public String run() {
			return "익명의 개만 달립니까?";
		}
		
	};
	System.out.println(dog3.bark());
	}
	
}

class Animal {
	public String bark() {
		return "동물이 웁니다.";
	}
}

class Dog extends Animal {

	@Override
	public String bark() {
		return "개가 짖습니다.";
	}
	
}