package week1.arraysTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCaseTest {

    public static void main(String[] args) {

        String[] arr ={"ajay","kriti","sita","shweta"};

        List<String> collect = Arrays.stream(arr)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);

    }
}
