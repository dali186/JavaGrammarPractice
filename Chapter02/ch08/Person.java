package ch08;

public class Person {

	private String personName;
	private int personBalance;
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonBalance() {
		return personBalance;
	}
	public void setPersonBalance(int personBalance) {
		this.personBalance = personBalance;
	}
	
	public void rideBus (Bus bus) {
		bus.take();
		personBalance -= bus.getBusPrice();
	}
	
	public void rideTrain (Train train) {
		train.take();
		personBalance -= train.getTrainPrice();
	}
	
	public void showInfo() {
		System.out.println(personName + "님의 남은 돈은 " + personBalance + "원 입니다.");
	}
	
	public Person(String personName, int personBalance) {
		this.personName = personName;
		this.personBalance = personBalance;
	}
}
