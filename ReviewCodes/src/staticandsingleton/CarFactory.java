package staticandsingleton;

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
		Car car = new Car(carNum);
		//car.setCarNum(carNum);
		return car;
		
	}

	public static int getCarNum() {
		return carNum;
	}

	public static void setCarNum(int carNum) {
		CarFactory.carNum = carNum;
	}
	
	
}
