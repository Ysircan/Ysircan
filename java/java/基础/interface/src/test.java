public class test {
    public static void main(String[] args) {
        phone phone = new phone();
        camara camara = new camara();
        computer computer = new computer();

        computer.work(phone);//把手机接入电脑之中，显示手机里面的内容
        computer.work(camara);
    }
}
