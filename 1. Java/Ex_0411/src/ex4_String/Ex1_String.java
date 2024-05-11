package ex4_String;

import java.util.Arrays;

public class Ex1_String {
	public static void main(String[] args) {
		
		String str = "Kim Mal Ddong";
		//length();
		System.out.println("문자열의 길이 : " + str.length());
		
		//indexOf(char ch);
		//해당 문자의 index 번호 반환
		//탐색 방향은 왼쪽에서 오른쪽
		//매개변수로 문자열도 가능
		System.out.println("a의 index번호 : " + str.indexOf('a'));
		
		//charAt(int index)
		//해당 index에 값을 반환
		System.out.println("5번 index의 값 : " + str.charAt(5));
		
		//substring(int start, int end);
		//시작 index부터, end index 전까지 값을 문자열로 반환
		System.out.println("0부터 3까지 잘라내기 : " + str.substring(0,4));
		
		//split(String str)
		//매개변수에 들어간 글자를 기준으로 문자열을 잘라 배열로 반환
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		
		//문자열을 다른 타입으로 바꾸는 방법
		String n = "1004";
		int number = Integer.parseInt(n);
		
		System.out.println(number+1);
		
		//m, M는 다르다고 판별함
		//equalsIgnoreCase 대소문자 구별하지 않음
		String str2 = "kim mal ddong";
		System.out.println("비교 : "+str.equalsIgnoreCase(str2));
		
		String str3 = "    trim     ";
		System.out.println(str3);
		//trim()
		//앞뒤 공백 제거
		System.out.println(str3.trim());
		
		//replace(char old, char new)
		System.out.println(str.replace(" ", "/"));
	
		
	}
}
