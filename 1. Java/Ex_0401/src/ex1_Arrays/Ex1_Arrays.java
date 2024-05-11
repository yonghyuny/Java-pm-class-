package ex1_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex1_Arrays {
	public static void main(String[] args) {
		//Arrays클래스
		//배열의 복사, 항목 정렬, 항목 검색 등 배열을 다루기 위한
		//다양한 메서드를 제공합니다.
		//Arrays클래스를 사용하면 배열의 기능을 더욱 쉽게 사용할 수 있다.
		
		//Arrays에 속해있는 기능을 사용할 때는 Arrays.메서드명()으로 
		//작성하여 사용한다.
		
		int[] arr = {1,6,3,2,10,7,9,8,5,4};
		//배열의 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Arrays.toString(배열명);
		//반복문의 도움 없이 배열을 출력할 수 있도록 도와준다.
		//배열에 정의된 값을 문자열(String)형태로 변환하여 출력해준다.
		
		System.out.println(Arrays.toString(arr));
		
		//배열의 정렬
		//Arrays.sort();
		//기본적으로 오름차순으로 정렬
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//내림차순 정렬
		//Comparator.reverseOrder()
		//하지만 기본자료형의 배열로는 불가능하다.
		//기본자료형의 클래스타입이 필요한데 이를 Wrapper클래스 라고 한다.
		//int -> Integer
		//char -> Character
		//float -> Float
		//double -> Double
		//boolean -> Boolean
		
		Integer[] arr2 = {1,6,3,2,10,7,9,8,5,4};
		
		Arrays.sort(arr2, Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
	}
}
