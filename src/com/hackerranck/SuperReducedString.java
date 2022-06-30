package com.hackerranck;


public class SuperReducedString {

    public static void main(String[] args) {
        System.out.println(superReducedString());
    }

    public static String superReducedString() {
        // Write your code here
        String s = "baab";
        String result = "";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i-1)) {
                sb.delete(i-1, i+1);
                i = 1;
            }
        }
        if (sb.length() == 0) {
            result = "Empty String";
        } else {
            result = sb.toString();
        }
        return result;
    }
}
