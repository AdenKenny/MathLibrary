package arith;

@SuppressWarnings("unused")
public class BasicMath {

	public static int intAdd(int a, int b) {
		
		return a + b;
	}
	
	public static int intSub(int a, int b) {
		
		return a - b;
	}
	
	public static int intMult(int a, int b) {
		
		return a * b;
	}
	
	public static int intDivide(int a, int b) { //Very accurate
		
		double d = a / b;
		
		return (int) Math.round(d);
	}
	
	public static float floatAdd(float a, float b) {
		
		return a + b;
	}
	
	public static float floatSub(float a, float b) {
		
		return a - b;
	}
	
	public static float floatMult(float a, float b) {
		
		return a * b;
	}
	
	public static float floatDivide(float a, float b) {
		
		return a / b;
	}
	
	public static double doubleAdd(double a, double b) {
		
		return a + b;
	}
	
	public static double doubleSub(double a, double b) {
		
		return a - b;
	}
	
	public static double doubleMult(double a, double b) {
		
		return a * b;
	}
	
	public static double doubleDivide(double a, double b) {
		
		return a / b;
	}
	
	private static Number recAdd(Number a, Number b) {
		double s = a.doubleValue();
		double r = b.doubleValue();
		
		try {
			
			
			if(s == 0) {
				return r;
			}
			
			else if(r == 0) {
				return s;
			}
			
			return recAdd(s + 1, r - 1);
		}
		
		catch(StackOverflowError e) {
			return r + s;
		}
		
	}
	
	private static Number recSub(Number a, Number b) {
		
		double s = a.doubleValue();
		double r = b.doubleValue();
		
		try {
			
			if(s == 0) {
				return r;
			}
			
			else if(r == 0) {
				return s;
			}
			
			return recSub(s - 1, r - 1);
		}
		
		catch(StackOverflowError e) {
			return r - s;
		}
		
	}
	
}
