package ex1_operator;

public class Ex5_Operator {
	public static void main(String[] args) {
		
		/*
		 * 과수원에서 배, 사과, 오렌지를 키우고 있다.
		 * 하루에 생산되는 양은 각각 5,7,5개
		 * 
		 * 1. 과수원에서 하루에 생산되는 과일의 총 개수
		 * 2. 시간당 생산되는 과일의 총 개수(float)
		 * */
		
		int pear = 5, apple = 7, orange = 5;
		
		int total = pear + apple + orange;
		
		System.out.println("하루에 생산되는 과일의 총 개수 : " + total);
		
		float avg = (float)total / 24;
		
		System.out.println("시간당 생산되는 과일의 개수 : " + avg);
		
		System.out.println("------------------------------------");
		
		//상자 한개에는 농구공이 5개 들어갈수 있다.
		//만약 농구공이 23개라면 몇개의 상자가 필요한가?
		
		//5개 -> 1개
		//6개 -> 2개
		//7개 -> 2개
		// ...
		//10 -> 2개
		//15 -> 3개
		
		//X가 m의 배수인지 판별
		//X % m == 0 -> X는 m의 배수이다.
		
		int ball = 23;
		
		int box = ball % 5 == 0 ? ball / 5 : ball / 5 + 1;
		
		System.out.println("필요한 상자의 개수 : " + box);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
