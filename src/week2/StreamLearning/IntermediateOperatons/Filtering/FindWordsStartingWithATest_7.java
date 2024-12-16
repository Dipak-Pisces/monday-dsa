package week2.StreamLearning.IntermediateOperatons.Filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindWordsStartingWithATest_7 {

    /*
    * 7. Filter Words Starting with "a"
    Problem: Given a list of strings, return a list of words that start with the letter "a".*/

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("dipak","patil","ajay","sai","katariya","anshika","alka"));

        List<String> collect = list.stream()
                .map(String::toUpperCase)
                .filter(x -> x.charAt(0) == 'A')
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

    }
}
