package characteristic.poly;

public class master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public master(String name) {
        this.name = name;
    }

    //写2个方法，给小狗喂骨头，给小猫喂鱼

public void feed(animal ani , food fo ){ //父类来接收动物和食物的名称，父类引用可以指向子类对象
        System.out.println("主人"+name+"给"+ani.getName()+"吃"+fo.getName());
    }

}


