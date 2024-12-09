package arrayTest.Collectors;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoiningTest {

    public static void main(String  args[]){

        String[] arr = {"Dipak","Is","A","Good","Boy"};

        String collect = Arrays.stream(arr).collect(Collectors.joining());
        System.out.println(collect);

    }
}
