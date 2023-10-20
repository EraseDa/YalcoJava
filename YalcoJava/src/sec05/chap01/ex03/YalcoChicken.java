package sec05.chap01.ex03;

public class YalcoChicken {
    //ex03 패키지 얄코치킨과 다른 점 : 생성자 유무

    int no;
    String name;

    //  ⭐ 생성자(constructor) : 인스턴스를 만드는 메소드
    //  ⭐ this : 생성될 인스턴스를 가리킴
    YalcoChicken (int no, String name) {
        this.no = no;
        this.name = name;
    }

    String intro () {
        //  String name = "몽고반"; // 주석해제 시 name 대체 그럴 땐 formatted(no,this.name)으로 해줘야 제대로 그 호점의 이름이 나옴
        return "안녕하세요, %d호 %s점입니다." // 🔴
                .formatted(no, name);
    }
}
