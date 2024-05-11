package ex1_calendar;

public class DeskCalendar extends Calendar{
	
	public DeskCalendar(String color, int months) {
		super(color,months);
	}
	
	@Override
	public void hanging() {
		System.out.println(color+"달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
	}
	
	public void oneTheDesk() {
		System.out.println(color+"달력에 책상을 세울 수 있습니다.");
	}
	
	
	
	
	
}
