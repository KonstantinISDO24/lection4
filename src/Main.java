import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1.1");
        Printable printable = () -> System.out.println("Привет мир");
        printable.print();

        System.out.println("\nЗадание 1.2");
        Predicate<String> notNull = str -> str != null;
        Predicate<String> notEmpty = str -> !str.isEmpty();
        Predicate<String> notNullAndNotEmpty = notNull.and(notEmpty);

        String str1 = "Hello";
        String str2 = "";
        String str3 = null;

        System.out.println(notNull.test(str1));
        System.out.println(notNull.test(str2));
        System.out.println(notNull.test(str3));
        System.out.println(notEmpty.test((str1)));
        System.out.println(notEmpty.test((str2)));
        System.out.println(notNullAndNotEmpty.test((str1)));
        System.out.println(notNullAndNotEmpty.test((str2)));
        System.out.println(notNullAndNotEmpty.test((str3)));

        System.out.println("\nЗадание 1.3");
        Predicate<String> check = str -> {
          if (str == null) return false;
          String b = str.trim().toLowerCase();
          return (b.startsWith("j") || b.startsWith("n")) && b.endsWith("a");
        };

        System.out.println(check.test("Jonathan"));
        System.out.println(check.test("Dio"));
        System.out.println(check.test("Joulina"));

        System.out.println("\nЗадание 2");
        AnnotationChecker.check(TestClass.class);
    }
}

