package week2.StreamLearning.IntermediateOperatons.Limiting_Examining_Converting;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayOfIntIntoListTest_7 {

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8};

        List<Integer> collect = Arrays.stream(arr)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());
    }
}
