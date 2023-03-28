package extend.improve;
//属于post和high的父类；
public class student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score){
        this.score=score;
    }
    private void test400(){
        System.out.println("test400");
    }
    public void showInfor(){
        System.out.println("学生名"+name+" "+"年龄"+age+" "+"分数"+score);
    }
}

