package arith;

public class BasicMath {

	public BasicMath() {
		
	}
	
	public int intAdd(int a, int b) {
		
		return a + b;
	}
	
	public int intSub(int a, int b) {
		
		return a - b;
	}
	
	public int intMult(int a, int b) {
		
		return a * b;
	}
	
	public int intDivide(int a, int b) { //Very accurate
		
		double d = a / b;
		
		return (int) Math.round(d);
	}
	
	public float floatAdd(float a, float b) {
		
		return a + b;
	}
	
	public float floatSub(float a, float b) {
		
		return a - b;
	}
	
	public float floatMult(float a, float b) {
		
		return a * b;
	}
	
	public float floatDivide(float a, float b) {
		
		return a / b;
	}
	
	public double doubleAdd(double a, double b) {
		
		return a + b;
	}
	
	public double doubleSub(double a, double b) {
		
		return a - b;
	}
	
	public double doubleMult(double a, double b) {
		
		return a * b;
	}
	
	public double doubleDivide(double a, double b) {
		
		return a / b;
	}
	
}
