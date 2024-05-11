package ex4_static;

public class BankMain {
	public static void main(String[] args) {
		Bank b1 = new Bank("강남","02-222-2222");
		Bank b2 = new Bank("대전","042-333-3333");
		Bank b3 = new Bank("부산","052-444-4444");
		
		//static변수는 객체 생성 없이
		//클래스명.변수명으로 사용할 수 있다.
		Bank.interest = 1f;
		
		b1.printBank();
		b2.printBank();
		b3.printBank();
		
		
		
		
		
		
		
	}
}
