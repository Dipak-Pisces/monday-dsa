package week2.StreamLearning.IntermediateOperatons.Transforming;

import java.util.Arrays;

public class FindSumOfSquaresAndOddNumbersTest_3 {

    /*
    3. Question: Find Sum of Squares of Odd Numbers
    Problem: Given an array of integers, find the sum of squares of all odd numbers in the array.
    Hint: Use filter to select odd numbers and mapToInt to square them, then use sum().
    * */

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6,7,8};

        int sum = Arrays.stream(arr)
                .filter(x -> x % 2 != 0)
                .map(x -> x * x)
                .sum();
        System.out.println(sum);
    }
}

