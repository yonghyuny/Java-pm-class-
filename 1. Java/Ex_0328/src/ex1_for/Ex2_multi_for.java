package ex1_for;

public class Ex2_multi_for {
	public static void main(String[] args) {
		//다중 for문
		//for문안에 for문이 있는 경우
		
		//for(초기식;조건식;증감식){
		//	for(초기식;조건식;증감식){
		//		조건식이 참일때 반복할 명령
		//	}
		//
		//}
		
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=3; j++) {
				System.out.println(i+" "+j);
			}
		}
		
		//1 1 1 1
		//1 1 1 1
		//1 1 1 1
		for(int i = 0; i <3; i++) {
			for(int j = 1; j<=4; j++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
		
		//1 2 3 4
		//1 2 3 4
		//1 2 3 4
		
		for(int i = 0; i <3; i++) {
			for(int j = 1; j <=4; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//1 2 3 4
		//5 6 7 8
		//9 10 11 12
		
		int n = 1;
		for(int i = 0; i<3; i++) {
			for(int j = 1; j <=4; j++) {
				System.out.printf("%02d ",n++);
			}
			System.out.println();
		}
		
		//A B C D
		//A B C D
		//A B C D
		
		for(int i = 0; i <3 ; i++) {
			for(int j = 65; j <69; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		
		//A B C D
		//E F G H
		//I J K L
		
		char c = 'A';
		
		for(int i = 0; i <3; i++) {
			for(int j = 0; j <4; j++) {
				System.out.print(c++ +" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
