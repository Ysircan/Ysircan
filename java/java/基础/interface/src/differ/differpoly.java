package differ;

public class differpoly {
    public static void main(String[] args) {
       USB [] usb = new USB[2];
       usb[0] = new phone();
       usb[1] = new camera();  //利用多态数组完成调用对象。调用实现接口的对象的特殊方法，运用instanceof
        //遍历该数组
        for(int i = 0;i< usb.length;i++){
            usb[i].say();  //这里进行动态绑定
           if(usb[i] instanceof phone){  //通过类型判断来完成调用类的特殊方法。
               phone phone = (phone) usb[i];
               phone.call();
           }
        }
    }
}


interface USB{
    public void say();
}

class camera implements USB{
    @Override
    public void say() {
        System.out.println("相机已连接usb");
    }
}

class phone implements USB{
    @Override
    public void say() {
        System.out.println("手机已连接usb");
    }

    public void call(){
        System.out.println("手机在打电话");
    }
}

