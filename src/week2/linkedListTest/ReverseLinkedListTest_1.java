package week2.linkedListTest;

import java.util.LinkedList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseLinkedListTest_1 {

    public static void main(String[] args) {

        List<Integer> l1 = new LinkedList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};

        LinkedList<Integer> collect = IntStream.range(0, l1.size())
                .mapToObj(x -> l1.get(l1.size() - x - 1))
                .collect(Collectors.toCollection(LinkedList::new));

        collect.forEach(System.out::println);
    }
}
