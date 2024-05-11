package ex3_Wrapper;

public class Ex1_Wrapper {
	public static void main(String[] args) {
		//Wrapper클래스
		//프로그램에 따라 기본 타입의 데이터를 객체형으로 표현해야 하는 경우가 있다.
		//이를 위해 자바에서는 기본자료형을 객체로 다루기 위한 클래스를 제공한다.
		
		//int -> Integer
		//double -> Double
		//char -> Character
		//boolean -> Boolean
		
		//오토박싱
		//기본타입을 객체로 자동으로 바꿔준다.
		Integer num01 = 10;
		Integer num02 = Integer.valueOf(10);
		Integer num03 = new Integer(10);
		
		//오토언박싱
		//객체타입을 기본자료형으로 바꿈
		int i = num01;
		
		
		
		
	}
}
