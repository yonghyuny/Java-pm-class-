package ex2_Math;

public class Ex1_Math {
	public static void main(String[] args) {
		//Math클래스
		//수학에서 자주 사용하는 상수들을 미리 구현해놓은 클래스
		//자바에서 수학 계산이 필요할 때 주로 사용
		//객체를 선언하지 않고 바로 사용할 수 있도록 해당 클래스가
		//제공하는 모든 메서드는 모두 정적 메서드로 이루어져있다.
		
		//올림
		System.out.println("3.51올림 : " + Math.ceil(3.51));
		
		//내림
		System.out.println("13.61버림 : " + Math.floor(13.61));
		
		//반올림
		System.out.println("12.8반올림 : " + Math.round(12.8));
		
		System.out.println("3.141592 : " + Math.round(3.141592*10)/10.0);
		
		//절대값 구하기
		System.out.println("절대값 : " + Math.abs(-50));
		
		//최대값 구하기
		int maxValue = Math.max(30, 60);
		
		System.out.println("30,60 최대값 : " + maxValue);
		
		//최소값 구하기
		int minValue = Math.min(40, 70);
		
		System.out.println("40,70 최대값 : " + minValue);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
