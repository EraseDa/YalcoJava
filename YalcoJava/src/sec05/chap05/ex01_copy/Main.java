package sec05.chap05.ex01_copy;

public class Main {
    public static void main(String[] args) {
        YalcoChickenDT dtStore1 = new YalcoChickenDT("철원");
        YalcoChickenDT dtStore2 = new YalcoChickenDT("서울");
        YalcoChickenDT dtStore3 = new YalcoChickenDT("부산");
        dtStore1.takeHallOrder();

        dtStore1.takeDTOrder();
        dtStore1.setDriveThruOpen(false);
        dtStore1.takeDTOrder();
    }
}
