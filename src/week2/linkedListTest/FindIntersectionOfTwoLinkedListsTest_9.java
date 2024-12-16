package week2.linkedListTest;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindIntersectionOfTwoLinkedListsTest_9 {

    public static void main(String[] args) {

        List<Integer> linkedList1 = new LinkedList<Integer>(){{
            add(10);
            add(20);
            add(30);
            add(40);
        }};

        List<Integer> linkedList2 = new LinkedList<Integer>(){{
            add(30);
            add(40);
            add(70);
            add(80);
        }};

        LinkedList<Integer> collect = new HashSet<>(linkedList1).stream()
                .filter(x -> linkedList2.contains(x))
                .collect(Collectors.toCollection(LinkedList::new));

        collect.forEach(System.out::println);
    }
}
