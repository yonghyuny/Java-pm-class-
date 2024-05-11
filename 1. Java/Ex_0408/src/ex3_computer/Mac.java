package ex3_computer;

public class Mac extends Computer {

	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("Apple");
	}
}
