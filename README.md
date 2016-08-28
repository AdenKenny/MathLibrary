# MathLibrary

This is a joke project. It's purposefully bad.

    //Add a and b.
    //a = 12, b = 30, op = "intAdd"
    private int doArith(int a, int b, String op) {
        BasicMath lib = new BasicMath();
        
        Class<?> libClass = lib.getClass();
        
        Method[] methods = c.getDeclaredMethods();
        
        for(Method method : methods) {
            if(method.getName.equals(op)) {
                Class<?>[] paramTypes = method.getParameterTypes();
                
                Class<?> cArgs = new Class<?>[paramTypes.length];
                
                for(int i = 0; i < paramTypes.length; i++) {
                    cArgs[i] = paramTypes[i];
                }
                
                String methodName = method.getName();
                
                Method meth = c.getDeclaredMethod(methodName, cArgs);
                
                Number val = (Number) meth.invoke(lib, a, b);
                return val.intValue();
            }
        }
    }

