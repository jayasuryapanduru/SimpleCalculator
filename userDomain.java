package SimpleCalculator;

public class userDomain {
		
	private int a;
	private int b;

	public int getA() {
		 System.out.println("Debug: Value of a set to " + this.a);
		return a; 
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		 System.out.println("Debug: Value of a set to " + this.b);
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
