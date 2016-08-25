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
	
	public static Number vectorLength(Number[] vec) {
		
		int total = 0;
		
		int len = vec.length;
		for(int i = 0; i < len; i++) {
			total+= (vec[i].doubleValue() * vec[i].doubleValue());
		}
		
		return Math.sqrt(total);
	}
	
	public static Number[] unitVec(Number[] vec) {
		
		double length = vectorLength(vec).doubleValue();
		int len = vec.length;

		Number[] unit = new Number[len];
	
		for(int i = 0; i < len; i++) {
			double temp = vec[i].doubleValue();
			unit[i] = (temp / length);
		}
		
		return unit;
	}
	
	public static Number[] scalarMult(Number[] vec, Number r) {
		
		int len = vec.length;
		for(int i = 0; i < len; i++) {
			vec[i] = vec[i].doubleValue() * r.doubleValue();
		}
		
		return vec;
	}
	
}
