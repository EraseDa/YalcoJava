package sec05.chap04.ex01;

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        String pb = phone.powerButton;
        String ss = phone.sdCardSlot;
        // String cu = phone.cpu; // ⚠️ 불가 : 왜냐면 SmartPhone클래스의 cpu 필드는 접근제어자가 private이기에 같은 클래스에서만 접근가능
        //단 getter와 setter를 이용해서 접근 가능.

        String cu = phone.getCpu();
        phone.setCpu("yalcoco");
        System.out.println(phone.getCpu());
    }
}
