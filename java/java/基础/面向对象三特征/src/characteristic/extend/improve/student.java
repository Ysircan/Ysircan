package characteristic.extend.improve;
//此为p g 的父类。
public class student {
    //抽象出共有的属性
    public String name;
    public int age;
    private double score ;

    //抽象出共有的方法
    public void setScore(double score){
        this.score = score;
    }
    public String info(){
        return "学生考试信息"+" "+name+"\t"+age+"\t"+score;
    }
}
