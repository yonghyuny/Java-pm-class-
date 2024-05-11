package ex4_work;
//스캐너를 이용하여 키보드에서 숫자를 입력받고
//스레드에서 입력받은 숫자부터 1씩 감소하다 0이 되었을 때
//"종료"라는 메세지와 함께 스레드를 빠져나오도록 만들어보자.

import java.util.Scanner;

class ThreadCount extends Thread{
	
	private int n;
	
	public ThreadCount(int n) {
		this.n = n;
	}
	
	@Override
	public void run() {
		for(int i = n; i >=0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("종료");
	}
}

public class ThreadCountMain {
	public static void main(String[] args) {
		System.out.print("값 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		//하나의 클래스에서 다른 클래스로 데이터를 가져가는법
		//1. 생성자의 파라미터로 전달
		ThreadCount tc = new ThreadCount(sc.nextInt());
		tc.start();
		//2. 메서드의 파라미터로 전달
	}
}
