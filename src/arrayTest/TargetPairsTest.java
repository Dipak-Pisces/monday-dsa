package arrayTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TargetPairsTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 6;

        List<int[]> collect = IntStream.range(0, arr.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, arr.length)
                        .filter(j -> arr[i] + arr[j] == target)
                        .mapToObj(j -> new int[]{arr[i], arr[j]})
                ).collect(Collectors.toList());

        for (int[] ints : collect) {
            System.out.println(Arrays.toString(ints));
        }
    }
}
