import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import arith.BasicMath;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		/*BasicMath b = new BasicMath();
		
		Class<?> c = b.getClass();
		
		Class<?>[] cArgs = {int.class, int.class};

		Method m = c.getDeclaredMethod("intAdd", cArgs);
		m.setAccessible(true);
		
		Number val = (Number) m.invoke(b, 13, 10);
		int ret = val.intValue();
		System.out.println(val);*/
		
		BasicMath b = new BasicMath();
		
		Class<?> c = b.getClass();
		
		Method[] methods = c.getDeclaredMethods();
		
		for(Method m : methods) {
			if(m.getName().equals("intAdd")) {
				Class<?>[] paramTypes = m.getParameterTypes();
				
				Class<?>[] cArgs = new Class<?>[paramTypes.length];
				
				for(int i = 0; i < paramTypes.length; i++) {
					cArgs[i] = paramTypes[i];
				}
				
				String methodName = m.getName();
				
				Method method = c.getDeclaredMethod(methodName, cArgs);
				
				Number val = (Number) method.invoke(b, 12, 10);
				System.out.println(val.intValue());
			}	
		}
		
		//Handle method not found.
	}
	
}
