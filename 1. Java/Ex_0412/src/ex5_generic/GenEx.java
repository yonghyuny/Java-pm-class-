package ex5_generic;

public class GenEx<T> {
	//T를 타입변수(type variable)이라고 하며 Type의 첫글자에서 따왔다.
	//다른 알파벳이 들어가도 되지만, 통상적으로 E(Element), K(key), V(value)를 많이 사용한다.
	
	T value;
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	
	
	
	
	
	
}
