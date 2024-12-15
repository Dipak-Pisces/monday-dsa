package week2.linkedListTest;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class FindTheKthLargestElementTest_6 {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<Integer>(){{
            add(10);
            add(20);
            add(30);
            add(45);
            add(40);
            add(32);
        }};

        int k = 3;
        Integer i = linkedList.stream().sorted((a,b) -> b-a)
                .skip(k-1)
                .findFirst().orElse(-1);
        System.out.println(i);
    }
}
