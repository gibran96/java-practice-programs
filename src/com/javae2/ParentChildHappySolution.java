package com.javae2;

import java.util.Scanner;

public class ParentChildHappySolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        Parent p1 = new ChildOne();
        Parent p2 = new ChildTwo();
        p1.startElement = start;
        p1.endElement = end;
        p2.startElement = start;
        p2.endElement = end;
        System.out.println(p1.filter());
        System.out.println(p2.filter());
    }
}

class Parent {

    public int startElement;
    public int endElement;


    public String filter() {
        return null;
    }
}

class ChildOne extends Parent {

    @Override
    public String filter() {
        StringBuilder primeNumbers = new StringBuilder();
        for (int i = startElement; i <= endElement; i++) {
            int counter = 0;
            if (i <= 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                    break;
                }
            }
            if (counter == 0) {
                primeNumbers.append(i).append(" ");
            }
        }

        return primeNumbers.toString();
    }
}

class ChildTwo extends Parent {
    @Override
    public String filter() {
        StringBuilder happyNumbers = new StringBuilder();
        for (int i = startElement; i <= endElement; i++) {
            int result = i;
            while (result !=1 && result !=4) {
                result = isHappyNumber(result);
            }
            if (result == 1) {
                happyNumbers.append(i).append(" ");
            }
        }
        return happyNumbers.toString();
    }

    static int isHappyNumber(int num) {
        int rem = 0;
        int sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }
}