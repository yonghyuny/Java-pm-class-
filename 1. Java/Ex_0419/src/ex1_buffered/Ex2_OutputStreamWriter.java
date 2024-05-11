package ex1_buffered;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex2_OutputStreamWriter {
	public static void main(String[] args) {
		FileOutputStream out = null;
		OutputStreamWriter os = null;
		
		try {
			out = new FileOutputStream("C:\\web1500_lhj/streamWriter.txt");
			os = new OutputStreamWriter(out,"UTF-8");
			
			System.out.println("파일 생성 시작");
			String[] strArray = {"OutputStreamWriter에 대해서 배웁니다.",
								 "We are learning about OutputStreamWriter"};
			
			for(String str : strArray) {
				os.write(str);
			}
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(os != null) {
					os.close();
				}
				
				if(out != null) {
					out.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
