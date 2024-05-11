package ex1_List;
//아이디 생성 : abc
//abc
//아이디 생성 : abc
//중복된 아이디
//아이디 생성 : abc3
//abc abc3

import java.util.ArrayList;
import java.util.Scanner;

//아이디가 3개가 만들어지면 프로그램 종료
public class Ex5_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		outer:while(true) {
			System.out.print("아이디 생성 : ");
			String id = sc.next();
			
			//중복체크
			for(int i = 0; i < list.size(); i++) {
				if(id.equals(list.get(i))) {
					System.out.println("중복된 아이디");
					continue outer;
				}
			}
			
			
			
			list.add(id);
			
			for(String val : list) {
				System.out.print(val+" ");
			}
			System.out.println();
			if(list.size() == 3) {
				break;
			}
		}
		
		
		
		
		
		
		
	}
}
