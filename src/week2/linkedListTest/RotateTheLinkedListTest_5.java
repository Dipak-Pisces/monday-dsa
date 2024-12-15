package week2.linkedListTest;

import com.sun.source.doctree.EscapeTree;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RotateTheLinkedListTest_5 {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};

        int limit = 1;

        //approach 1
        List<Integer> collect = Stream.concat(
                IntStream.range(limit, linkedList.size())
                        .mapToObj(linkedList::get),
                IntStream.range(0, limit)
                        .mapToObj(linkedList::get)
        ).collect(Collectors.toList());

        // approach 2

        Stream.concat(
                linkedList.stream().skip( linkedList.size() - limit),
                linkedList.stream().limit(linkedList.size() - limit)
        ).forEach(System.out::println);

        // collect.forEach(System.out::println);

    }
}
