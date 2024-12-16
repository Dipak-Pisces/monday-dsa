package week2.StreamLearning.IntermediateOperatons.Limiting_Examining_Converting;

import java.util.Arrays;

public class NoneIsGreaterThen100Test_3 {

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5,6,7,8,101};

        boolean b = Arrays.stream(arr)
                .noneMatch(x-> x>100);
        System.out.println(b);
    }
}
