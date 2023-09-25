package characteristic.poly.up;

public class demo {//转型的前提是发生继承。
    public static void main(String[] args) {
         Animal animal = new Cat();//父类对象引用指向子类的对象。
         //animal进行编译，实际运行的方法是 Cat类中的sound。  此为向上转型
        //⚠️如果你换成object仍然可以行的通
         animal.sound();
         animal.eat();   animal.run();   //可以调用父类的各种成员（属性+方法）
        // ,但不能调用子类特有的成员cm()不能


        //如果非要在父类引用的时候，强制cm()方法，称之为向下转型。向下转型先向上转型
        // 语法：子类类型 引用名 =（子类类型）父类引用
        // ⚠️不能强转父类的对象
        Cat c = (Cat) animal; // 编译类型在左边，运行类型在右边。
        c.cm();//此时就可以调用cm()方法。
       // DOG d = (DOG) animal; 此写法错误，相当于把狗直接变成猫。
    }
}
