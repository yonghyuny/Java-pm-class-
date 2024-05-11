package ex1_List;

import java.util.ArrayList;
import java.util.Scanner;

//유저의 아이디와 패스워드를 가지는 UserInfo클래스를 만들고
//Main에서 유저의 정보를 ArrayList에 추가하여 출력해보자.
//---결과---
//아이디 생성 : aaa
//패스워드 입력 : 1234
//aaa
//1234
//-----------------
//아이디 생성 : aaa
//중복된 아이디
//아이디 생성 : bbb
//패스워드 입력 : 1234
//aaa
//1234
//-----------------
//bbb
//1234
//-----------------
public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		outer:while(true) {
			System.out.print("아이디 생성 : ");
			
			UserInfo ui = new UserInfo();
			ui.setId(sc.next());
			
			//중복체크
			for(int i = 0; i < list.size(); i++) {
				if(ui.getId().equals(list.get(i).getId())) {
					System.out.println("중복된 아이디");
					continue outer;
				}
			}
			
			System.out.print("패스워드 입력 : ");
			ui.setPwd(sc.nextInt());
			
			list.add(ui);
			
			for(UserInfo i : list) {
				System.out.println(i.getId());
				System.out.println(i.getPwd());
				System.out.println("---------------");
			}
			
		}
	}
	
}







