package ex1_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		//타입변환(casting)
		//모든 연산은 기본적으로 같은 자료형들끼리만 수행할 수 있다.
		//따라서 서로 다른 자료형의 연산을 수행하기 위해서는 같은 자료형으로 변환해줘야 한다.
		
		//자동형변환(Promotion)
		//작은 자료형에서 큰 자료형으로 변환할 때
		//byte -> short -> int -> long
		
		//정수에서 실수로 변환할 때
		
		double d = 100.5;
		int n = 200;
		
		d = n;
		System.out.println("d : " + d);
		
		char c = 'A'; //2byte
		long l = 100; //8byte
		l = c;
		
		System.out.println("l : " + l);
		
		
		
		
		
		
		
		
		
		
		
	}
}
