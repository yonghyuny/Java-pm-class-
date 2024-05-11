package ex1_if;

import java.util.Scanner;

public class Ex2_if_else {
	public static void main(String[] args) {
		//if - else
		//삼항연산자의 작동원리와 같다.
		
		//기본형
		//if(조건식){
		//	조건식이 참일때 실행할 명령(출력,대입 등 각종 연산);
		//} else {
		//	조건식이 참이 아닐때 실행할 명령;
		//}
		
		//만약 명령이 한줄이라면 코드블럭 생략 가능
		
		//if(조건식)조건식이 참일때 실행할 명령(출력,대입 등 각종 연산);
		//else 조건식이 참이 아닐때 실행할 명령;
		
		int num = 5;
		
		if(num > 4) System.out.println(num+"은 4보다 큽니다.");
		else System.out.println(num+"은 4보다 작습니다.");
		
		int x = 10;
		int y = 10;
		
		int max = 0;
		
		if(x > y) {
			max = x;
			System.out.printf("%d와 %d중 더 큰 수는 %d입니다.",x,y,max);
		} else {
			if(x < y) {
				max = y;
				System.out.printf("%d와 %d중 더 큰 수는 %d입니다.",x,y,max);
			} else {
				System.out.printf("%d와 %d는 같습니다.",x,y);
			}
		}
		
		System.out.println("----------------------------");
		//키보드에서 값을 입력받아 ball변수에 저장하기
		//입력받은 공의 개수에 따라 보관에 필요한 박스의 개수 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("공의 개수 입력 : ");
		int ball = sc.nextInt();
		int box = 0;
		if(ball % 5 == 0) {
			box = ball / 5;
		} else {
			box = ball /5 + 1;
		}
		
		System.out.println("필요한 박스의 개수 : " + box);
		
		
		
		
		
		
		
		
		
		
	}
}
