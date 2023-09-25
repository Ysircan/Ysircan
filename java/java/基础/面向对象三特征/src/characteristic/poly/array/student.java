package characteristic.poly.array;

public class student extends person{
    private double score;

    public student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    //学生类中包含一个特有的方法
    public void learn(){
        System.out.println("学生"+getName()+"正在学习");
    }

    //重写say方法，加入新的属性
    @Override
    public String say() {
        return super.say()+"\t"+score;
    }
}
