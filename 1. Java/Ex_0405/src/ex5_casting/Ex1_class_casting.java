package ex5_casting;

class Parent{};
class Child extends Parent{};


public class Ex1_class_casting {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		Parent p2 = new Child(); //자동 타입변환
		Parent p3 = c1; //자동타입변환
		//Child c2 = p1; 자동 타입 변환이 되지 않음
		
		//기본 자료형끼리 비교할 때 == 연산자는 값이 같은지 비교
		//객체끼리 비교를 할 때 주소값이 같은지 비교
		if(p3 == c1) {
			System.out.println("p3와 c1은 같은 객체를 참조하고 있습니다.");
		}
		
		//타입을 변환한다고 객체가 바뀌는것은 아니고, 객체는 보존되고
		//사용을 부모 객체 처럼한다.
		//자동타입변환은 반드시 자식 클래스의 객체를 부모 타입으로 변환할 때
		//적용할 수 있다. 1차 상속관계가 아니더라도 상위 계층의 타입으로
		//변환할 수 있다. 하지만 같은 상위 계층을 갖고 있더라도,
		//타입변환을 시도하려는 두 클래스의 상속 관계가 없다면 
		//타입변환은 불가능 하다.
	}
}





