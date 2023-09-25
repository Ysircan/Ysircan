public class computer {
    //编写一个方法
    public void work(USB usb){ //形参是接口类型usb。所以实现了接口的类的对象可以传入usb。
        //比如：phone phone = new phone. phone就是实现了接口的类的对象。可以传入work方法
        usb.start();
        usb.stop();
    }
}
