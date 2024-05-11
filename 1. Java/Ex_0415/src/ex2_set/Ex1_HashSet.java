package ex2_set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class Ex1_HashSet {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		//add()
		set.add("f");
		set.add("a");
		set.add("d");
		set.add("b");
		set.add("c");
		System.out.println(set);
		
		//set에는 중복된 데이터를 추가할 수 없다.
		set.add("a");
		set.add("b");
		
		System.out.println(set);
		
		//a라는 데이터 제거하기
		set.remove("a");
		System.out.println(set);
		
		set.removeAll(set);
		System.out.println(set);
		
		//index가 없어서 Hashset에 들어있는 요소를
		//하나씩 꺼낼수가 없다.
		
		//1 ~ 45까지 난수를 6개 뽑아서 로또번호 생성 코드 작성하기
		
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		while(true) {
			int r = new Random().nextInt(45)+1;
			hs1.add(r);
			
			if(hs1.size() == 6) {
				break;
			}
		}
		
		System.out.println(hs1);
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,1,2,2,3,4,5,65,6,6,67,7,7,7,7,8,8,9,9));
		System.out.println(list);
		
		HashSet<Integer> hs2 = new HashSet<>(list);
		
		System.out.println(hs2);
		
		ArrayList<Integer> result = new ArrayList(hs2);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
