package ex1_if;

import java.util.Scanner;

public class Ex1_if {
	public static void main(String[] args) {
		//if문
		
		//기본형
		//if(조건식){
		//	조건식이 참일 때 실행할 명령;
		//	조건식이 참일 때 실행할 명령;
		//	조건식이 참일 때 실행할 명령;
		//}
		
		//if(조건식) 조건식이 참일 때 실행할 명령;
		
		int result = 0;
		if(3 > 2) {
			result = 3;
		}
		
		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age > 19) System.out.println("성인입니다.");
		
		
		
		
		
		
		
		

	}
}
