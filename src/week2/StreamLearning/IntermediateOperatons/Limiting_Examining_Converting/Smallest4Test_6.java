package week2.StreamLearning.IntermediateOperatons.Limiting_Examining_Converting;

import java.util.Arrays;

public class Smallest4Test_6 {
    public static void main(String[] args) {
        int[] arr = new int[] {41,24,75,65,34,77,64,123,12};

        int[] array = Arrays.stream(arr)
                .sorted()
                .limit(4)
                .toArray();

        for (int i : array) {
            System.out.println(i);
        }
    }
}
