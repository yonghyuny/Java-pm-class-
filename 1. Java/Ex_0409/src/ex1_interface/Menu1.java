package ex1_interface;
//인터페이스 끼리는 상속이 가능하다.
//다중상속도 가능하다.
public interface Menu1 extends Menu2, Menu3 {
	String jajang();
}

interface Menu2{
	String boggembab();
}

interface Menu3{
	String tangsuyuck();
}