package ex1_class;

public class CarMain {
	public static void main(String[] args) {
		
		Car car = new Car();
		
		//필드,메서드나 대개 객체를 통해 접근
		//참조변수명.필드명
		
		//참조변수명.메서드명();
		System.out.println(car.wheel);
		
		car.wheel = 5;
		System.out.println(car.wheel);
		
		
		
	}
}
