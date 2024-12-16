package week2.StreamLearning.IntermediateOperatons.Filtering;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindAllEvenTest_1 {

    /*
    * 1. Question: Find All Even Numbers in an Array
    Problem: Given an array of integers, return a list of all even numbers in the array.
    Hint: Use filter to select even numbers.*/

    public static void main(String[] args) {
         int[] arr = new int[] {1,2,3,4,5,6,7,8};

        LinkedList<Integer> collect = IntStream.of(arr)
                .boxed()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(LinkedList::new));

        collect.forEach(System.out::println);
    }
}
