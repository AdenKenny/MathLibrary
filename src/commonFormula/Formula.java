package commonFormula;

public class Formula {

	public Formula() {

	}

	public static double getPi() {

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

}
