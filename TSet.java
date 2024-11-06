package Collection;

import java.util.List;
import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        TreeSet<Integer> T1 = new TreeSet<>(List.of(10,90,30,55));
        T1.add(40);
        System.out.println(T1.ceiling(35));
        System.out.println(T1);

    }
}
