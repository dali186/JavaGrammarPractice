package review01;

public abstract class PlayerLevel {
	
	protected abstract void run();
	protected abstract void jump();
	protected abstract void turn();
	protected abstract void showLevelMessage();
	
	public PlayerLevel() {
		
	}
	
	//상속되어 사용되야해서 protected 사용
	//추상 클래스의 추상 메소드라 선언만 했음
	
	public void go(int g) {
		run();
		for(int i = 0; i < g; i++) {
			jump();	
		}
		turn();
	}
	//추상 클래스에 구현된 메소드 선언이 된다.
}
