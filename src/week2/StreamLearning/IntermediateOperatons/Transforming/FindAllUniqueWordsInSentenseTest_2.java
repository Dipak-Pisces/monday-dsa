package week2.StreamLearning.IntermediateOperatons.Transforming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllUniqueWordsInSentenseTest_2 {


    /*
    2. Question: Find All Unique Words in a Sentence
    Problem: Given a string, return a list of unique words in the string (ignoring case).
    Hint: Use split, map, and distinct.
    * */

    public static void main(String[] args) {

        String s = "Java is fun and Java is powerful";

        List<String> collect = Arrays.stream(s.split(" "))
                .distinct()
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
