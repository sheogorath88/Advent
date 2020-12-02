package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        xmas();

        whichBigger();

    }
    private static void whichBigger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj, podaj proszę dwie liczby");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Pierwsza liczba jest większa");
        } else if (a < b) {
            System.out.println("Druga liczba jest większa");
        } else {
            System.out.println("Podane liczby są sobie równe");
        }
    }
    public static void xmas() {
        System.out.println("hello, Xmas!");
    }
}
