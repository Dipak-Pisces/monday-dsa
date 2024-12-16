package week2.StreamLearning.IntermediateOperatons.Filtering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllPrimeTest_8 {

    /*
    * 8. Find All Prime Numbers in an Array
    problem: Given an array of integers, return a list of prime numbers in the array.
    */
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11};

        List<Integer> collect = IntStream.of(arr)
                .boxed()
                .filter(x -> {
                    for (int i = 2; i < x; i++) {
                        if (x % i == 0) {
                            return false;
                        }
                    }
                    return x==1?false:true;
                })
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
