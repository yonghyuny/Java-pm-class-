package ex2_bike;

public class BikeMain {
	public static void main(String[] args) {
		Bike b = new FourWheelBike("윤기");
		b.info();
		b.ride();
		//b.addWheel(); 부모 타입으로는 불가능하다.
		
		//1. 일시적 변환
		((FourWheelBike)b).addWheel();
		
		//2. 변환하여 자식타입에 대입
		FourWheelBike fwb = (FourWheelBike)b;
		
		fwb.addWheel();
		
	}
}
