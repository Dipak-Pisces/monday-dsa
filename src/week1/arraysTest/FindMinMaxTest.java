package week1.arraysTest;

import java.util.Arrays;

public class FindMinMaxTest {
    public static void main(String args[]){

        int[] arr = {1,2,3,4,5,6,7,8};

        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(min+" "+max);

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){max=arr[i];}
            if(arr[i]<min){min=arr[i];}
        }

        System.out.println(min+" "+max);
    }
}
