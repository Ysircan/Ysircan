package characteristic.extend.improve;

public class extend01 {
    public static void main(String[] args) {
        p p = new p();
        p.name = "小强";
        p.age = 12;
        p.test();
        p.setScore(50);
        System.out.println(p.info());

        g g = new g();
        g.name = "阿猫";
        g.age = 20;
        g.test();
        g.setScore(90);
        System.out.println(g.info());
    }

}
