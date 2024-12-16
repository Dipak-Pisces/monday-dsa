package week2.StreamLearning.IntermediateOperatons.Flattening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Flatten2Dto1DTest_1 {

    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));

        List<Integer> collect = list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);


    }
}
