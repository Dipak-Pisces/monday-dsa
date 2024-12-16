package week2.StreamLearning.IntermediateOperatons.Flattening;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatten2dStringto1DStringTest_2 {

    public static void main(String[] args) {
        List<String[]> list = Arrays.asList(new String[]{"apple", "banana"},new String[]{"cat", "dog"});

        List<String> list1 = list.stream()
                .flatMap(x -> Arrays.stream(x))
                .toList();

        list1.forEach(System.out::println);
    }
}
