package ex2_inner_class;

class Calculator{
	private int val1;
	private int val2;
	
	public Calculator(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}
	
	//인스턴스 클래스
	public class Calc{
		public int add() {
			return val1 + val2;
		}
	}
	
}


public class InstanceClassExample {
	public static void main(String[] args) {
		//객체지향프로그래밍(OOP, Object Oriented Programming)
		//객체를 통해서 데이터를 처리
		
		Calculator cal = new Calculator(10, 11);
		
		//인스턴스 클래스의 객체화
		//Outer out = new Outer();
		//Outer.Inner 변수명 = out.new Inner();
		Calculator.Calc c = cal.new Calc();
		
		System.out.println("합 : " + c.add());
		
		
	}
}








