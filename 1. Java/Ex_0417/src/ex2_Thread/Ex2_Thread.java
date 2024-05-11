package ex2_Thread;

public class Ex2_Thread {
	public static void main(String[] args) {
		//Runnable인터페이스를 람다식을 통해 구현하기.
		Runnable run = () -> {
			for(int i = 1; i <= 10; i++) {
				System.out.println("람다식 구현 : " + i);
			}
		};
		
		Thread t = new Thread(run);
		t.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("main함수 : " + i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
