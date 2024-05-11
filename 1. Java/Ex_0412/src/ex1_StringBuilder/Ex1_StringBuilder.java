package ex1_StringBuilder;

public class Ex1_StringBuilder {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Hello");
		
		//기존 문자열 뒤에 새 문자열 삽입
		//append()
		str.append(" World");
		System.out.println(str);
		
		//문자열 삭제
		//delete(int start, int end)
		str.delete(0, 6);
		System.out.println(str);
		
		//원하는 위치에 문자열 삽입
		//insert(시작위치 index, 삽입하고자 하는 문자열)
		str.insert(0,"Hello");
		System.out.println(str);
		
		//문자열의 길이
		//length()
		System.out.println(str+"의 길이 : " + str.length());
		
		//문자열 뒤집어 출력하기
		//reverse()
		str.reverse();
		System.out.println(str);
		
	}
}
