import java.util.*;

public class fanxing {
    public static void main(String[] args) {
        //使用泛型给hashSet放入3个学生对象。
        HashSet<student> students = new HashSet<student>();
        students.add(new student("jack",10));
        students.add(new student("tom",10));
        students.add(new student("sss",10));

        for (student s : students) {
            System.out.println(s);
        }
        //使用泛型方式给HashMap放入3个学生对象
        HashMap<String, student> s1 = new HashMap<>();
        HashMap<String, student> s2 = new HashMap<>();
        HashMap<String, student> s3 = new HashMap<>();
        s1.put("tom",new student("tom",30));
        s2.put("jack",new student("jack",10));
        s3.put("sss",new student("sss",10));

        }


    }


class student {
   public String name;
   public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;



    }
}