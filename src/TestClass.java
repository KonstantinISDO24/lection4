@DeprecatedEx(message = "Используй класс NewClass вместо этого")
public class TestClass {
    public void modernMethod() {
    }

    @DeprecatedEx(message = "Новейший метод modernMethod()")
    public void oldMethod() {
    }
}
