package week2.StreamLearning.IntermediateOperatons.Limiting_Examining_Converting;

import java.util.Arrays;

public class AllPositiveTest_2 {

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,-9,7,8};

        boolean b = Arrays.stream(arr)
                .allMatch(x -> x > 0);
        System.out.println(b);
    }
}
