package ex4_array;

public class Ex1_array {
	public static void main(String[] args) {
		int[] arr = new int[4];
		
		//System.out.println(arr);
		
		//출력된 값은 배열이 위치한 주소값이다.
		//이처럼 값을 직접 변수에 저장하는것이 아니라, 주소값이 저장되어
		//해당 주소를 통해 실제 주소게 접근하는 것을 참조변수라고 한다.
		
		//배열의 특징
		//배열 생성시 크기를 지정한다.
		//배열 생성 후 크기를 늘리거나 줄일 수 없다.
		//지정된 자료형의 값만 저장할 수 있다.
		
		//배열의 구조
		//1. 인덱스(index)
		//배열은 각 공간마다 위치를 알려주는 위치 값이 존재한다.
		//배열이 지니는 값들의 위치를 인덱스라고 부른다.
		//인덱스는 0부터 시작하여 순차적으로 증가한다.
		
		//배열명[index]
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		
		//배열의 마지막 index값
		//크기 - 1
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		//배열의 크기(길이)값
		//배열을 생성할 때 대괄호 안에 배열의 크기를 작성했다.
		//배열을 사용하면서 종종 배열의 크기값이 필요할 때가 있다.
		//배열은 내부적으로 length라고 하는 변수를 지니는데
		//해당 변수는 배열의 크기(길이)값을 가지고 있다.
		//크기를 알고싶을 때는 배열명.length 하면 된다.
		//이 변수의 값은 배열이 생성될 때 지정되며 변경할 수 없다.
		
		//배열의 출력2
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
