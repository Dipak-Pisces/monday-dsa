package week2.StreamLearning.IntermediateOperatons.Transforming;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheOccuranceTest_4 {

    /*
    *4. Question: Count the Occurrences of Each Number
    Problem: Given an array of integers, return a map of each number and its frequency in the array.
    Hint: Use groupingBy with counting.
    * */

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,7,6,5,3,4,5,2,3,4,8,6,4};

        Map<Integer, Long> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach( (k,v) -> System.out.println(k+" "+v));
    }
}
