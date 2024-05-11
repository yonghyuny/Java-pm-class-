package ex1_try_catch;
//문제:
//키보드에서 정수를 입력받도록 하고, 정수 이외의 값이 입력되었다면
//‘정수만 입력가능’이라는 메시지를 출력하자.

import java.security.DomainCombiner;
import java.util.Scanner;

//결과:

//정수를 입력 받은 경우
//정수 : 100
//입력받은 수 : 100

//정수를 입력 받지 않은 경우
//정수 : aab
//결과 : aab은(는) 정수가 아닙니다.
public class Ex1_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		String str = "";
		try {
			str = sc.next();//정수로 입력받으나, 문자열로 입력받나 문제가 없음
			int num = Integer.parseInt(str);//NumberFormatException
			System.out.println("결과 : " + num);
		} catch (NumberFormatException e) {
			System.out.println(str+"은(는) 정수가 아닙니다.");
		}
	}
}











