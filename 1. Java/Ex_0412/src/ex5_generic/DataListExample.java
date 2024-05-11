package ex5_generic;

public class DataListExample {
	public static void main(String[] args) {
		DataList list = new DataList();
		
		//정수 저장
		list.add(10);
		//문자열 저장
		list.add("문자열");
		//실수 저장
		list.add(10.33);
		
		//데이터 출력
		for(int i = 0; i < list.size(); i++) {
			Object data = list.get(i);
			
			//저장된 타입이 어떤 타입인지 검사
			if(data instanceof Integer) {
				System.out.println("정수 : " + ((int)data+1));
			} else if(data instanceof Double) {
				System.out.println("실수 : " + ((double)data+0.5));
			} else if(data instanceof String) {
				System.out.println("문자열 : " + (String)data);
			}
		}
		
		//
		
		
		
		
		
		
		
	}
}
