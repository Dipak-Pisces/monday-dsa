package week2.StreamLearning.IntermediateOperatons.Transforming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAndSquareEvenTest_1 {

    /*

       1. Question: Find Even Numbers and Square Them
          Problem: Given an array of integers, return a list of the squares of all even numbers in the array.
          Hint: Use filter to select even numbers and map to square them.

     s*/

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8};

        List<Integer> collect = Arrays.stream(arr)
                .boxed()
                .map(x -> x % 2 == 0 ? x * x : x)
                .collect(Collectors.toList());

        collect.forEach(System.out::println );
    }
}
