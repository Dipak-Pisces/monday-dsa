package week2.StreamLearning.IntermediateOperatons.Limiting_Examining_Converting;

import java.util.Arrays;
import java.util.List;

public class ListOfStringIntoArrayTest_8 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Dipak","Patil","is","here");

        String[] array = list.stream().toArray(String[]::new);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
