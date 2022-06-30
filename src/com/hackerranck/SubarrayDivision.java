package com.hackerranck;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {

    public static int birthday() {
        // Write your code here
        List<Integer> s = new ArrayList<>();
        s.add(4);
        s.add(1);
        int d = 4, m = 1;
        int c = 0;
        for (int i = 0; i < s.size(); i++) {
            if ((i + m) < s.size()) {
                List<Integer> sub = s.subList(i, i + m);
                if (sub.stream()
                        .reduce(0, Integer::sum) == d) {
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\PracticePrograms\\output.txt"));
        int result = birthday();
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
