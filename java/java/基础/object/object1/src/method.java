public class method {
    public static void main(String[] args) {
        int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
        MyTool A = new MyTool();
        A.printArr(map);
        System.out.println(map);

        int[]res = A.getSumAndSub(1,2);
        System.out.println("和"+res[0]);
        System.out.println("差"+res[1]);

        byte a = 2; byte b= 3;//低精度的byte和int数据类型相兼容（低转高可以，反过来不行）
        int[]res1 = A.getSumAndSub(a,b);
        System.out.println("和"+res1[0]);
        System.out.println("差"+res1[1]);

        A.sayOk();
        A.m1();

    }
}
class MyTool{//注意名字保持一致
    public void printArr(int[][] map){//int[][]map是形参，其中map名字
        for(int i= 0; i<map.length;i++){
            for(int j = 0;j<map[i].length;j++){
               // System.out.print(map[i][j]);//遍历输出map数组。
            }
        }
    }
    public int[] getSumAndSub(int n1 , int n2){
        //两个参数就传两个出来。不同类型的话，写的顺序也需要保持一致 String xx ， int xx
        int[] res = new int[2];
        res[0] = n1+n2;
        res[1] = n1-n2;
        return res;//返回的数值-类型-需保持一致
    }   //方法体面不能嵌套方法。
    //方法之间可以互相调用。
    void print(int n){
        System.out.println(n);
    }
     void sayOk(){//sayOk方法调用了print的方法，是允许的。但不能在一个方法体里嵌套
        print(10);
    }
    void m1(){//跨类方法步骤：创建一个跨类方法，在运行的方法体中新new一个对象。
        System.out.println("m1被执行");
         or b=new or();
         b.hi();

        System.out.println("m1继续执行");
    }
}
class or{
    void hi (){
        System.out.println("or被执行");
    }
}



