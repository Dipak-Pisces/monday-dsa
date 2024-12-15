package week2.linkedListTest;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class FindTheMiddleTest_2 {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};

        IntStream.range(0,linkedList.size())
                .filter( i -> (i == linkedList.size()/2) || ( linkedList.size()%2==0 && i==linkedList.size() /2-1))
                .mapToObj(linkedList::get)
                .forEach(System.out::println);
    }
}
