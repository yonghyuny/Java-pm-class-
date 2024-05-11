package ex4_array;

public class Ex2_array {
	public static void main(String[] args) {
		//배열의 초기값
		//배열은 생성과 동시에 데이터 자료형 별로 기본값이 주어진다.
		//자료형		초기값
		//정수형		0
		//실수형		0.0
		//문자형		''
		//객체형		null
		
		int[] intArray = new int[5];
		String[] strArray = new String[5];
		
		int[] varArray = {1,2,3,4,5};
		
		System.out.println("intArray[0] : " + intArray[0]);
		System.out.println("intArray[1] : " + intArray[1]);
		
		System.out.println("strArray[0] : " + strArray[0]);
		System.out.println("strArray[1] : " + strArray[1]);
		
		System.out.println("varArray[0] : " + varArray[0]);
		System.out.println("varArray[1] : " + varArray[1]);
		
		System.out.println("-----------------------------");
		
		int[] iArr = new int[4];
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] = (i+1)*100;
			System.out.println(iArr[i]);
		}
		
		
		
		
		
		
		
		
	}
}
