package ex1_getter_setter;

public class CarMain {
	public static void main(String[] args) {
		Car car = new Car();
		//car.speed = 50;
		car.setSpeed(50);
		System.out.println("현재 속도 : " + car.getSpeed());
		
		car.setSpeed(-50);
		System.out.println("현재 속도 : " + car.getSpeed());
		
		//멈추려고 한다.
		//멈춰있지 않으면 멈춰라
		//false
		if(car.isStop() == false) {
			car.setStop(true);
		}
		
		System.out.println("현재 속도 : " + car.getSpeed());
		
		
		
		
	}
}
