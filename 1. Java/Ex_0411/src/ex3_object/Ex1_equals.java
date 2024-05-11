package ex3_object;

public class Ex1_equals {
	public static void main(String[] args) {
		//기본자료형의 데이터를 비교할 때 == 을 사용한다.
		//객체를 동등비교할 경우 들어있는 값을 비교하는것이 아니라
		//메모리의 주소값을 비교하게 된다.
		//객체에 들어있는 값을 비교하기 위해서는 equals()메서드를
		//사용한다.
		
		//묵시적 객체 생성
		String str1 = "hello";
		String str2 = "hello";
		
		//명시적 객체 생성
		String str3 = new String("hello");
		
		System.out.println("str1 vs str2 : " + (str1 == str2));
		System.out.println("str1 vs str3 : " + (str1 == str3));
		//불변의 법칙
		//String 클래스는 값이 수정될 수 없다.
		//값이 수정되면 기존에 점유된 메모리와의 연결이 끊기고
		//수정된 데이터가 들어간 메모리를 새롭게 점유
		
		System.out.println("str1 vs str2 : " + str1.equals(str2));
		System.out.println("str1 vs str3 : " + str1.equals(str3));
		
		//System.identityHashCode()
		//객체의 고유한 hashCode()를 반환하는 메서드
		//hashCode()는 다른 객체이지만 주소가 동일한 경우가 있을 수 있다.
		System.out.println("str1 hashCode : " + System.identityHashCode(str1));
		System.out.println("str2 hashCode : " + System.identityHashCode(str2));
		
		
	}
}
