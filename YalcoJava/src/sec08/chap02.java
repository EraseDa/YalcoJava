package sec08;

import java.util.*;

public class chap02 {
    public static void main(String[] args) {
        ArrayList<Integer> ints1 = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();

        //  add 메소드로 요소 추가
        ints1.add(11);
        ints1.add(22);
        ints1.add(33);
        ints1.add(44);
        ints1.add(55);

        //  요소 중복 허용
        for (var str : "바니 바니 바니 바니 당근 당근".split(" ")) {
            strings.add(str);
        }

        //  for-each 문 사용 가능
        for (int i : ints1) {
            System.out.println(i);
        }

        int ints1Size = ints1.size(); // 요소 개수
        boolean ints1IsEmpty = ints1.isEmpty(); // size가 0인지 여부 반환
        int ints12nd = ints1.get(1); // 인덱스로 요소 접근
        boolean ints1Con3 = ints1.contains(33); // 포함 여부
        boolean ints1Con6 = ints1.contains(66);

        ints1.set(2, 444); // 위치의 요소 수정
        ints1.add(0, 11); // 위치에 요소 추가 (다음 요소들 밀어냄)

        System.out.println(ints1);

        //  ⭐️ 간략한 생성 및 초기화 방법들
        ArrayList<Integer> ints2A = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5)
        ); // 💡 Arrays 클래스 : 배열 관련 각종 기능 제공

        ArrayList<Integer> ints2B = new ArrayList<>(
                List.of(1, 2, 3, 4, 5)
        ); // 💡 자바9에서부터 가능

        ArrayList<Integer> ints2C = new ArrayList<>();
        Collections.addAll(ints2C, 1, 2, 3, 4, 5);

        List list = new ArrayList();
        list.add("홍길동");
        String name = (String)list.get(0);
        System.out.println(name);


        //  💡 다른 Collection 인스턴스를 사용하여 생성
        ArrayList<Integer> ints3 = new ArrayList<>(ints1);

        //  스스로를 복제하여 반환 (⚠️ 얕은 복사 : 주소값 자체를 복사하기때문에 ints3와 ints4는 같은 주소값을 공유)
        ArrayList<Integer> ints4 = (ArrayList<Integer>) ints3.clone();
        ints3.remove(4); // int: 인덱스로 지우기
        ints3.remove((Integer) 55); // 클래스 자료형: 요소로 지우기, 리스트는 중복값을 넣을 수 있어. 근데 중복된 요소를 지우고 싶어서
        //remove(요소)를 했을 때, 중복된 요소가 있는데 어떤걸 지울까? 정답은 가장 앞쪽 index에 있는 요소를 지워!
        //idnex도 정수고 Interger 타입도 정수인데 그럼 ()안의 값이 index인지 요소의 값인지 어떻게 구분할까?
        //(Interger)을 써줘서 앞에 타입을 명시하면 해당 숫자가 요소인지 알 수 있음.

        //ints3에 있는 55 요소를 지운다고 하더라고, ints4에는 55요소가 그대로 남아있음.

        ints1.removeAll(ints3); // 주어진 콜렉션에 있는 요소들 지우기
        System.out.println(ints4);
        System.out.println(ints1);

    }
}
