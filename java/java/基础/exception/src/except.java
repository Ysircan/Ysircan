public class except {
        public static void main(String[] args) {
            byte a = 1;
            byte b = 0;
            /*
            1、异常发生了的话，进入catch块；try/catch后面的代码继续执行。
            2、finally不论程序是否出错，finallu都会被执行。
            3、try — finally 模式下。程序如果有错误，将会在执行完finally之后就退出。不再执行
             */
            try {
                int num = a / b; //当这里代码被捕捉到错误，直接进入catch执行。
                String name = "喵喵";
                int u = Integer.parseInt(name);  //numberFormatException
                System.out.println(u);

                //可以用多个catch、对不同的bug进行分开捕获。⚠️子类异常需要写在前面、父类需要后面
            } catch (ArithmeticException e){
                System.out.println("算数错误"+e.getMessage());

            }catch(NumberFormatException e){
                System.out.println("格式错误"+e.getMessage());
            }

             catch(Exception e){//exception是算数、空指针等的父类
                // e.printStackTrace();
                System.out.println("出错原因" + e.getMessage());
            }finally{
                System.out.println("finally");
            }


            System.out.println("程序继续进行");

            //try - finally模式
            try {
                int [] arr ={1,2,3};
                for(int i = 0; i<= arr.length;i++){ //加了一个等号意味着越界。
                    System.out.println(arr[i]);
                }
            } finally {
                System.out.println("执行到这里就退出");
            }
            System.out.println("我不被执行"
            );
        }
}
