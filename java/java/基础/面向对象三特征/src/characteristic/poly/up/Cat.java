package characteristic.poly.up;

public class Cat extends Animal{ //注意继承
  public void cm(){
      System.out.println("猫抓老鼠");
  }

    @Override
    public void sound() {
        System.out.println("喵喵");
    }
}
