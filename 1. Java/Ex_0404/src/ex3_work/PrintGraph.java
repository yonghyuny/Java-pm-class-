package ex3_work;

public class PrintGraph {

	/*
	 * 0의 갯수 : ############ 12
		1의 갯수 : ######### 9
		2의 갯수 : ########### 11
		3의 갯수 : ######## 8
		4의 갯수 : ############## 14
		5의 갯수 : ####### 7
		6의 갯수 : ######### 9
		7의 갯수 : ############# 13
		8의 갯수 : ####### 7
		9의 갯수 : ########## 10
	 * */
	//그래프를 그리는 기능 -> 함수(메서드)
	public String print(char ch, int num) {
		char[] val = new char[num];
		String str = "";
		for(int i = 0; i < val.length; i++) {
			str += val[i] = ch;
		}
		
		return str;	
	}
}
