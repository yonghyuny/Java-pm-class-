package ex3_anonymous_class;

import java.awt.Event;

import javax.swing.JButton;

public class PersonMain {
	public static void main(String[] args) {
		Student s = new Student();
		s.mySelf();
		
		Person p1 = new Person() {
			@Override
			public void mySelf() {
				System.out.println("저는 직장인입니다.");
			}
		};
		
		p1.mySelf();	
	}
}





