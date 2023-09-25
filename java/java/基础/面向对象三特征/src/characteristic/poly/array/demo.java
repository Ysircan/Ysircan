package characteristic.poly.array;


public class demo {
    public static void main(String[] args) {
       person [] p = new person[5];
      p[0]  = new person("jack",20);
      p[1]  = new student("john",22,80);
      p[2]  = new student("tom",21,70);
      p[3]  = new teacher("soccot",28,20);
      p[4]  = new teacher("henny",29,60);
       //调用say方法，遍历该数组。
        for (int i = 0; i< p.length;i++){
            p[i].say();
            System.out.println(p[i].say());
            //注意这里存在动态绑定机制。根据运行机制来实际调用say，以达到所有对象都能使用该方法
            //⚠️方法跟随运行类型，但是属性不会，属性不会，属性不会。

            //如果要调用子类特有的方法，需要向下转型。
            // 有两种方法：子类类名 子类编译名 = （子类类名）父类类名
            if(p[i] instanceof student) {// 判断运行类型是否是学生
                student s = (student) p[i];
                s.learn();
            } else if (p[i] instanceof teacher){
                teacher t = (teacher) p[i];
                t.teach(); 
            } else if (p[i] instanceof  person) {

            } else {
                System.out.println("你的类型有误，请重新输入");
            }

            }
        }

    }

