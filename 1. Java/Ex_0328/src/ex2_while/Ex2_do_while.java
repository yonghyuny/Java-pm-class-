package ex2_while;

import java.util.Scanner;

public class Ex2_do_while {
	public static void main(String[] args) {
		//do-while
		//while문은 선비교 후처리를 하지만
		//do-while은 선처리 후비교를 하기 때문에
		//조건에 맞지 않아도 무조건 한번은 실행하게 된다.
		//제어문중 유일하게 뒤에 세미콜론을 붙혀야 한다.
		
		//do{
		//	반복하고자 하는 명령;
		//}while(조건식);
		
		int sum = 0;
		int i = 1;
		do {
			sum+=i;
			i++;
		}while(i <=10);
		System.out.println("합 : " + sum);
		
		
		int n = 11;
		
		do {
			System.out.println(n);
		}while(n<=10);
		
		
		//상황에따라 반복문 사용하기
		//반복횟수가 지정되는 경우 -> 횟수를 만족할때가지 반복
		//ex)물통에 물을 10번 채워라 -> for문
		
		//특정조건이 부여되는 경우 -> 조건이 만복할 때까지 반복
		//ex)물통에 물이 가득찰 때가지 채워라 -> while문
		
		//특정 조건과 옵션이 부여되는 경우 -> 한 번 실행한 후 반복 여부 판단
		//ex)물통에 물을 따라보고 새지 않은면 끝까지 채워라 -> do - wile문
		
		
		//국어 영어 수학점수를 키보드에서 입력받고
		//한과목이라도 0점 미만 또는 100점 초과면 다시 입력받는다.
		
		//국어 : X점
		//영어 : X점
		//수학 : X점
		
		Scanner sc = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		do {
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("수학 : ");
			math = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			
		}while((kor <0 || kor > 100) || (eng < 0 || eng > 100) || (math <0 || math > 100));
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		
		//      *
		//    * *
		//  * * *
		//* * * *
		
		//1 2 3 4 5 6 7 8 9 10 
		//2 3 4 5 6 7 8 9 10 1 
		//3 4 5 6 7 8 9 10 1 2 
		//4 5 6 7 8 9 10 1 2 3 
		//5 6 7 8 9 10 1 2 3 4 
		//6 7 8 9 10 1 2 3 4 5 
		//7 8 9 10 1 2 3 4 5 6 
		//8 9 10 1 2 3 4 5 6 7 
		//9 10 1 2 3 4 5 6 7 8 
		//10 1 2 3 4 5 6 7 8 9
		
		for(int j = 1; j <=10; j++) {
			
			for(int k = 0; k <10; k++) {
				
				int num = j + k;
				if(num > 10) num -= 10;
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
