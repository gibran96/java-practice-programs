package com.hackerranck;

import java.math.BigInteger;

public class BigNumber {

    public static void main(String[] args) {
        String n = "282755483533707287054752184321121345766861480697448703443857012153264407439766013042402571";
        BigInteger num = new BigInteger(n);
        if (num.intValue() > 1 && num.isProbablePrime(1000)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
