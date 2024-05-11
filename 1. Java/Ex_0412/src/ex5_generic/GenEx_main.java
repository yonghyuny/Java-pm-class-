package ex5_generic;

public class GenEx_main {
	public static void main(String[] args) {
		//타입변수에는 기본자료형이 들어갈 수 없다.
		//따라서, int,double드으이 기본 자료형을 타입변수에 이용하고자 할 때는
		//Integer,Double등의 Wrapper클래스가 필요하다.
		GenEx<String> v1 = new GenEx<>();
		v1.setValue("문자열");
		System.out.println(v1.getValue());
		
		GenEx<Integer> v2 = new GenEx<>();
		v2.setValue(1000);
		System.out.println(v2.getValue());
		
		GenEx<Character> v3 = new GenEx<>();
		v3.setValue('A');
		System.out.println(v3.getValue());
		
		GenEx<Double> v4 = new GenEx<>();
		v4.setValue(3.14);
		System.out.println(v4.getValue());
		
		People<String, Integer> p1 = new People<>("Jack", 20);
		People<String,Integer> p2 = new People<>("Steve",30);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println("-----------------");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println("-----------------");
		
		Student<String> s1 = new Student<>("20240001");
		
		System.out.println("학번 : " + s1.getOneStudent()); 
		
		System.out.println(s1.getId(202040002)+1);
		
		
		
		
		
	}
}
