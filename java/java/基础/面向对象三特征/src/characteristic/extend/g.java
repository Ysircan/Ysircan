package characteristic.extend;
public class g{
    public static void main(String[] args) {
        new grad();
    }
}

class grad{
    //先写属性
    public String name;
    public int age;
    private double score;

    //再写其方法。给私有的写set get
    public void setScore(double score){
        this.score = score;
    }
    //再写一个综合反馈以上信息的方法
    public void test(){
        System.out.println("大学生"+name+"正在考试");
    }
    public String info(){
        return "大学生考试信息"+" "+name+"\t"+age+"\t"+score;
    }
}

