package week2.linkedListTest;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoSortedLinkedListsTest_7 {

    public static void main(String[] args) {

        List<Integer> linkedList1 = new LinkedList<Integer>(){{
            add(10);
            add(20);
            add(30);
            add(40);
        }};
        List<Integer> linkedList2 = new LinkedList<Integer>(){{
            add(50);
            add(60);
            add(70);
            add(80);
        }};

        LinkedList<Integer> collect = Stream.concat(
                linkedList1.stream(),
                linkedList2.stream()
        ).sorted().collect(Collectors.toCollection(LinkedList::new));
        collect.forEach(System.out::println);
    }
}
