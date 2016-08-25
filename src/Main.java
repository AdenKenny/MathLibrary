import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import arith.BasicMath;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		BasicMath b = new BasicMath();
		
		Class<?> c = b.getClass();
		
		Class<?>[] cArgs = new Class[2];
		cArgs[0] = int.class;
		cArgs[1] = int.class;

		Method m = c.getDeclaredMethod("intAdd", cArgs);
		m.setAccessible(true);
		
		int val = (int) m.invoke(b, 13, 10);
		System.out.println(val);
	}
	
}
