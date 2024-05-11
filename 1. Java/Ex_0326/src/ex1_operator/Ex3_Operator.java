package ex1_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
		//비트연산자
		//논리연산자와 유사하지만 bit단위(2진수)의 연산만 가능하다.
		//주로 암호화,복호화 작업에 사용된다.
		
		//&
		//논리곱(AND) : 두 항이 모두 1이면 1, 아니면 0
		
		//|
		//논리합(OR) : 두 항 중 하나라도 1이면 1, 아니면 0
		
		//^
		//배타적논리합(XOR) : 두 항이 다르면 1, 같으면 0
		
		//~
		//부정(NOT) : 1을 0으로, 0을 1로
		
		int a = 10;//1010
		int b = 7;//0111
		int c = a & b;
		System.out.println("c : " + c);
		
		c = a | b;
		System.out.println("c : " + c);
		
		c = a ^ b;
		System.out.println("c : " + c);
		
		//~(not연산)
		//2진수로는 음수를 표현할 수 없다.
		//그래서 비트의 맨 앞자리는 수의 표현이 아닌 부호의 표현을 쓰기로 약속했다.
		
		int x = 7; // -(x+1)
		
		System.out.println("~x : " + ~x);
		
		System.out.println("---------------------------------------");
		
		//증감연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		//++, --
		
		//선행증감
		//변수의 앞에서 사용
		int i = 10;
		System.out.println("i : " + ++i);
		
		//후행증감
		//변수의 뒤에서 사용
		int i2 = 10;
		System.out.println("i2 : " + i2++);
		System.out.println(i2);
		
		int n = 5;
		
		int n2 = n++;
		
		System.out.println(n);
		System.out.println(n2);
		//n : 6
		//n2 : 5
		
		
		
	}
}





