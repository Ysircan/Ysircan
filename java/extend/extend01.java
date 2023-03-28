package extend;
//这是没有用继承的版本
public class extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name ="小明";
        pupil.age=12;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfor();

       Graduate grad = new Graduate();
       grad.name="大明";
       grad.age=22;
       grad.testing();
       grad.setScore(80);
       grad.showInfor();
    }
}
