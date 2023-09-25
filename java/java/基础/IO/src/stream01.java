import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class stream01 {
    public static void main(String[] args) {


    }

    public void readFile01(){
        //先new一个对象，用来读取文件
        String filePath = "/Users/y-sir/Desktop/java/基础/IO/hw.txt";
        int readData = 0;
        //此时会报编译异常,try and catch 环绕
        FileInputStream fileInputStream =null;
        try {
            fileInputStream = new FileInputStream(filePath);
            while ((readData =  fileInputStream.read()) != -1){
                //创建的fileInputStream对象用来传输文件并将文件放在readData中，如果不等与—1，就循环）
                System.out.print((char)readData );
            }  //字节一个个读。
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {  //必须要关闭流
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
