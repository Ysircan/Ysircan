package Debug;

public class d2 {
    public static void main(String[] args) {
       int arr [] = {1,2,3};
       for (int i = 0; i<=arr.length; i++ ){//数组越界，用debug找异常
           System.out.println(arr[i]);
       }
        System.out.println("退出for循环");
    }
}
