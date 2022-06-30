package com.j8practice;

public interface In1 {

    default void show() {
        System.out.println("Show from I1");
    }

    /*default boolean equals(Object o) {
        return true;
    }*/

    static void show1() {
        System.out.println("Hi from static");
    }
}
