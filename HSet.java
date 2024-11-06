package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HSet {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 =new HashSet<>(List.of(4,55,10));
        h1.add(10);
        h1.add(20);
        h1.add(30);
        System.out.println(h1.size());
        System.out.println(h1);
        h1.addAll(h2);
        System.out.println(h1);
    }
}
