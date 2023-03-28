package extend.improve;

import extend.Graduate;
import extend.Pupil;

public class Test {
    public static void main(String[] args) {
        High high = new High();
        high.name = "小红";
        high.age = 12;
        high.testing();
        high.setScore(60);
        high.showInfor();

        Post post = new Post();
        post.name = "大红";
        post.age = 22;
        post.testing();
        post.setScore(80);
        post.showInfor();
    }
}
