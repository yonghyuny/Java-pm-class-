package ex2_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		//1. 데이터를 직접 출력
		//2. 변수에 넣고 출력
		//3. 실행할 때 변수에 값을 입력하고 출력
		
		//데이터의 입력
		//키보드를 통해 다양한 데이터를 자유롭게 입력하는 방법이 있다.
		//키보드를 통해 입력해 데이터를 받기 위해서는 'java.util'패키지에 있는
		//Scanner클래스를 이용해야 한다.
		
		//nextByte() : 입력받은 값을 byte형으로 반환
		//nextShort() : 입력받은 값을 short형으로 반환
		//nextInt() : 입력받은 값을 int형으로 반환
		//nextLong() : 입력받은 값을 long형으로 반환
		//nextFloat(): 입력받은 값을 float형으로 반환
		//nextDouble(): 입력받은 값을 double형으로 반환
		//nextLine() : 입력받은 라인 전체를 문자열 타입으로 반환
		//next() : 공백전까지의 입력된 데이터를 문자열 타입으로 반환
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.println("age = " + age);
		
		//nextLine()과 next()의 차이점
		//next() : 공백전까지의 단어를 읽고 줄바꿈을 해준다.
		//nextLine() : 줄바꿈 문자까지 반환을 해버린다.
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
