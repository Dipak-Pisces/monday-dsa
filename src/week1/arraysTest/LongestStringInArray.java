package week1.arraysTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LongestStringInArray {
    public static void main(String[] args) {
        String[] arr = {"dipak","shubhashree","sneha","ramavati","pallavi","kriti","puji","anshi"};


        // using max
        String s = Arrays.stream(arr)
                .max(Comparator.comparingInt(String::length)).get();
        System.out.println(s);

        //using reducing
        String s1 = Arrays.stream(arr)
                .collect(
                        Collectors.reducing(
                                (a, b) -> a.length() > b.length() ? a : b
                        )
                ).get();
        System.out.println(s1);


    }
}
