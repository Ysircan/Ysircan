import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws01 {
    public static void main(String[] args) {

    }
   public void f1() throws FileNotFoundException {
        //通过书写该语法"throws  FileNotFoundException 让语句通过.
       // 可以是该具体错误类型，也可以是其父类Exception。
        FileInputStream fis = new FileInputStream("d");  //
       // 编译错误。文件流错误。⚠️编译异常必须处理，如果是运行异常不处理会默认throws。
        //解决方法有：tryCatch  or  throws
}
}

class father {
    public void m()throws RuntimeException{//⚠️抛出的是编译异常，必须要处理。要么TC要么T。

    }

}
class son extends father{
    @Override
    public void m() throws RuntimeException { //⚠️子类抛出的异常应当要和父类的一致或者为其子类
        super.m();
    }
}




