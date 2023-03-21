package ch08;

public class CommuteTest {

	public static void main(String[] args) {
		Person james = new Person("James", 5000);
		Person tomas = new Person("Tomas", 10000);
		
		Bus bus = new Bus("100", 0, 0, 1000);
		Train train = new Train("Green", 0, 0, 1200);
		
		james.rideBus(bus);
		tomas.rideTrain(train);
		
		james.showInfo();
		tomas.showInfo();
		bus.showInfo();
		train.showInfo();
	}

}
