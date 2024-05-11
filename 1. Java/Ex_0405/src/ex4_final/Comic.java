package ex4_final;

public class Comic extends Book{

	boolean isColor;
	
	public Comic(String title, String author, boolean isColor) {
		super(title,author);
		this.isColor = isColor;
	}
	
	//info_title()메서드는 final이 선언되어있어서
	//오버라이딩 할 수 없다.
	
	@Override
	public void info_author() {
		System.out.println("이 만화책의 저자는 "+ super.getAuthor() +"입니다.");
	}
	
	public void info_color() {
		if(isColor) {
			System.out.println("이 만화책은 컬러입니다.");
		} else {
			System.out.println("이 만화책은 흑백입니다.");
		}
	}
	
	
	
	
	
	
	
	
	
}
