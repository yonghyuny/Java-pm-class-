package ex3_variable;

public class Ex1_Variable {
	public static void main(String[] args) {
		//변수
		//자료형이 데이터를 담기 위한 컵의 크기와 재질이라면
		//변수는 데이터를 실제로 담기 위한 컵이다.
		
		//변수의 선언
		//자료형 변수명;
		
		//값의 대입
		//프로그래밍에서 =은 같다가 아닌 우측의 값을 좌측에 대입하겠다.
		//변수명 = 데이터;
		
		//변수의 초기화(initialization)
		//초기값을 지정한다.
		//초기값은 꼭 0이 아니어도 된다.
		//선언 + 대입
		//자료형 변수명 = 데이터;
		
		//변수명 명명 규칙
		//1. 숫자가 맨앞에 올 수 없다.
		//2. 영어 대소문자를 구별한다.(Name과 name은 다른 변수라고 인식한다.)
		//3. 일반적으로 영어 소문자로 시작한다.
		//4. _를 제외하고 특수기호가 포함될 수 없다.
		//5. 예약어 금지(switch,if,for,while 등등)
		//6. 한글은 사용하지 말것.
		
		//변수표기법
		//변수명은 문자수의 제한이 없으므로 최대한 변수의 의미를 쉽게 파악할 수 있도록
		//구체적으로 명명하는것이 좋다.
		
		//카멜표기법(camel case)
		//두번째 단어부터 첫글자를 대문자로 표기하는 방법
		//userName
		//phoneNumber
		//homeAddress
		
		//스네이크표기법
		//모든 단어가 소문자로 시작하고, 단어와 단어 사이는 _로 연결하는 방식
		//user_name
		//phone_number
		//home_address
		
		//변수로 데이터 불러오기
		//개발자가 데이터가 필요할 때 데이터의 값을 직접쓰는 대신
		//데이터를 변수에 저장해두고 변수의 이름을 불러서 그 값을 사용할 수 있게 해준다.
		
		//논리형
		boolean b = true; //초기화
		System.out.println("b : " + b);
		
		b = false;//대입, 대입은 몇번이고 다시 할 수 있다.
		System.out.println("b : " + b);
		
		//일반적으로 데이터의 타입과 변수의 타입은 일치해야 대입이 가능
		//b = 1;//Type mismatch
		
		System.out.println("--------------------------------");
		
		//문자형
		//문자형 데이터는 홑따옴표에 들어간 한글자이다.
		char ch = 'A';
		System.out.println("ch : " + ch);
		
		char ch2 = 65;
		System.out.println("ch2 : " + ch2);
		
		System.out.println("--------------------------------------");
		byte b1 = 127;
		short s = 32767;
		int n = 550;
		
		System.out.println("b1 : " + b1);
		System.out.println("s : " + s);
		System.out.println("n : " + n);
		
		System.out.println("--------------------------------------");
		
		//실수형
		//java에서 실수는 기본적으로 double형이기 때문에 
		//float자료형을 사용한다는것을 명시해줘야 한다.
		float f1 = 1.23f,f2 = 4.56f;
		
		System.out.println("f1 : " + f1);
		System.out.println("f2 : " + f2);
		
		System.out.println("---------------------------------");
		
		int myAge = 21;
		//myAge에 저장된 데이터가 복사되어 yourAge에 저장된다.
		int yourAge = myAge;
		
		System.out.println("----------------------------------");
		
		int su1 = 20;
		double su2 = 30;
		
		System.out.println("변경전");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		int temp;
		temp = su1;
		su1 = (int)su2;
		su2 = temp;
		
		System.out.println("변경후");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}






