package ex7_interface;

public interface Phone {
	//상수
	public static int MAX_BATTERY_CAPACITY = 100;
	//추상메서드
	void powerOn();
	void powerOff();
	boolean isOn();
	void watchUtube();
	void charge();
	
}
