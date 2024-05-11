package ex2_work;

public class CalTest {

	public int getResult(int su1, int su2, String op) {
		int result = 0;
		switch(op) {
		case "+":
			result = su1+su2;
			break;
		case "-":
			result = su1-su2;
			break;
		case "*":
			result = su1*su2;
			break;
		case "/":
			result = su1/su2;
			break;
		}
		
		return result;
	}
	
	
	
	
	
}
