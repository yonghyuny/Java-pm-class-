package ex1_for;

import java.util.Scanner;

public class Ex1_for {
	public static void main(String[] args) {
		//반복문
		//조건이 참일 때 반복수행하는 제어문
		
		//반복문의 종류
		//for, while
		
		//for문
		//for(초기식; 조건식; 증감식){
		//	조건식이 참일 때 반복하고자 하는 명령;
		//	
		//}
		
		//초기식 : 반복을 하기 위한 시작값(변수를 하나 초기화)
		//조건식 : 반복을 하기 위한 종료값으로 비교연산자를 많이 사용한다.
		//증감식 : 변수의 값을 증감시켜주는 역할을 한다.
		
		for(int i = 0; i<=3; i++) {
			
			System.out.println(i);
			
		}
		
		//1 ~ 10까지 출력하는 반복문 작성하기
		for(int i = 1; i <= 10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//10 ~ 1까지 출력하는 반복문
		for(int i = 10; i > 0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//1 ~ 10까지 3의 배수만 출력하는 반복문 작성하기
		for(int i = 1; i <=10; i++) {
			if(i % 3 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//1~10까지 총합을 출력하세요(과정은 출력하지 않아도됨)
		int total = 0;
		
		for(int i = 1; i <=10; i++) {
			total += i;
		}
		
		System.out.println("총합 : " + total);
		
		//정수형 변수 dan에 1 ~ 12사이의 숫자를 하나 초기화 하고
		//dan에 해당하는 구구단 출력하기
		
		//예시
		//2 x 1 = 2
		//2 x 2 = 4
		//2 x 3 = 6
		//2 x 4 = 8
		// ...
		//2 x 9 = 18
		
		int dan = 5;
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
		}
		
		//키보드에서 정수를 입력받아 n에 초기화를 합니다.
		//1부터 n까지의 합을 계산하여 결과를 출력하는 코드 작성하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		total = 0;
		for(int i =1; i <=n; i++) {
			total += i;
		}
		System.out.println("결과 : " + total);
		
		//10개의 정수를 입력받아 짝수가 몇개인지 출력하세요
		int count = 0;
		for(int i = 1; i <=10;i++) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			
			if(num % 2 == 0) {
				count++;
			}
		}
		System.out.println("짝수의 개수 : " + count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
