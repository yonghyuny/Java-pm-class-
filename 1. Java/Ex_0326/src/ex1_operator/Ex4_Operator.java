package ex1_operator;

public class Ex4_Operator {
	public static void main(String[] args) {
		//삼항연산자
		//하나의 조건을 정의하여 조건식이 참일 때 반환할 값, 거짓일 때 반환할 값
		//을 반환받기 위한 연산자
		
		//조건식 ? 조건식이 참일 때 반환할 값 : 조건식이 거짓일때 반환할 값;
		
		int a = 10, b = 15;
		
		//반환할 값의 자료형은 반드시 논리형이어야 하는것은 아니다.
		boolean result = ++a >= b ? true : false;
		char result2 = ++a >= b ? 'O' : 'X';
		
		System.out.println("result : " + result);
		System.out.println("result : " + result2);
		
		//sign 변수에 값이 1이면 "빨간불", 2면"노란불",3이면"초록불"을
		//출력을 해라
		
		int sign = 4;
		
		String s = sign == 1 ? "빨간불" : sign == 2 ? "노란불" : "초록불";
		
		System.out.println("신호 : " + s);
		
		
		
		
		
		
		
		
	}
}
