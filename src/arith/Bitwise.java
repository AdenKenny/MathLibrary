package arith;

import java.util.Map;
import util.LookupTable;
import util.Pair;

public class Bitwise {

	public static int bitAdd(int a, int b) {

		while (b != 0) {
			int carry = (a & b);
			a = a ^ b;
			b = carry << 1;
		}

		return a;

	}

	public static int rBitAdd(int a, int b) {

		if (b == 0) {
			return a;
		}

		return rBitAdd(a ^ b, (a & b) << 1);
	}

	public static int bitSub(int a, int b) {

		while (b != 0) {
			int borrow = (~a) & b;
			a = a ^ b;
			b = borrow << 1;
		}

		return a;
	}

	public static int rBitSub(int a, int b) {// Recursive bit substitution

		if (b == 0) {
			return a;
		}

		return rBitSub(a ^ b, (~a & b) << 1);
	}

	public static <V> float bitDiv(int a, int b) { // Divide b. Lookup table.

		int temp = a;
		Map<Integer, Pair<?, ?>> map = LookupTable.returnTable(); // fill lookup table.

		Pair<?, ?> lk = map.get(b);

		@SuppressWarnings("unchecked")
		V tmp = (V) lk.getVal2();

		if (tmp.getClass().equals(Boolean.class)) {
			return ((int) lk.getVal1() * a);
		}
		

		int shiftVal = (int) lk.getVal1();
		int numbShifts = (int) lk.getVal2();

		for (int i = 0; i < numbShifts + 1; i++) {
			temp = temp >> shiftVal;
		}

		return temp;

	}

	public float average(int a, int b) { // More accurate the larger the numbers

		if (a > 0 && b > 0) {
			return (a + b) >> 1;
		}
		
		return 0;
	}

	public boolean isPowerOf2(int a) { // Doesn't work for 0.

		// if(a == 0) { //This slows us down
		// return false;
		// }

		return ((a & (a - 1)) == 0);
	}

	public Pair<Integer, Integer> XorSwap(int a, int b) {

		int l = ((a) ^= (b));
		l = ((b) ^= (a));
		l = ((a) ^= (b));

		return new Pair<>(l, b);

	}

	public float bitMult(int a, int b) {

		int c = 0;
		
		while (b > 0) {
			c += ((b & 1) > 0) ? a : 0;
			a <<= 1;
			b >>= 1;
		}

		return c;
	}

	public static String intToString(int number, int groupSize) {
	    StringBuilder result = new StringBuilder();

	    for(int i = 31; i >= 0 ; i--) {
	        int mask = 1 << i;
	        result.append((number & mask) != 0 ? "1" : "0");

	        if (i % groupSize == 0)
	            result.append(" ");
	    }
	    result.replace(result.length() - 1, result.length(), "");

	    return result.toString();
	}

	
	public float bitDivByShift(int a, int b) {

		int l;

		if (b == 3 || b == 5) {
			l = 5;
		}

		else if (b == 6 || b == 7) {
			l = 3;
		}

		else if (b == 9 || b == 10 || b == 11 || b == 12 || b == 13) {
			l = 4;
		}

		else {
			return 0;
		}

		int q; 
		int r;
		
		a = a + (a >> 31 & 4); 
		q = (a >> 1) + (a >> 2);
		q = q + (q >> 4);
		q = q + (q >> 8);
		q = q + (q >> 16);
		q = q >> 2;
		r = a - q * b;

		return q + (7 * r >> l);
	}
}
