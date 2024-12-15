package week2.linkedListTest;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesTest_3 {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(4);
        }};

        List<Integer> collect = linkedList.stream().distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);

    }
}
