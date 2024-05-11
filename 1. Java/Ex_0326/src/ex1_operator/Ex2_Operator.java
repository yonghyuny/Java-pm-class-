package ex1_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		//비교(관계)연산자
		//변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		//결과가 항상 true나 false로 반환된다.
		//>,<,>=,<=, ==, !=
		
		int x = 10;
		int y = 20;
		
		boolean result;
		
		result = x > y;
		System.out.println("x > y : " + result);
		
		//== : 같다
		//좌변과 우변의 값이 같으면 true, 아니면 false
		result = x == y;
		System.out.println("x == y : " + result);
		
		//!= : 같지 않다.
		//좌변과 우변의 값이 같지 않으면 true, 아니면 false
		result = x != y;
		System.out.println("x != y : " + result);
		
		System.out.println("----------------------------------");
		
		//논리연산자
		//피연산자로 논리형 데이터를 받는 연산자이다.
		
		//A && B
		//논리곱(AND) : A와 B가 모두 true면 true,아니면 false
		// T && T -> T
		// T && F -> F
		// F && T -> F
		// F && F -> F
		
		int myAge = 30;
		int limit = 40;
		
		result = (limit-myAge) >= 5 && myAge > 30;
		System.out.println("&&연산결과 : " + result);
		
		//A || B
		//논리합(OR) : A와 B중 하나라도 true면 true, 아니면 false
		// T || T -> T
		// T || F -> T
		// F || T -> T
		// F || F -> F
		
		result = (myAge += 10) > 20 || limit - 10 == 11;
		System.out.println("||연산결과 : " + result);
		
		//!A
		//부정(NOT) : true를 false로, false를 true로 반환
		
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		System.out.println("!result : " + !result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
