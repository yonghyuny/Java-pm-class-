package ex5_array;

import java.util.Random;
import java.util.Scanner;

public class Ex1_array {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		//배열 arr에 담겨있는 모든 값의 합을 출력하세요
		//결과 : 150
		
		int total = 0;
		
		for(int i =0; i < arr.length; i++) {
			total += arr[i];
		}
		
		System.out.println("결과 : " + total);
		
		System.out.println("------------------------------");
		//키보드에서 배열의 크기를 입력받아 넣는다.
		
		//키보드에서 입력받은 배열의 크기만큼
		//알파벳을 출력하세요
		
		//예를들어 5를 입력받았다면
		//결과 : ABCDE
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		char [] c = new char[sc.nextInt()];
		
		char ch = 'A';
		
		for(int i = 0; i < c.length; i++) {
			c[i] = ch++;
			System.out.print(c[i]);
		}
		
		System.out.println("------------------------------");
		
		char[] cards = {'1','L','2','O','V','3','4','E'};
		
		//배열에서 글자만 골라서 모두 연결하여 출력
		String myWord = "";
		
		for(int i = 0; i < cards.length; i++) {
			int word = cards[i];
			
			if((word >= 65 && word <= 90) || (word >= 97 && word <= 122)) {
				myWord += (char)word;
			}
		}
		
		System.out.println("단어 : " + myWord);
		
		System.out.println("---------------------------------");
		
		//난수 뽑는법
		//Random클래스
		//nextInt()
		//1 ~ 10까지 뽑는다.
		//Random random = new Random();
		
		//random.nextInt(10)+1 -> 1 ~ 10
		
		int[] lotto = new int[6];
		//1 ~ 45의 난수를 발생시켜 로또번호를 생성하는 프로그램 만들기
		
		//1.난수를 뽑는다.
		//2.배열에 저장한다.
		//3.다시 난수를 뽑아서 배열에 저장
		//4.이전에 뽑은값들과 비교한다.
		//4-1.겹치는게 있으면 다시 뽑는다.
		//4-2.안겹치면 1부터 다시한다.
		
		Random random = new Random();
		
		outer:for(int i = 0; i < lotto.length;) {
			lotto[i] = random.nextInt(45)+1;
			
			//중복값을 비교하는 반복문
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
			}
			System.out.print(lotto[i]+" ");
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
