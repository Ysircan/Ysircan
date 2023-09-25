package characteristic.extend;

public class extend01{
    public static void main(String[] args) {
        pupil p  = new pupil();
        p.name = "小明";
        p.age = 10;
        p.test();
        p.setScore(80);
        System.out.println(p.info());

        grad g = new grad();
        g.name = "阿黄";
        g.age = 22;
        g.test();
        g.setScore(100);
        System.out.println(g.info());
    }

}
