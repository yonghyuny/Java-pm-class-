package ex6_abstract;

public abstract class AbsParent {

	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	abstract public void setValue(int n);
}
