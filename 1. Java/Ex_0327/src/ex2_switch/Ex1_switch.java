package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		//switch문
		//if문과 비슷하지만 switch문은 소괄호에 기준값이 들어간다.
		
		//기본형
		//switch(기준값){
		//case 비교값:
		//	기준값과 비교값이 일치할 때 실행할 명령;
		//	break;
		//case 비교값:
		//	기준값과 비교값이 일치할 때 실행할 명령;
		//	break;
		//case 비교값:
		//	기준값과 비교값이 일치할 때 실행할 명령;
		//	break;
		//default:
		//	기준값과 일치하는 비교값이 없을 때 실행할 명령;
		//	break;
		//}
		
		//1) 비교값과 기준값의 타입은 반드시 일치해야 한다.
		//2) 중복이되는 비교값을 가질 수 없다.
		
		int n = 3;
		
		switch(n) {
		case 1:
			System.out.println("1. 게임하기");
			break;
		case 2:
			System.out.println("2. 게임소개");
			break;
		case 3:
			System.out.println("3. 종료");
			break;
		}
		
		//if vs switch의 차이
		//if문은 범위에 따라서 조건을 비교하는데 효과적이고
		//switch문은 하나의 값에 따라서 조건을 비교하는데 효과적이다.
		
		
		
		
		
	}
}
