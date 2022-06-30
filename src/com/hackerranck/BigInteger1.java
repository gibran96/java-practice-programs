package com.hackerranck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigInteger1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        BigInteger n1 = new BigInteger(a);
        BigInteger n2 = new BigInteger(b);
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
    }
}
