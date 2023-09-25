public class camara implements USB{
    //需要实现接口的方法

    @Override
    public void start() {
        System.out.println("相机接入接口");
    }

    @Override
    public void stop() {
        System.out.println("相机停止接入接口");
    }
}
