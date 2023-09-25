package Debug;

public class d1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;i<3;i++){
            sum += i;
            System.out.println("i="+i);
            System.out.println("sum="+sum);
        }
        System.out.println("for 循环推出");
    }
}

