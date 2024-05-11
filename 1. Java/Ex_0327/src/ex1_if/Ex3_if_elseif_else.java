package ex1_if;

import java.util.Scanner;

public class Ex3_if_elseif_else {
	public static void main(String[] args) {
		//if - else if - else
		//비교해야할 조건이 여러개 있는 경우 사용하는 문법
		//더욱 코드를 간결하게 하고 가독성을 높이기 위한 방법으로
		//if - else if문을 구현합니다.
		
		//기본형
		//if(조건식1){
		//	조건식1이 참일 때 실행할 명령
		//} else if(조건식2){
		//	조건식1은 거짓이고 조건식2가 참일 때 실행할 명령
		//} else {
		//	위 조건식이 모두 거짓일 때 실행할 명령
		//}
		
		//else if문의 개수는 제한이 없다.
		//하지만 너무 많은 else if문을 사용한다면 프로그램의
		//실행 속도가 현저히 느려질 수 있기 때문에 다른 방법을
		//함께 고려해야 한다.
		
		//가장 마지막에 작성하는 else문은 필요없다면 생략이
		//가능하다.
		
		int favorite = 7;
		
		if(favorite < 5) {
			System.out.println("좋아하는 숫자는 5보다 작습니다.");
		} else if( favorite > 5) {
			System.out.println("좋아하는 숫자는 5보다 큽니다.");
		} else {
			System.out.println("좋아하는 숫자는 5입니다.");
		}
		
		System.out.println("--------------------------");
		
		if(favorite > 5) {
			System.out.println("좋아하는 숫자는 5보다 큽니다.");
		} else if(favorite == 7) {//이 조건이 좀 더 구체적
			System.out.println("좋아하는 숫자는 7입니다.");
		}
		
		//보다 효츌적으로 흐름을 제어하기 위해서는 조건의 위치를
		//잘 조정을 해야한다.
		
		System.out.println("---------------------------");
		
		//키보드에서 정수를 입력받아 변수age에 저장한다.
		//20살 이상이면 "성인입니다."
		//14살 이상이면 "청소년입니다."
		//7살 이상이면 "어린이입니다."
		//그 이외에는 "유아입니다."
		//출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인입니다.");
		} else if( age >= 14) {
			System.out.println("청소년입니다.");
		} else if( age >= 7) {
			System.out.println("어린이입니다.");
		} else if( age >= 0){
			System.out.println("유아입니다.");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println("-----------------------");
		//키보드에서 정수를 입력받아 score변수에 저장하고
		//90점 이상이면 "A입니다."
		//80점 이상이면 "B입니다."
		//70점 이상이면 "C입니다."
		//60점 이상이면 "D입니다."
		//59점 이하면 "F입니다"
		
		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.println("잘못입력하셨습니다.");
		}else if(score >= 90){
			System.out.println("A입니다.");
		}else if(score >= 80){
			System.out.println("B입니다.");
		}else if(score >= 70){
			System.out.println("C입니다.");
		}else if(score >= 60) {
			System.out.println("D입니다.");
		} else {
			System.out.println("F입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
