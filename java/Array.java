public class Array {
    public static void main(String[] args) {
      double [] hens = {3,5,1,3.4,2,50};//必须是同一类型数据。此时int自动类型转换
      double tw = 0;
      for(byte i = 0; i<hens.length ; i++ ){
          //遍历(依次访问数组的元素)数组得到数组元素的和。通过for循环访问里面的元素
          //⚠️计算机从0开始数第一个元素。 byte i = 1; i<=6;❌
         //System.out.println("第"+(i+1)+"个元素的值"+hens[i]);
          tw += hens[i];};//代码逻辑：tw=hens[1]=3;tw=hens[1]+hens[2]=8;...
        System.out.println("总体重"+tw+"平均体重"+tw/hens.length);}
}

class Arrayexercise{
    public static void main(String[] args) {
        //数组动态分配定义语句：
        // 1、int a [] = new int[X]; 2、int a =[]; a=new int[X];
        // ⚠️Max下标 X = X.length-1；各元素默认为"0"
         char [] alpha = new  char[26];
        for (int i =0;i< alpha.length;i++){
            alpha [i] = (char)('A'+i);//表达式为int类型，需要进行强转。
            System.out.print(alpha[i]+" ");}
    }
}
class Array1{//赋值
    public static void main(String[] args) {
        //基本数据类型赋值是"值拷贝"。a2变换不影响a1。
        byte a1 = 3; byte a2 = a1;
        a2 = 4;
        System.out.println(a1);
        System.out.println(a2);
        //数组赋值是"引用传达"。一个变换，其他也变。
       /*
        int [] arr1 = {1,2,3}; int [] arr2 = arr1;
        arr2[0] = 4;
        for( byte i=0; i< arr1.length;i++){
            System.out.println(arr1[i]);i是数组下标对应的元素。*/
        byte [] arr1 = {1,2,3}; byte [] arr2 = new byte[arr1.length];
        for(byte i = 0;i< arr1.length;i++){//遍历arr1
            arr2[i]=arr1[i];//此时完成了arr2空间的独立，彼此之间的变换不再同步
            System.out.print(arr2[i]);//此时arr1的值拷贝入arr2，但彼此独立
        }
        arr2[0]=4;//分别遍历arr1和arr2
       for(byte i = 0;i< arr1.length;i++){
           System.out.print("arr1元素"+arr1[i]+" ");
       };
       for(byte i = 0;i< arr2.length;i++){
           System.out.print("arr2元素"+arr2[i]+" ");
       }
        }
    }

class array2{//反转
    public static void main(String[] args) {
        byte []arr = {1,2,3};
        byte tem = 0;
        for (byte i = 0;i< arr.length/2;i++){//奇偶不影响，int精度会把小数点抹掉。
            tem = arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]= tem;//第三个杯子倒水
        }
        for (byte i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class array3{//增加
    public static void main(String[] args) {
        byte[] arr= {1,2,3}; byte [] arrnew = new byte[arr.length+1];
        for (byte i = 0;i< arr.length;i++){
            arrnew[i]=arr[i];//把arr元素拷贝到arrnew，arrnew第3个下标元素为0。
        }
        arrnew[3]=4;//这里的[3]如果数不清楚，可以用arrnew.length-1代替。
        arr = arrnew;
        for (byte i=0;i<arr.length;i++){//再次遍历输出扩容后的arr
            System.out.print(arr[i]+"\t");
        };
    }
}
class array4{//缩减
    public static void main(String[] args) {
        byte [] arr= {1,2,3,4};
        byte arrnew[]= new byte[arr.length-1];
        for (byte i=0;i< arrnew.length;i++){
            arrnew[i]=arr[i];
        }
        arr=arrnew;
        for (byte i=0;i< arrnew.length;i++){
            System.out.print(arr[i]);
        }
    }
}

class td{//二维数组
    public static void main(String[] args) {
        //基本语法 int[][] arr= {{}},然后进行遍历。
        byte [][] arr ={{0,0,0,},{0,0,1},{0,2,0},{0,0,0}};
        for(byte i = 0;i < arr.length;i++){
            //再次遍历[i]数组的每一个元素。
             for(byte j = 0; j < arr[i].length;j++){//[i]是元素也是数组
                 System.out.print(arr[i][j]+"\t");
                 //运行：先arr[1]{0,0,0}再arr[j]访问完；i++，arr[2],arr[j]再访问arr[2].
                 //arr[4]{};arr[3]{0};arr[i][j]依次访问每一个二维数组中的值。⚠️从零数。
             }
            System.out.println();//换行的代码
        }
        byte[][] arr2=new byte[2][3];//[2][3]是长度。
        arr2[1][1] = 3;//记得从0开始数
        for(byte a = 0;a< arr2.length;a++){
            for (byte b = 0;b<arr2[a].length;b++){
                System.out.print(arr2[a][b]+"\t");
            }
            System.out.println();
        }
        //动态二维数组——列数不等。int[][]=new int[][]//不确定长度的不写。
        int [][] arr3 = new int[3][];
        for (byte c = 0;c< arr3.length;c++){
            arr3[c] = new int[c+1];//开数组的空件。不开空间得到的只是数组的地址。
           for(byte d = 0;d< arr3.length;d++){
               arr3[c][d]=c+1;
           }
    }
        for (byte c = 0;c< arr3.length;c++){
            arr[c] = new byte[c+1];//开数组的空件。不开空间得到的只是数组的地址。
            for(byte d = 0;d< arr3.length;d++){
                System.out.println();
            }
            }
}

class practice {//数组求和
    public void main(String[] args) {
        byte arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};
        int sum = 0;
        for (byte i = 0; i < arr.length; i++) {
            for (byte j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
}
class p1 {
    public static void main(String[] args) {
        int[][] arr3 = new int[3][];
        for (byte c = 0; c < arr3.length; c++) {
            arr3[c] = new int[c + 1];//开数组的空间。不开空间得到的只是数组的地址。
            for (byte d = 0; d < arr3[c].length; d++) {
                arr3[c][d] = d + 1;
            }
        }
        for (byte c = 0; c < arr3.length; c++) {
            for (byte d = 0; d < arr3[c].length; d++) {
                System.out.print(arr3[c][d]+"\t");
            }
            System.out.println();
        }
    }
}



