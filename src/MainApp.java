//package custom;

import java.lang.reflect.Method;

public class MainApp {

    public static void main(String[] args) {

        BusinessLogic bl = new BusinessLogic();
        Method[] methods = bl.getClass().getMethods();
        System.out.println( methods[0].getAnnotations());
        for (Method method : methods) {
            MyAnnotation run = method.getAnnotation(MyAnnotation.class);
            if (run != null) {
                try {
                    //method.invoke(bl);
                    System.out.println(run.annotationType());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        /*MyAnnotation1 obj=methods[0].getAnnotation(MyAnnotation1.class);
        System.out.println(obj.annotationType());
        */
    }
} 