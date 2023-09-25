public class enumm {
    public static void main(String[] args) {
        season s1 = new season("spring","warm");
        season s2 = new season("winter","cold");
        season s3 = new season("summer","hot");
        season s4 = new season("fall","cool");
        //无法满足固定四个季节，想加就加。通过枚举类来固定一组对象。
        System.out.println();
    }
}
class season{
    private String name;
    private String dec;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public season(String name, String dec) {  //生成构造器，初始化内容。
        this.name = name;
        this.dec = dec;


    }
}