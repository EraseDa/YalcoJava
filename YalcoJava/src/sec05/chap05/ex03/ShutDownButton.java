package sec05.chap05.ex03;

public class ShutDownButton extends Button {
    public ShutDownButton () {
        super("ShutDown"); // 💡생성자 안에서의 super() 부모의 생성자 호출. 이 말은 ShutDownButton 인스턴스를 만들면
        //생성자가 super("ShutDown") 즉, 부모클래스 생성자인 Button ("ShutDown"){this.print = "ShutDown";} 호출한다는 의미
    }

    //  💡 부모의 메소드를 override
    @Override
    public void func () {
        System.out.println("프로그램 종료");
    }
}
