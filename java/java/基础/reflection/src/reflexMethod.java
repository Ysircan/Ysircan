import java.lang.reflect.Method;

public class reflexMethod {
    public static void main(String[] args) {
        Class<?> myClass = Car.class;

        // 获取所有公共方法
        Method[] methods = myClass.getMethods();

        // 获取指定方法名和参数类型的方法
        try {
            Method method = myClass.getMethod("myMethod", int.class, String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
