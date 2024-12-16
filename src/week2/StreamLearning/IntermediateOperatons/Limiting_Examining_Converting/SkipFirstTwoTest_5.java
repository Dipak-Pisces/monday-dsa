package week2.StreamLearning.IntermediateOperatons.Limiting_Examining_Converting;

import java.util.Arrays;

public class SkipFirstTwoTest_5 {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8};

        int[] array = Arrays.stream(arr)
                .skip(2)
                .toArray();

        for (int i : array) {
            System.out.println(i);
        }
    }
}
