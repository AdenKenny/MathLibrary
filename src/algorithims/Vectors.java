package algorithims;

public class Vectors {

	public static boolean vectorEquals(Number[] vec1, Number[] vec2) {
		
		if(vec1.length != vec2.length) {
			return false;
		}
		
		int len = vec1.length;
		for(int i = 0; i < len; i++) {
			if(vec1[i] != vec2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static Number[] vectorAdd(Number[] vec1, Number vec2[]) {
		
		if(vec1.length != vec2.length) {
			throw new ArithmeticException("You cannot add two vectors with unequal dimensions");
		}
		
		Number[] toReturn = new Number[vec1.length];
		
		int len = vec1.length;
		for(int i = 0; i < len; i++) {
			toReturn[i] = vec1[i].doubleValue() + vec2[i].doubleValue();
		}
		
		return toReturn;
	}
	
	public static Number[] vectorSub(Number[] vec1, Number vec2[]) {
		
		if(vec1.length != vec2.length) {
			throw new ArithmeticException("You cannot subtract two vectors with unequal dimensions");
		}
		
		Number[] toReturn = new Number[vec1.length];
		
		int len = vec1.length;
		for(int i = 0; i < len; i++) {
			toReturn[i] = vec1[i].doubleValue() - vec2[i].doubleValue();
		}
		
		return toReturn;
	}
	
}
