package Inheritance;

public abstract class Civilian {
	private int cvId;
	private String name;
	private String gender;
	protected int atk;					//객체의 계급에 따라 바뀌는 값이라 protected
	protected int hp;						//객체의 계급에 따라 바뀌는 값이라 protected
	protected String rank;			//객체의 계급에 따라 바뀌는 값이라 protected
	
	public abstract int atk();
}
