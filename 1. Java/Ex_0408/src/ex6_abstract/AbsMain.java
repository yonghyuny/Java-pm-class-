package ex6_abstract;

public class AbsMain {
	public static void main(String[] args) {
		//추상클래스는 객체를 직접 생성할 수 없다.
		//AbsParent ap = new AbsParent();
		
		AbsChild ac = new AbsChild();
		ac.setValue(20);
		System.out.println(ac.getValue()); //-> 100      
		
	}
}
