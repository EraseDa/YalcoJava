package sec05.chap02.ex03;

public class Main {
    public static void main(String[] args) {
        ChickenMenu[] menus = {
                new ChickenMenu("후라이드", 10000),
                new ChickenMenu("양념치킨", 12000),
                new ChickenMenu("화덕구이", 15000, "bake")
        };
        YalcoChicken store1 = new YalcoChicken(3, "판교", menus);

        ChickenMenu order1 = store1.orderMenu("양념치킨");
        ChickenMenu order2 = store1.orderMenu("오븐구이");


        int int1 = 1;
        int int2 = int1;
        int1 = 2;  //int1 != int2 ,원시타입이기에

        String str1 = "헬로";
        String str2 = str1;
        str1 = "월드"; //str1 != str2, String은 클래스지만 원시타입처럼 취급

        ChickenMenu menu1 = new ChickenMenu("후라이드", 1000);
        ChickenMenu menu2 = menu1;
        menu1.price = 1200; //menu1 == menu2
        System.out.println(menu1==menu2); //true
    }
}
