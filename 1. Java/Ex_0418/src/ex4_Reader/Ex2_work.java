package ex4_Reader;

import java.io.FileReader;

public class Ex2_work {
	public static void main(String[] args) {
		//test.txt에 아무내용이나 적는다. 한글,영어 대문자,소문자,숫자 섞어서 작성
		//test.txt의 내용을 읽어서 알파벳 대문자와 소문자의 개수를 출력하세요
		
		//대문자 : X개
		//소문자 : X개
		
		int upper = 0;
		int lower = 0;
		
		try {
			FileReader fr = new FileReader("C:\\web1500_lhj/test.txt");
			int code = 0;
			
			while((code = fr.read()) != -1) {
				if(code >= 'a' && code <= 'z') {
					lower++;
				}
				if(code >= 'A' && code <= 'Z') {
					upper++;
				}
			}
			
			System.out.println("대문자 : " + upper+"개");
			System.out.println("소문자 : " + lower+"개");
			
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
	}
}
