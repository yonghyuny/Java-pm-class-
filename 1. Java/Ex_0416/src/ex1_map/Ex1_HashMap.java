package ex1_map;

import java.util.HashMap;

public class Ex1_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, Character> map = new HashMap<>();
		//put(K key, V value);
		//hashmap에 데이터 추가하기
		map.put(1, 'A');
		map.put(2, 'B');
		map.put(3, 'C');
		
		System.out.println(map);
		
		//map에 저장되는 value는 중복될 수 있다.
		map.put(4, 'A');
		
		System.out.println(map);
		
		//map의 key값은 중복이 될 수 없다.
		//이미 있는 key를 사용하면 value가 갱신이 된다.
		map.put(1, 'F');
		
		System.out.println(map);
		
		//remove(K key)
		//key를 통해 요소를 삭제
		map.remove(3);
		
		System.out.println(map);
		
		//size()
		//map의 크기를 반환
		System.out.println("map의 크기 : " + map.size());
		
		//get(K key);
		//key를 통해 value를 반환
		char res = map.get(1);
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
	}
}
