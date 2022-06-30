package com.javae2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BillingSolution {
    public static void main(String[] args) throws IOException {

        Scanner readInput = new Scanner(System.in);
        String[] input=readInput.nextLine().split(" ");
        Map<String,Integer> myItems=new HashMap<String,Integer>();
        for(int i=0;i<input.length;i+=2){
            myItems.put(input[i],Integer.parseInt(input[i+1]));
        }
        Register regObj = Register.getInstance();
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();

    }
}

class Register {

    private static Register register = null;
    /*
     * Complete the 'getTotalBill' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts MAP itemDetails as parameter.
     */

    public String getTotalBill(Map<String,Integer> itemDetails) {

        // Write your code here
        Map<String, Double> prices = new HashMap<>();
        prices.put("apple", 2.0);
        prices.put("orange", 1.5);
        prices.put("mango", 1.2);
        prices.put("grape", 1.0);

        double sum = 0;

        for (Map.Entry<String, Integer> entry: itemDetails.entrySet()) {
            for (Map.Entry<String, Double> price: prices.entrySet()) {
                if (entry.getKey().equalsIgnoreCase(price.getKey())) {
                    sum = sum + (entry.getValue()*price.getValue());
                }
            }
        }

        return sum+"";
    }

    public static Register getInstance() {
        register = new Register();
        return register;
    }

}
