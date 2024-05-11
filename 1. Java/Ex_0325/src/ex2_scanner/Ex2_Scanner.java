package ex2_scanner;

import java.util.Scanner;

public class Ex2_Scanner {
	public static void main(String[] args) {
		//이름,나이,주소,키를 키보드에서 입력받아 다음과 같이 출력하세요
		//제 이름은 홍길동 입니다.
		//제 나이는 25살입니다
		//제 주소는 인천시 부평구입니다.
		//제 키는 xxx.xcm입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("주소 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		System.out.printf("제 이름은 %s입니다.",name);
		System.out.printf("제 나이는 %d살입니다.",age);
		System.out.printf("제 주소는 %s입니다.",address);
		System.out.printf("제 키는 %fcm입니다.",height);
		
		//printf
		//f:format
		//서식문자를 이용하여 문자열과 데이터를 함께 출력할 수 있다.
		
		
		int a = 10;
		int b = 7;
		System.out.println(a+ " + " + b + " = " + (a+b));
		System.out.printf("%d + %d = %d\n",a,b,(a+b));
		
		//서식문자의 종류
		//정수 : %d
		//문자형 : %c
		//실수형 : %f
		//문자열 : %s
		
		
		
		
		
		
		
		
		
		
		
	}
}
