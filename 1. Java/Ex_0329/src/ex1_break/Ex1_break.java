package ex1_break;

public class Ex1_break {
	public static void main(String[] args) {
		//기타제어문
		//일반적으로 반복문에 진입하게 되면, 다음 조건식을 검사하기 전까지
		//반복문 안에있는 모든 명령을 실행한다.
		//기타제어문을 통해 반복문 자체의 흐름을 개발자가 직접 제어할 수 있다.
		//기타제어문에는 break와 continue가 있다.
		
		//break를 만나게 되면 반복문을 종료하고 다음 코드를 실행하게 된다.
		for(int i = 1; i<=2; i++) {
			for(int j = 1; j<=5; j++) {
				if(j % 2 == 0)break;
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		//while문과 break;
		
		int n = 1;
		
		while(true) {
			System.out.println(n);
			n++;
			if(n > 5) break;
		}
		
		
		
		
		
	}
}
