package ex5_generic;

import java.util.Arrays;

//타입변수 T를 갖는 printArr메서드를 만든다.
//printArr은 배열의 요소를 순차적으로 출력하는 코드 작성
//GenMain에서  Integer[], Double[], Character[]배열을
//만든뒤 Gen클래스의 printArr메서드를 호출하여 배열의 내용 출력하기
//출력결과
// 1 2 3 4 5
// 1.1 2.2 3.3 4.4 5.5
// A B C D E
public class Gen {

	public <T>void printArr(T[]arr) {
		System.out.println(Arrays.toString(arr));
	}
}


