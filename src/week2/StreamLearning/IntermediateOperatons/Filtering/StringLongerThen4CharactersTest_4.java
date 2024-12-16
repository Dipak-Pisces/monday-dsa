package week2.StreamLearning.IntermediateOperatons.Filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLongerThen4CharactersTest_4 {

    /*
    * 4. Find Strings Longer Than 4 Characters
    Problem: Given a list of strings, return all strings that have more than 4 characters.*/

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("dipak","patil","ajay","sai"));

        List<String> collect = list.stream()
                .filter(x -> x.length() > 4)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
