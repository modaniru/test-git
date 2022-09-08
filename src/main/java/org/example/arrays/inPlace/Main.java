package org.example.arrays.inPlace;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,2,3};
        System.out.println(removeElement(arr, 3));
        System.out.println(Arrays.toString(arr));
    }

    public static int[] replaceElements(int[] arr) {
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] > max){
                int some = arr[i];
                arr[i] = max;
                max = some;
                continue;
            }
            arr[i] = max;
        }
        return arr;
    }
    public static int removeDuplicates(int[] arr){
        if(arr.length==0) return 0;
        int len = 1;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                arr[len] = arr[i+1];
                len++;
            }
        }
        return len;
    }
    public static void deleteAllZero(int nums[]){
        int writerIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[writerIndex];
                nums[writerIndex] = temp;
                writerIndex++;
            }
        }
    }

    public static int[] sortArrayByParity(int[] nums){
        for(int i = 0, j =0; i < nums.length; i++){
            if(nums[i]%2==0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        return nums;
    }

    public static int removeElement(int[] nums, int val){
        int writeIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=val){
                int temp = nums[writeIndex];
                nums[writeIndex] = nums[i];
                nums[i] = temp;
                writeIndex++;
            }
        }
        return writeIndex;
    }
}
