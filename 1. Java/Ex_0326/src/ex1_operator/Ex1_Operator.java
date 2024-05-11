package ex1_operator;

public class Ex1_Operator {
	public static void main(String[] args) {
		//산술연산자
		//사칙연산과 나머지 값을 구하는 연산자로 나뉜다.
		//프로그래밍에서 곱셈은 x가 아닌 *
		
		int n1,n2,n3;
		n1 = 20;
		n2 = 7;
		
		n3 = n1 + n2;
		System.out.println("n3 : " + n3);
		
		n3 = n1 - n2;
		System.out.println("n3 : " + n3);
		
		//나눗셈
		n3 = n1 / n2;
		System.out.println("n3 : " + n3);
		
		n3 = n1 % n2;
		System.out.println("n3 : " + n3);
		
		//산술변환
		//기본적으로 이항 연산자의 연산은 두 피연산자의 타입이 일치해야 가능하다.
		//컴퓨터는 서로 다른 타입을 계산하지 못하므로 값의 손실이 적은쪽으로
		//타입을 맞춰준다.
		
		//long + int -> long + long -> long
		//float + int -> float + float -> float
		//double + float -> double + double -> double
		
		//대입연산자
		//우변의 값을 좌변에 대입한다
		int a = 10;
		int b = 7;
		
		//복합대입연산자
		//산술연산자와 대입연산자가 합쳐진 형태
		// +=,-=,*=,/=,%=
		
		a += b; // a = a + b;
		
		System.out.println("a : " + a);
		
		a -= b; // a = a - b;
		
		a *= b; // a = a * b;
		
		a /= b; // a = a / b;
		
		a %= b; //a = a % b;
		
		
		int wallet = 5000;
		
		//값을 누적해야 할때
		wallet *= 1.05f;
		
		System.out.println(wallet);
		
		int num = 29;
		
		num -= 2 + 3 * 4;//num = 29 - (2 + 3 * 4);
		
		System.out.println(num);
		
		
		
		
		
		
		
		
		
	}
}
