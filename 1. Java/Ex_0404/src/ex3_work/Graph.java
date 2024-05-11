package ex3_work;

import java.util.Random;

public class Graph {
	public static void main(String[] args) {
		//0 ~ 9 까지 난수를 100번 뽑아서 저장
		int[] num = new int[100];
		
		Random rnd = new Random();
		
		int[] count = new int[10];
		
		for(int i = 0; i < num.length;i++) {
			num[i] = rnd.nextInt(10);
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		//0 ~9까지 각 난수가 몇개씩 나왔나 카운트
		for(int i =0; i < num.length; i++) {
			count[num[i]]++; // 0 ~ 9
		}
		
		PrintGraph pg = new PrintGraph();
		for(int i = 0; i < count.length; i++) {
			System.out.println(i+"의 개수 : " + pg.print('#',count[i])+ " " + count[i]);
		}
		
		
	}
}
