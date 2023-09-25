import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIlecopy {
    public static void main(String[] args) {
        /*
        完成文件拷贝。创建文件输入流，将文件读入到程序。
         */
        String srcfilePath = "/Users/y-sir/Desktop/java/基础/IO/images/bg.jpg";
        String destFilepath = "/Users/y-sir/Desktop/java/基础/IO/images/explode";
        FileInputStream fileInputStream = null;

        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(srcfilePath);
            fileOutputStream = new FileOutputStream();
            byte[] buf = new byte[1024];
            int readLen = 0;
            while((readLen = fileInputStream.read(buf)) != -1)  {
                //读取到后就写入文件。边读边写。
                fileOutputStream.write(buf);  //一定要用该方法。
            }
            System.out.println("拷贝ok");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fileInputStream !=null){
                try {
                    fileInputStream.close();//养成关闭的习惯

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                }
            }
        }
    }

