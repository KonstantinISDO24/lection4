import java.lang.reflect.Method;
public class AnnotationChecker {
    public static void check(Class<?> cl) {
        if(cl.isAnnotationPresent(DeprecatedEx.class)) {
            DeprecatedEx annotation = cl.getAnnotation(DeprecatedEx.class);
            System.out.println("! класс " + cl.getSimpleName() + " устарел - альтернатива: " + annotation.message());
        }

        for(Method method : cl.getDeclaredMethods()) {
            if(method.isAnnotationPresent(DeprecatedEx.class)) {
                DeprecatedEx annotation = method.getAnnotation(DeprecatedEx.class);
                System.out.println("! метод " + method.getName() + " устарел - альтернатива: " +annotation.message());
            }
        }
    }
}
