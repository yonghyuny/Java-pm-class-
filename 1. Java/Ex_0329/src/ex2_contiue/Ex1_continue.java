package ex2_contiue;

public class Ex1_continue {
	public static void main(String[] args) {
		//continue : 반복문내에서 특정 문장을 건너뛰고자 할 때 사용
		for(int i = 1; i<=2; i++) {
			for(int j = 1; j<=5;j++) {
				if(j % 2 == 0)continue;
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
		//로또번호를 뽑는다.
		//1 ~ 45중 6개를 뽑아야 한다.
		//중복되는 수가 있으면 안됨
		//6개를 뽑는데 중복되는 숫자가 있으면 다시 뽑아
		
		//while문과 continue
		
		int n = 0;
		while(n < 10) {
			n++;
			
			if( n % 2 != 0) continue;
			System.out.print(n+" ");
		}
		
		
		
		
		
		
		
		
	}
}
