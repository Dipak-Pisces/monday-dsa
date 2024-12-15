package week1.Collectors;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReducingTest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};


        Optional<Integer> reduce = IntStream.of(arr).boxed().reduce((a, b) -> a + b);
        reduce.ifPresent(System.out::println);

        IntStream.of(arr).boxed().collect(Collectors.reducing( (a,b) -> a<b? a:b)).ifPresent(System.out::println);



    }
}
