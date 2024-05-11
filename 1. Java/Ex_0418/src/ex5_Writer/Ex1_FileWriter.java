package ex5_Writer;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		//FileWirter
		//문자 기반의 출력스트림
		
		try {
			FileWriter fw = new FileWriter("C:\\web1500_lhj/fileWriter예제.txt",true);
			
			fw.write("첫번째 줄 작성합니다.\n");
			fw.write("두번째 줄도 문제없지\n");
			System.out.println("작성 완료");
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
