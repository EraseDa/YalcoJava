package sec05.chap05.ex04;

public class Slime {
    //부모 클래스에 명시된 생성자가 없는 경우
    //자식 클래스에서도 작성할 필요 없음. 물론 부모 클래스에서 생성 안했어도 필요하다면 자식클래스에선 해도 됨.
    protected double hp = 50;
    protected int attack = 8;
    protected double defense = 0.2;

    public void attack (Slime enemy) {
        enemy.hp -= this.attack * (1 - enemy.defense);
    }
}
