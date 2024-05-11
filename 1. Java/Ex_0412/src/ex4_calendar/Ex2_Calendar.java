package ex4_calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Ex2_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");
		int year = sc.nextInt();
		
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		//인자로 전달된 값을 날짜로 지정
		cal.set(year,month-1,1);
		
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		//달의 마지막 날짜를 구한다.
		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		//지정한 달의 시작하는 요일을 구함 1이 일요일 7이 토요일
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//달력 시작 날의 주말 처리
		for(int i = 1; i < week; i++) {
			System.out.printf("\t");
		}
		
		for(int i = 1; i <=lastOfDate; i++) {
			System.out.printf("%d\t",i);
			
			if(week % 7 == 0) {
				System.out.println();
			}
			week++;
		}
	}
}
