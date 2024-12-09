package arrayTest;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequencyTest {

    public static void main(String args[]){

        int[] arr ={1,1,1,3,3,4,4,4,4,4,5,5,5,5,5,5,5,5,5};

        Map<Integer, Long> output = Arrays.stream(arr)
                .boxed()
                .collect(
                        Collectors.groupingBy(
                                x -> x,
                                Collectors.counting()
                        )
                );

        output.forEach((k,v)-> System.out.println(k+" "+v));
    }
}
