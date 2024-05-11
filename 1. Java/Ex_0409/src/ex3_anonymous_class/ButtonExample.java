package ex3_anonymous_class;

interface buttonClickListener{
	public void click();
}

public class ButtonExample {
	
	public class Button{
		private buttonClickListener listener;
		
		public void setListener(buttonClickListener listener) {
			this.listener = listener;
		}
		
		//버튼 클릭 기능
		public void click() {
			if(listener != null) {
				//인터페이스를 구현한 클래스에 오버라이딩 된
				//메서드를 호출
				this.listener.click();
			}
		}
	}
	
	public static void main(String[] args) {
		ButtonExample exam = new ButtonExample();
		
		//버튼객체
		ButtonExample.Button button = exam.new Button();
		
		button.setListener(new buttonClickListener() {
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");	
			}
		});
		
		button.click();
	}
	
	
	
	
	
}
