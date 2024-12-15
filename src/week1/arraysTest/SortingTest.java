package week1.arraysTest;

import java.util.Arrays;

public class SortingTest {

    public static void main(String args[]){

        int arr[] = {8,7,6,5,2,4,3,1,8,0,9,7};

        Arrays.stream(arr).sorted().forEach(System.out::println);

    }
}
