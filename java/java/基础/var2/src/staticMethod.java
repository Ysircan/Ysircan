public class staticMethod {
    public static void main(String[] args) {
        Student tom = new Student("TOM");
        Student rose = new Student("ROSE");
        tom.payFee(100);
        rose.payFee(100);
        //规则和类变量一致。通常采用类名.方法名。
        Student.showFee();
    }
}


class Student{
    private String name;
    private static double fee = 0; //定义一个类变量

    public  Student(String name) {
        this.name = name;
    }
    public static void payFee(double fee){
        Student.fee += fee; //double fee会传入实参，累计+=到类方法的fee中。
    }
    public static void showFee(){
        System.out.println("总学费"+Student.fee);
    }

}
