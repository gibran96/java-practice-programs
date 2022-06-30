package com.hackerranck;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        System.out.println(divisibleSumPairs());
    }

    public static int divisibleSumPairs() {
        // Write your code here
        List<Integer> ar = new ArrayList<>();
        int k = 3;
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);
        int count = 0;
        for(int i = 0; i < ar.size(); i++) {
            for (int j = i+1; j < ar.size(); j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    count ++;
                }
            }
        }
        return count;
    }
}
