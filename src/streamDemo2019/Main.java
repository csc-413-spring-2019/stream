package streamDemo2019;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class SomeClass{
    int i;
    public SomeClass(int i) {
        this.i = i;
    }
}
public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        long count = list.stream()
            .count();
        System.out.println("Count is " + count);

        list.stream()
            .map(n -> n + 1)
            .forEach(n -> {
                System.out.println(n);
            });

        Set<Integer> set = list.stream()
            .collect(Collectors.toSet());
        System.out.print(set);

        List<SomeClass> someObjects = list.stream()
            .map(n -> new SomeClass(n))
            .collect(Collectors.toList());
    }
}
