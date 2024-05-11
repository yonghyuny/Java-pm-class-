package ex3_method;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int n = mt.add(10, 7);
		System.out.println("두 수의 합은 : " + n+"입니다.");
		System.out.println("-------------------------");
		mt.oneToN(28);

		System.out.println("---------------------------");
		mt.multi(5);
		
		System.out.println("---------------------------");
		
		int[] arr = {1,6,9,2,5,3,7,4};
		
		mt.maxFinder(arr);
		
		double area = mt.circleArea(5);
		System.out.println("원의 넓이: " + area);
		
		mt.circleRound(5);
		
		
		
		
		
		
		
	}
}
