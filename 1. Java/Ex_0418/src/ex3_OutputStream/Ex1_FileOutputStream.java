package ex3_OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1_FileOutputStream {
	public static void main(String[] args) {
		//FileOutputStream
		//작성한 내용을 외부로 출력할 때 사용
		//write()메서드를 사용
		
		FileOutputStream fos = null;
		try {
			//경로에 파일이 없으면 만들어준다.
			//확장자를 마음대로 지정할 수 있다.
			fos = new FileOutputStream("C:\\web1500_lhj/fileOut.sql",true);
			
			fos.write('f');
			fos.write('i');
			fos.write('l');
			fos.write('e');
			
			String msg = "fileOutput 예제입니다.\n";
			String msg2 = "여러줄도 가능\n";
			
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
