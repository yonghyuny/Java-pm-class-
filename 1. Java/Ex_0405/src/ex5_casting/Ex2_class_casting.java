package ex5_casting;

class Car{};
class Bus extends Car{};
class SchoolBus extends Bus{};

class OpenCar extends Car{};
class SportCar extends OpenCar{};

public class Ex2_class_casting {
	public static void main(String[] args) {
		Car c1 = new SchoolBus();
		Bus b1 = new Bus();
		Bus b2 = new SchoolBus();
		
		Car c2 = new OpenCar();
		OpenCar oc = new SportCar();
		
		//Bus b3 = new OpernCar();
		//Bus b4 = new SportCar();
		
		//타입을 부모로 변환한 객체는, 더이상 자신의 클래스에
		//별개로 추가한 멤버들을 사용할 수 없다.
		//부모 클래스에 선언된 멤버만 사용할 수 있다.
		//단, 부모 클래스의 메서드를 오버라이딩 한 경우
		//오버라이딩 된 메서드가 먼저 호출된다.
		
		
		
		
	}
}
