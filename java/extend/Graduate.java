package extend;
//没有用继承的版本
public class Graduate {
    public String name;
    public int age;
    private double score;
    public void setScore(double score){
        this.score =score;
    }
    public void showInfor(){
        System.out.println("大学生"+name+" "+"年龄"+age+" "+"数学成绩"+score);
    }
    public void testing(){
        System.out.println("学生名"+name+" "+"大学数学");
    }
}
