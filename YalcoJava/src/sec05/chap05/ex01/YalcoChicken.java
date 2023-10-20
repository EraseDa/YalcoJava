package sec05.chap05.ex01;

public class YalcoChicken {
    protected static int no=0;
    protected String name;

    protected int n;

    public YalcoChicken (String name) {
        n=++no;
        this.name = name;
    }

    public void takeHallOrder () {
        System.out.printf("%d호 %s점 홀 주문 받음%n", n, name);
    }
}
