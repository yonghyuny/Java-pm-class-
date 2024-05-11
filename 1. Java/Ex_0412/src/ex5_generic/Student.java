package ex5_generic;

public class Student<T> {

	private T studentId;
	
	public Student(T studentId) {
		this.studentId = studentId;
	}
	
	public T getOneStudent() {
		return studentId;
	}
	
	//제네릭 메서드
	//메서드의 선언부에 제네릭타입이 선언된 메서드
	//타입변수의 선언 위치는 반환형 앞이고, 선언한 제네릭 타입으로
	//반환형, 매개변수의 타입이 결정된다.
	
	public <T> T getId(T id) {
		return id;
	}
	
	
	
	
	
	
	
	
}
