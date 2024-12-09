package arrayTest.Collectors;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class groupingByTest {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        IntStream.of(arr).boxed().collect(
                Collectors.groupingBy(
                        x -> x%2==0?"Even":(x>5?"G-Odd":"L-Odd"),
                        Collectors.toList()
                )
        ).forEach((k,v) -> System.out.println(k+" "+v));

    }
}
