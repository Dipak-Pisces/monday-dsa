package week2.StreamLearning.IntermediateOperatons.Limiting_Examining_Converting;

import java.util.Arrays;

public class CheckIfAnyNumberIsDivisibleBy5Test_1 {

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,6,7,8};

        boolean b = Arrays.stream(arr)
                .anyMatch(x -> x % 5 == 0);

        System.out.println(b);
    }
}
