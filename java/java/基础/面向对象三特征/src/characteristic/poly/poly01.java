package characteristic.poly;

public class poly01 {
    public static void main(String[] args) {
        master m = new master("李四");
        dog d = new dog("来福-");
        bone b = new bone("旺旺-");
        m.feed(d,b);

        cat c =  new cat("tom-");
        fish f = new fish("黄花鱼-");
        m.feed(c,f);

        piggy p = new piggy("peggy");
        rice r = new rice("猪少");
        m.feed(p,r);

        wolf w = new wolf("大灰狼");
        meat x = new meat("小红帽");
        m.feed(w,x);
    }

}
