import java.lang.reflect.Constructor;

public class relexConstructor {
    public static void main(String[] args) {
        Class<?> myClass = Car.class;

        // 获取所有公共构造器
        Constructor<?>[] constructors = myClass.getConstructors();

        // 获取指定参数类型的构造器
        try {
            Constructor<?> constructor = myClass.getConstructor(String.class, int.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

