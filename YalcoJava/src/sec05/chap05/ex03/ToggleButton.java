package sec05.chap05.ex03;

public class ToggleButton extends Button{
    private boolean on;
    public ToggleButton(String print, boolean on) {
        super(print);
        this.on = on; //무조건 super()이 오고 그 다음에 자식 생성자에 추가할 내용을 써야함

    }

    @Override
    public void func () {
        super.func(); // 💡 부모에서 정의한 메소드 호출. 여기서 super은 부모클래스 자체 즉 super=Button. Button.func()를 의미
        this.on = !this.on;
        System.out.println(
                "대문자입력: " + (this.on ? "ON" : "OFF")
        );
    }
}
