package week1.arraysTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElementInArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,6,7,8,8,5,3,4,6,8,9,4,3,6};

        List<Integer> collect = Arrays.stream(arr)
                .boxed()
                .distinct()
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
