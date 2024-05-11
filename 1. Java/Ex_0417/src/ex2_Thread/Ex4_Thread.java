package ex2_Thread;

class SleepThread extends Thread{
	@Override
	public void run() {
		System.out.println("카운트다운 5초");
		for(int i = 5; i >= 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("종료!");
	}
}

public class Ex4_Thread {
	public static void main(String[] args) {
		SleepThread st = new SleepThread();
		st.start();
	}
}










