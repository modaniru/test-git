package org.example.arrays.searching;

import java.util.*;

public class NAndM {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,2,1};
        System.out.println(validMountainArray(array));
    }

    public static Boolean checkIfExist(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
            if(set.contains(i/2) && i%2==0 && i!=0|| set.contains(i*2)) return true;
        }
        return false;
    }

    public static Boolean validMountainArray(int[] array){
        if (array.length < 3) return false;
        if(array[0] >= array[1] || array[array.length-1] > array[array.length-2]) return false;
        boolean isStart = true;
        boolean isEnd = false;
        for(int i = 0; i < array.length-1; i++){
            if(array[i] == array[i+1]) return false;
            if(array[i] > array[i+1] && isStart){
                isStart = false;
                isEnd = true;
                continue;
            }
            else if(array[i] < array[i+1] && isEnd) return false;
        }
        return true;
    }

}
