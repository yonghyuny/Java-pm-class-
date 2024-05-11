package ex2_work;

import java.util.Random;

public class Start {

	Random rnd = new Random();
	
	int rnum = rnd.nextInt(50)+1;
	int count = 1;
	public void check(int number) {
		if(number == rnum) {
			System.out.println(count+"회 만에 정답!");
		} else if(number > rnum) {
			System.out.println("Down!");
			count++;
		} else {
			System.out.println("Up!");
			count++;
		}
	}
	
}
