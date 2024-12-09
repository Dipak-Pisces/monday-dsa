package arrayTest.Collectors;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SummarizingIntTest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        IntSummaryStatistics collect = IntStream.of(arr).boxed().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(collect.toString());

    }

    /*
    *  NOTES ::
    *
    *  It's mostly safe to say that Arrays.stream(int[]) and IntStream.of(int[]) are functionally similar,
    *  but they are not exactly the same.
    *
    *  For an int[], both Arrays.stream(int[]) and IntStream.of(int[]) will give you the same result—a stream of primitive ints.
    *  However, Arrays.stream() is a more general method, whereas IntStream.of() is specifically for creating IntStreams from primitive int[].
    * */
}
