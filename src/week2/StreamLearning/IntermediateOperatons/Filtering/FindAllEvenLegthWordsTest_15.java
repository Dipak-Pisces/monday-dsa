package week2.StreamLearning.IntermediateOperatons.Filtering;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllEvenLegthWordsTest_15 {

    /*
    15. Find All Even Length Words **
    Problem: Given a list of strings, return a list of words with an even number of characters.
    * */

    public static void main(String[] args) {
        List<String> l1  = Arrays.asList("Dipak","Patil","Sai","Baba","Kriti","Kuldeep","Omkar","Ajay");

        List<String> collect = l1.stream()
                .filter(x -> x.length() % 2 == 0)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

}
