package com.hackerranck;

public class HighestValuePalindrome {

    public static void main(String[] args) {
        System.out.println(highestValuePalindrome());
    }

    public static String highestValuePalindrome() {
        String s = "092282";
        int k = 3;
        String result = "";
        int minChange = 0;
        char[] chars = s.toCharArray();
        for (int i = 0, j = chars.length-1; i<j; i++, j--) {
            if (chars[i] != chars[j]) {
                minChange++;
            }
        }

        if (minChange > k) {
            return "-1";
        }

        int changeBoth = k - minChange;
        int i = 0;
        int j = chars.length - 1;
        for (; i <= j; i++, j--) {
            int max = Math.max(chars[i], chars[j]);
            char maxChar = (char) max;
            if (chars[i] != chars[j]) {
                if (maxChar != '9' && changeBoth - 1 >= 0) {
                    chars[i] = '9';
                    chars[j] = '9';
                    changeBoth--;
                } else {
                    chars[i] = maxChar;
                    chars[j] = maxChar;
                    minChange--;
                }
            } else {
                if (maxChar != '9' && changeBoth - 2 >= 0) {
                    chars[i] = '9';
                    chars[j] = '9';
                    changeBoth -= 2;
                }
            }
        }
        if (changeBoth != 0 && i - 1 == j + 1) {
            chars[i - 1] = '9';
        }
        result = new String(chars);
        return result;
    }
}
