import java.lang.reflect.Method;
public class AnnotationChecker {
    public static void check(Class<?> cl) {
        if(cl.isAnnotationPresent(DeprecatedEx.class)) {
            DeprecatedEx annotation = cl.getAnnotation(DeprecatedEx.class);
            System.out.println(cl.getSimpleName() + " устарел. Альтернатива: " +annotation.message());
        }

        for(Method method : cl.getDeclaredMethods()) {
            if(method.isAnnotationPresent(DeprecatedEx.class)) {
                DeprecatedEx annotation = method.getAnnotation(DeprecatedEx.class);
                System.out.println(method.getName() + " устарел. Альтернатива: " +annotation.message());
            }
        }
    }
}
