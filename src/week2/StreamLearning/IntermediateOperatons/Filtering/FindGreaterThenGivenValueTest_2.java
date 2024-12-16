package week2.StreamLearning.IntermediateOperatons.Filtering;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindGreaterThenGivenValueTest_2 {

    /*
    * 2. Question: Find Numbers Greater Than a Given Value
    Problem: Given an array of integers and a threshold value, ret urn a list of all numbers greater than the threshold  .
    Hint:  Use  filter to select numbers greater than the threshold.
    */

    public static void main(String[] args) {
         int[] arr = new int[] {1,2,3,4,5,6,7,8};
         int threshold = 4;

        List<Integer> collect = IntStream.of(arr)
                .boxed()
                .filter(x -> x > threshold)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

    }
}
