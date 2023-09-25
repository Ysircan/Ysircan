package GenericDetail;

public class GeneMethod {
    public static void main(String[] args) {
        /*
        泛型方法被调用时，类型就会确定。
         */
        Car car = new Car();
        car.fly("宝马", 100);  //当调用方法时，传入参数，编译器就会确定类型。
        car.fly(300,100); // 自动确认类型。
    }
}
class Car{
    public void run(){

    }
    public <T,R> void fly(T t , R r){  //泛型方法

    }
}
class Fish<T,R>{
    public void run (){

    }
    public<U,M> void eat(U u,M m){

    }

    public void hi(T t){  //该方法不是泛型方法。

    }
}