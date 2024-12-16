package week2.StreamLearning.IntermediateOperatons.Limiting_Examining_Converting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReturnFirstThreeTest_4 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> collect = list.stream().limit(3).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
