package week1.map_vs_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestOne {

    public static void main(String[] args) {

        List<String> arr = Arrays.asList("Java Streams","are awesome");

        List<String[]> collect = arr.stream()
                .map(s -> s.split(" "))
                .collect(Collectors.toList());

        collect.forEach( x-> System.out.println(Arrays.toString(x)));

        List<String> collect1 = arr.stream()
                .flatMap(x -> Arrays.stream(x.split(" ")))
                .collect(Collectors.toList());
        System.out.println(collect1);

    }
}
