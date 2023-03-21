package ch12;

public class CarFactory {

	private static int carNum = 10000;
	private static CarFactory instance = new CarFactory();
	
	private CarFactory() {
		
	}
	
	public static CarFactory getInstance() {
		if( instance == null) {
		instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar() {
		carNum++;
		Car sonata = new Car(carNum);
		
		return sonata;
	}
}
