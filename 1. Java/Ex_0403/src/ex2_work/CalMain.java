package ex2_work;

import java.util.Scanner;

//CalTest클래스를 생성하고
//getResult()라는 메서드를 정의한다.

//main에서 두개의 숫자와 산술연산자를 키보드에서 받은뒤
//getResult()메서드를 통해 연산을 한 결과를 출력하기

//출력은 main에서 한다.
public class CalMain {
	public static void main(String[] args) {
		int n1, n2;
		String str;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		n1 = sc.nextInt();
		System.out.print("정수2 : ");
		n2 = sc.nextInt();
		System.out.print("연산기호 : ");
		str = sc.next();
		
		CalTest ct = new CalTest();
		
		int result = ct.getResult(n1, n2, str);
		
		System.out.println("결과 : " + result);
		
		
	}
}
