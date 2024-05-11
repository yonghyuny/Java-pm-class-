package ex2_work;

import java.util.Scanner;

public class StartMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Start s = new Start();
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int answer = sc.nextInt();
			
			s.check(answer);
			
			if(s.rnum == answer) {
				break;
			}
		}
		
		
		
	}
}
