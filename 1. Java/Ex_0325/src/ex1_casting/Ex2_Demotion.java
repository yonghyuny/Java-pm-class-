package ex1_casting;

public class Ex2_Demotion {
	public static void main(String[] args) {
		//강제형변환(Demotion)
		//큰 컵의 물을 작은 컵에 옮겨담는것과 같다.
		//물의 양에 따라서 보존될 수도 있지만 넘칠수도 있다.
		//큰 자료형에서 작은 자료형으로 옮길 때 데이터의 손실이 발생할 수도 있고 아닐수도 있다.
		
		//형변환 방법
		//(원하는 자료형)데이터 or 변수;
		
		char c = 'B'; //2byte
		int n = 70; //4byte
		
		c = (char)n;
		
		System.out.println("c : " + c);
		
		float f = 5.5f;
		int i = 100;
		
		i = (int)f;
		
		//float에서 int로 캐스팅 되면서 소수점 이하 자리를 상실함
		System.out.println("i : " + i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
