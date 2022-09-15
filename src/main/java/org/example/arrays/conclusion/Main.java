package org.example.arrays.conclusion;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,2,3,4,5}));
    }
    public static int heightChecker(int[] heights){
        int[] arr = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }

    public static int thirdMax(int[] nums){
        return 2;
        // some thing in master branch
    }
    //some things
}
