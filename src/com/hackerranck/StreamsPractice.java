package com.hackerranck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 21, 34, 46, 54, 68, 74);

        

        //forEach accepts Consumer Interface which is a functional interface
        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {

            }
        };
        /*values.forEach(System.out::println);*/

        /*System.out.println(values.stream()
                .filter(i -> i % 5 == 0)
                .reduce(0, Integer::sum));*/
        

        //System.out.println(values.stream().map(i -> i*2).reduce(0,(c,e) -> c+e));

        /*Integer s = values.stream()
                .map(i -> i*2)
                .reduce(0, Integer::sum);
        System.out.println(s);*/

        //values.forEach(StreamsPractice::doubleIt);

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i<=100; i++) {
            numbers.add(i);
        }


        //numbers.stream().forEach(System.out::println);
        numbers.stream().filter(i -> {
            System.out.println("Hi");
            return true;
        }).findFirst().orElse(0);

        /*List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        productsList.stream()
                .filter(product -> product.price == 30000)
                .forEach(product -> System.out.println(product.name));

        Float totalPrice = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f,Float::sum);


        Double totalPrice2 = productsList.stream().mapToDouble(product -> product.price).sum();

        System.out.println(totalPrice);*/


    }

    public static void doubleIt(int i) {
        System.out.println(i * 2);
    }
}

class Product {
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
