package com.hackerranck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{-2,-3,4,-1,-2,5,-3};
        List<Integer> list = Arrays.asList(arr);
        int diff = Integer.MAX_VALUE;
        int least = 0;
        int n = 3;
        for (int i =0; i<arr.length; i++) {
            if (Math.abs(arr[i] - n) < diff) {
                diff = Math.abs(arr[i] - n);
                least = arr[i];
            }
        }
        System.out.println(least + " " + diff);
    }


    public int findClosest(List<Integer> list, int n) {
        return 0;
    }
}
