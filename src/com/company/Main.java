package com.company;

public class Main {
    int a = 10;
    int b = 10;

    void doSum() {
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }

    public static void main(String[] args) {
        // write your code here
        Main main = new Main();
        main.doSum();
    }
}
