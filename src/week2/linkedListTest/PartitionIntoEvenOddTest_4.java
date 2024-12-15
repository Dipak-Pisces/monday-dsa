package week2.linkedListTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionIntoEvenOddTest_4 {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};

        Map<Boolean, LinkedList<Integer>> collect = linkedList.stream().collect(Collectors.partitioningBy(
                x -> x % 2 == 0,
                Collectors.toCollection(LinkedList::new)
        ));

        collect.values().stream().forEach(System.out::println);
    }
}
