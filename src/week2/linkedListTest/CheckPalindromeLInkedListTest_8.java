package week2.linkedListTest;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CheckPalindromeLInkedListTest_8 {

    public static void main(String[] args) {

        List<Character> linkedList = new LinkedList<Character>(){{
            add('A');
            add('B');
            add('A');
        }};

        //Check if String is Palindrome
        boolean b = IntStream.range(0, linkedList.size() / 2)
                .allMatch(i -> linkedList.get(i).equals(linkedList.get(linkedList.size()- 1 - i)));

        if ( b == true ) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
