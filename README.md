# MathLibrary

This is a joke project. It's purposefully bad.

    //Add 13 and 10.
    private int add() {
        BasicMath b = new BasicMath();
        
        Class<?> c = b.getClass();
        
        Class<?>[] cArgs = {int.class, int.class};
        
        Method m = c.getDeclaredMethod("intAdd", cArgs);
        m.setAccessible(true);
        
        return (int) m.invoke(b, 13, 10);
    }

