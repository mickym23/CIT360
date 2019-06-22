package cedras.junit;

public class JUnit {

	public int num1;
	public int num2;

	public int subtract(int num1, int num2) {
		int diff = num1 - num2;
		return diff;
	}
	
	public int[] arrayOut() {
		int[] ar = {1, 2, 3, 4};
		return ar;
	}
	
	public boolean isFalse() {
		boolean out = false;
		return out;
	}
	
	public int notNull() {
		num1 = 1;
		return num1;
	}
	
	public String isNull() {
		String out = null;
		return out;
	}
	
	public String isEqual() { 
		String out = "out";
		return out;
	}
	
	public boolean isTrue() {
		boolean out = true;
		return out;
	}
}
