package arrayTest;

import java.util.stream.IntStream;

public class SumOfEvenNumbersTest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

        int sum = IntStream.of(arr)
                .filter(x -> x % 2 == 0)
                .sum();
        System.out.println(sum);
    }
}
