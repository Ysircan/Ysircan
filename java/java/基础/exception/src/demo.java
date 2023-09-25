import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        /*
        1、scanner >>>无限循环去接收一个输入
        2、传入的值转成int；
        3、用tryCatch来捕捉异常，则输入有误。（不能转成int的类型）
        4、若没有抛出异常，则break该循环。
         */
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println("请输入一个整数");
            try {
                num = Integer.parseInt(scanner.next());//next()将输入的内容当作字符串。
                break;//若没有抛出异常，就会执行break语句。
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数");
            }

        }
        System.out.println("你输入的数为"+num);


    }
}

