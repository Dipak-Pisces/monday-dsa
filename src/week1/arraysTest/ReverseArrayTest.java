package week1.arraysTest;

import java.util.stream.IntStream;

public class ReverseArrayTest {

    public static void main(String args[]){

        int[] arr = {5,4,6,3,7};

        IntStream.range(0,arr.length)
                .map(i -> arr[arr.length-i-1])
                .forEach(System.out::println);
    }

}
