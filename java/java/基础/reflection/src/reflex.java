public class reflex {
    /*
    获取class对象的6种方式
     */
    public static void main(String[] args) throws ClassNotFoundException{
        // 方法1：通过Class.forName()获取Class对象
        try {
            Class<?> myClass1 = Class.forName("com.example.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 方法2：通过类的.class属性获取Class对象
       Class cls2 = Car.class;   //记得注意要大写
        System.out.println(cls2);

        // 方法3：通过对象的getClass()方法获取Class对象
        Car car = new Car();
        Class cls3 = car.getClass();  //记得注意要大写
        System.out.println(cls3);

        //方法4：通过类加载器来获取class对象
        ClassLoader classLoader = car.getClass().getClassLoader();  // 获取类加载器car
        Class<?> cls4 = classLoader.loadClass("com.example.MyClass");

        //方法5：基本数据类型获取
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);  //int

        //方法6：基本数据类型的包装类，可以通过.type得到class对象。
        Class<Integer> type1 = Integer.TYPE;
        Class<Character> type2 = Character.TYPE;
        System.out.println(type1);

    }
}
class Car{

    String name;
    public Car() {
    }
}
