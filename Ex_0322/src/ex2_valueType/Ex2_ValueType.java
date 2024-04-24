package ex2_valueType;

public class Ex2_ValueType {
	public static void main(String[] args) {
		// 자료형(ValueType)
		// 자바가 처리할 수 있는 데이터의 종류
		
		// 여러가지 데이터 출력해보기
		System.out.println("hello world"); // 문자열
		
		System.out.println(100); // 정수
		
		System.out.println(100+50); // 연산도 가능
		
		// 문자열 앞뒤에 +(더하기)기호는 연결을 의미한다.
		System.out.println("안녕"+10); // 안녕10
		
		System.out.println("2 + 2 = "+ 2 + 2); 
		System.out.println("2 + 2 = "+(2 + 2)); // 문자열이 있으면 괄호를 이용해서 값을 먼저 계산 
	}
}
