package arrayTest;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.stream.Stream;

public class MoveZerosToLeftTest {

    public static void main(String args[]){

        int arr[] = {7,6,2,43,12,0,87,9,0,76,0,64,2,46,7,0};

        Instant start = Instant.now();

        Stream.concat(
                        Arrays.stream(arr).boxed().filter(x -> x != 0),
                        Arrays.stream(arr).boxed().filter(x -> x == 0)
                )
                .mapToInt(Integer::intValue)
                .forEach(System.out::println);

        Instant end = Instant.now();

        int nano = Duration.between(start, end).getNano();
        System.out.println(nano);

    }
}
