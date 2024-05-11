package ex2_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		// switch에 기준값으로 들어갈 수 있는 데이터 타입
		// 1) 정수(byte,short, int)
		// 2) 문자형(char)
		// 3) 문자열(String)

		String str = "홍";
		String result = "";

		switch (str) {
		case "박":
			result = "박길동";
			break;
		case "이":
			result = "이길동";
			break;
		case "독고":
			result = "독고길동";
			break;
		case "홍":
			result = "홍길동";
			break;
		}
		
		System.out.println("이름 : " + result);

	}
}
