package week2.linkedListTest;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenNestedLinkedListTest_10 {
    public static void main(String[] args) {

        LinkedList<LinkedList<Integer>> l1 = new LinkedList<>(){{
            add(new LinkedList<>(){{add(1);add(2);}});
            add(new LinkedList<>(){{add(3);add(4);}});
        }};

        List<Integer> collect = l1.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
