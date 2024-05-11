package ex3_label;

public class Ex1_label {
	public static void main(String[] args) {
		//일반적인 기타제어문은 단 하나의 반복문만을 이동하게 해준다.
		//break,continue에 라벨을 달아서 가장 가까이에 있는 반복문이 아닌
		//내가 원하는 반복문을 빠져나오거나, 이동할 수 있게 해준다.
		
		//label : 특정 반복문에 이름표를 붙여 두 개 이상의 반복문을
		//제어할 수 있도록 하는 키워드
		
		//label은 항상 쌍으로 존재한다.
		//label의 이름은 자기가 원하는대로 사용이 가능하다.
		
		//label은 자신을 포함하고 있는 상위 개념에게만 달 수 있다.
		
		h:for(int i = 1; i<=3; i++) {
			for(int k = 1; k<=10; k++) {
				System.out.print(k+" ");
			}
			
			for(int j = 1; j<=10; j++) {
				if(j % 2 == 0) {
					break h;
				}
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		
		//while과 label
		int n = 0;
		
		outer:while(true) {
			if(n >= 10) break;
			while(true) {
				n++;
				if(n % 3 == 0) {
					System.out.println("continue를 만남");
					continue outer;
				}
				System.out.println(n);
			}
		}
		
		System.out.println("---------------------------------");
		//switch 속의 break
		
		n = 0;
		
		w:while(n < 10) {
			n++;
			switch(n) {
			case 1:
				System.out.println("switch문 1번 거쳐감");
				//switch문에서 break는 switch문을 빠져나가는 기능을
				//우선시 한다.
				//break;
				
				//라벨을 달아주게 되면 기타제어문으로서의 break로
				//기능이 바뀐다.
				break w;
			case 2:
				System.out.println("switch문 2번 거쳐감");
				//반복문 안에서 switch를 사용할 때만
				//continue도 사용이 가능하다.
				continue;
			}
			System.out.println(n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
