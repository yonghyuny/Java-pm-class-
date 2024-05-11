package ex4_calendar;

import java.util.Calendar;

public class Ex1_Calendar {
	public static void main(String[] args) {
		//Calendar클래스에는 여러 가지 상수 필드들이 존재한다.
		//날짜를 표시하기 위해 자주 사용하는 값들을 상수화 하여 관리한다.
		
		Calendar cal = Calendar.getInstance();
		
		//get()
		//Calendar필드에 저장된 값을 반환
		
		int year = cal.get(Calendar.YEAR);
		//0~11까지 존재, 0이 1월 11이 12월
		int month =cal.get(Calendar.MONTH)+1;
		//해당 달의 몇일째인가
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("오늘 날짜는 %d년 %d월 %d일 입니다.\n",year,month,day);
		
		//set(int field, int value)
		//Calendar클래스의 필드를 특정 값으로 설정
		
		
	}
}
