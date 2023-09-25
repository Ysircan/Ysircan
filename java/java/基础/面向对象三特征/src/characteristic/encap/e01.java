package characteristic.encap;
/*
1.属性将其私有化，private
2.提供public get/set方法；对传入的参数进行业务逻辑判断；
3.最后return
以下为封装的基本写法。
 */
public class e01{
    public static void main(String[] args) {
      person p = new person();
      //传入数值，利用方法返回对应的数值。
        p.setName("11111111");
        p.setAge(30);//此时不能自定义修改age，只能通过set方法来获取。因为private
        p.setSalary(10000);
        System.out.println(p.info());
    }
}
class person{
    public String name;
    private int age;
    private double salary;
    //写set方法来获取对应传入信息；再用get方法来返回信息。
    public void setName(String name) {//在name的方法中加入逻辑验证。
        if(name.length()>=2 && name.length()<=6) {
            this.name = name; //this后面的是属性的name，后面的name是方法中name。
        }else{
            System.out.println("你输入的名字有误");
        }
    }
    public void setAge(int age){//在age的方法中加入逻辑验证
        if (age >= 1 && age<= 35) {
        this.age=age;
        } else {
            System.out.println("你输入的年龄有误");
        }
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //最后写一个方法，汇总以上的信息便于输出相应的信息。
    public String info(){
        return "信息为"+" "+name+"\t"+age+"\t"+salary;
    }
}
