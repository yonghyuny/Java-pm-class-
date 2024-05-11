package ex2_while;

import java.util.Scanner;

public class Ex1_while {
	public static void main(String[] args) {
		//while문
		//간편한 구성을 가진 반복문
		//반복횟수가 정해져있지 않고, 조건이 true일경우 계속 반복하는 문법
		//for문보다 구조가 간단하지만 주의해서 사용하지 않으면 
		//무한루프 같은 오류에 빠지기 쉽다.
		
		//while(조건식){
		//	조건식이 참일때 반복할 명령;
		//}
		
		int num = 1; //초기식
		
		while(num <=10) {//조건식
			
			System.out.println(num);
			num++;//증감식
		}
		
		//몇번 반복해야 하는지 정확히 모를때도 사용이 가능하다.
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while(i != -1) {
			System.out.print("숫자 입력 : ");
			i = sc.nextInt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
