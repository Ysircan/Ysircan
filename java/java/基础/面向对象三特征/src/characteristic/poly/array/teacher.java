package characteristic.poly.array;

public class teacher extends person{
    private double salary;

    public teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //老师类中包含一个特有的方法
    public void teach(){
        System.out.println("老师"+getName()+"正在上课");
    }

    @Override
    public String say() {
        return super.say()+"\t"+salary;
    }
}
