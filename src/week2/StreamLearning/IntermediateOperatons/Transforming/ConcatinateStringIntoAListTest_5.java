package week2.StreamLearning.IntermediateOperatons.Transforming;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatinateStringIntoAListTest_5 {

    /*
    * 5. Question: Concatenate Strings in a List
    Problem: Given a list of strings, concatenate all strings into a single string, separated by commas.
    Hint: Use collect(Collectors.joining(",")).
    */
    public static void main(String[] args) {

        List<String> list = new LinkedList<>(Arrays.asList("Dipak","patil","is","here"));

        String collect = list.stream().collect(Collectors.joining(", "));
        System.out.println(collect);

    }
}
