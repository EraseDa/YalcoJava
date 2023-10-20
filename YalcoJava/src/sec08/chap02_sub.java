package sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class chap02_sub {
    public static void main(String[] args) {

        ArrayList<Integer> intL = new ArrayList<Integer>(
                Arrays.asList(10,20,30,40,50)
        );

        ArrayList<Integer> intL2 = (ArrayList<Integer>) intL.clone();

        intL.add(60);
        intL.set(0,12);

        System.out.println(intL);
        System.out.println(intL2);

        intL.remove(1);

        ArrayList<String> sL = new ArrayList<String>(
                Arrays.asList("가","나","다","라","마")
        );

        ArrayList<String> sL2 = (ArrayList<String>) sL.clone();

        sL2.add("사");
        sL2.add("하");
        sL.add("하");

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        ArrayList<Integer> list2 = new ArrayList<>(list1);

        var list1Type = list1.getClass().getName();
        var list2Type = list2.getClass().getName();

        //list1.add(6); // ⚠️ 런타임 오류

        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.addFirst(6);
        list.getFirst();
        list.pollFirst();
        list.getFirst();
        list.getLast();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.clear();
        System.out.println(list.peekFirst());

    }
}
