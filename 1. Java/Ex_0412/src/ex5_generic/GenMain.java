package ex5_generic;

public class GenMain {
	public static void main(String[] args) {
		Integer[] iArr = {1,2,3,4,5};
		Double[] dArr = {1.1,2.2,3.3,4.4,5.5};
		Character[] cArr = {'A','B','C','D','E'};
		
		Gen g = new Gen();
		
		g.printArr(iArr);
		g.printArr(dArr);
		g.printArr(cArr);
		
		
	}
}
