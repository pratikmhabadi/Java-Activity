package com.lesson1;

import java.util.Scanner;

public class ReadScanner {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("The sum is " + (a + b) + ".");
    }
}
