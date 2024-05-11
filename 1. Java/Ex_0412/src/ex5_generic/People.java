package ex5_generic;

//멀티타입 파라미터
//타입변수를 두개 이상 선언할 수 있다.
//이 경우 각 변수를 콤마로 구분한다.
public class People<T,M> {
	private T name;
	private M age;
	
	People(T name, M age){
		this.name = name;
		this.age = age;
	}
	
	public T getName() {
		return name;
	}
	
	public void setName(T name) {
		this.name = name;
	}
	
	public M getAge() {
		return age;
	}
	
	public void setAge(M age) {
		this.age = age;
	}
	
}





