package ex3_method;

public class MethodTest {
	//두 수를 더하여 반환하는 add함수 만들고
	//메인에서 값을 두 개 받아 출력하기
	
	public int add(int x, int y) {
		int a = x;
		int b = y;
		int sum = a+b;
		return sum; 
	}
	
	//1 ~ n까지의 총합을 출력하는 oneToN메서드 만들기
	public void oneToN(int n) {
		int sum = 0;
		for(int i = 1; i<=n;i++) {
			sum += i;
		}
		System.out.printf("1 ~ %d까지의 총합 : %d\n",n,sum);
	}
	
	//dan을 받아와서 구구단을 출력하는 multi()메서드 작성하기
	
	public void multi(int dan) {
		for(int i =1; i <=9; i++) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
		}
	}
	
	//배열에 최대값을 찾아 출력하는 maxFinder메서드 만들기
	
	public void maxFinder(int[] arr) {
		int max = arr[0];
		/*
		 * for(int x = 0; x < arr.length; x++) {
			if(arr[x] > max) max = arr[x];
			*/
		for(int x : arr) {
			if(x > max) max = x;
		}
		System.out.println("최대값 : " + max);
	}
	
	//원의 넓이를 구하는 circleArea메서드를 만들고
	//원의 둘레를 구하는 circleRound메서드를 만듭니다.
	//main으로부터 반지름을 넘겨받고
	//원의 넓이는 반환받고, 원의 둘레는 함수안에서 출력하세요.
	//원의 넓이 : 3.14 * 반지름 * 반지름
	//원의 둘레 : 2 * 3.14 * 반지름
	
	public double circleArea(int radius) {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	public void circleRound(int radius) {
		double round = 2 * 3.14 *radius;
		System.out.println("원의둘레 : " +  round);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
