package ex1_List;

import java.util.ArrayList;
import java.util.List;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(10);
		System.out.println(list);
		
		list.add(1,50);//1번 index 위치에 삽입
		System.out.println(list);
		list.set(2, 100);
		System.out.println(list);
		list.add(55);
		System.out.println(list);
		
		if(list.contains(55)) {
			System.out.println("list에 55값이 존재합니다.");
		}
		
		//list가 비어있으면 true, 아니면 false를 반환
		list.isEmpty();
		
		//1번 index의 값을 삭제하고 삭제한 값을 반환
		list.remove(1);
		
		//삭제를 하고 나면 삭제한 인덱스보다
		//큰 곳에서 인덱스가 1씩 감소한다.
		
		list.clear();
		list.removeAll(list);
		//리스트는 남아있고, 안의 모든 요소만 삭제
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
