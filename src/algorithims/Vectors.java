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
			unit[i] = (vec[i].doubleValue() / length);
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
	
	public static Number dotProduct(Number[] vec1, Number[] vec2, Number theta) {
		
		if(vec1.length != vec2.length) {
			throw new ArithmeticException("You cannot mutiply two vectors with unequal dimensions");
		}
		
		return vectorLength(vec2).doubleValue() * vectorLength(vec2).doubleValue() * Math.cos(theta.doubleValue());
	}
	
	public static Number dotProduct(Number[] vec1, Number[] vec2) {
		
		if(vec1.length != vec2.length) {
			throw new ArithmeticException("You cannot mutiply two vectors with unequal dimensions");
		}
		
		double product = 0;
		
		int len = vec1.length;
		for(int i = 0; i < len; i++) {
			product+= vec1[i].doubleValue() * vec2[i].doubleValue();
		}
		
		return product;
	}
	
}
