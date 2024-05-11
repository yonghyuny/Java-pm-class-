package ex6_abstract;
//추상클래스를 상속받은 클래스는
//추상메서드를 무조건 오버라이딩 받아야 한다.
public class AbsChild extends AbsParent {
	@Override
	public void setValue(int n) {
		System.out.println("추상메서드 재정의함");
	}
}
