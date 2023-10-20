package sec08;

import java.util.HashSet;
import java.util.Set;

public class chap03 {
    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();

        s.add(5);
        s.add(11);
        for(int i : s) {
            System.out.println(i);
        }

        s.remove(10);
        s.remove(11);
    }
}
