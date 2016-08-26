import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import arith.BasicMath;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		BasicMath b = new BasicMath();
		
		Class<?> c = b.getClass();
		
		Class<?>[] cArgs = {int.class, int.class};

		Method m = c.getDeclaredMethod("intAdd", cArgs);
		m.setAccessible(true);
		
		int val = (int) m.invoke(b, 13, 10);
		System.out.println(val);
		

		Class<?>[] arrgs = {Number.class, Number.class};
		Method a = c.getDeclaredMethod("recSub", arrgs);
		a.setAccessible(true);
		
		double value = (double) a.invoke(b, 15, 5);
		
		System.out.println(value);
	
	}
	
}
