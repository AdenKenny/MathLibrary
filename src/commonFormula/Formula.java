package commonFormula;

public class Formula {

	public Formula() {

	}

	private static double getPi() {

		double s = 0;
		int n = 5000000; //Increase for more accuracy.

		for(int i = 1; i < n; i+=2) {
			s = s + ((1.0 /(2.0 * i - 1)) - (1.0 / (2.0 * i + 1)));
		}
		
		return s * 4;
	}
	
	public static void fibb() {
		
	}
	
	public static <T extends Number> Number abs(T num) {
		
		double x = num.doubleValue();
		
		if(x < 0) {
			return x*=-1;
		}
		
		return x * 1;
	}
	
	public static <T extends Number> Number square(Number num) {
		double x = num.doubleValue();
		
		return x * x;
	}
	
	public static <T extends Number> Number pow(T num, T pow) {
		
		double x = num.doubleValue();
		double a = (pow.doubleValue()) - 1;
		double s = num.doubleValue();
		
		for(int i = 0; i < a; i++) {
			s *= x;
		}
		
		return s;
	}
	
	private static boolean isWhole(Number s) {
		
		if(s instanceof Integer) {
			return true;
		}
		
		if(s.intValue() == s.doubleValue()) {
			return true;
		}
		
		return false;
	}
	
		
	
	

}
