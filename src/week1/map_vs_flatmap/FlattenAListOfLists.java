package week1.map_vs_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenAListOfLists {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));

        List<Integer> collect = list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}
