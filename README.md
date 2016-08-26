# MathLibrary

This is a joke project. It's purposefully bad.

    //Add a and b.
    //a = 12, b = 30, op = "intAdd"
    private int doArith(int a, int b, String op) {
        ArithLib lib = new ArithLib();
        
        Class<?> libClass = lib.getClass();
        
        Method[] methods = c.getDeclaredMethods();
        
        for(Method m : methods) {
            if(m.getName.equals(op)) {
                Class<?>[] paramTypes = m.getParameterTypes();
                
                Class<?> cArgs = new Class<?>[paramTypes.length];
                
                for(int i = 0; i < paramTypes.length; i++) {
                    cArgs[i] = paramTypes[i];
                }
                
                String methodName = m.getName();
                
                Method method = c.getDeclaredMethod(methodName, cArgs);
                
                Number val = (Number) m.invoke(lib, a, b);
                return val.intValue();
            }
        }
    }

