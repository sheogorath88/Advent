package com.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        xmas();

//        whichBigger();

//        whichBiggerMath();
//
//        whichSmaller();

        checkTheDay(12, 4);

    }
    private static void checkTheDay(int a, int b){
        if(a % b == 0){
            System.out.println("Dzisiejszy dzien jest dzielnikiem grudnia");
        } else {
            System.out.println("Dzisiejszy dzien nie jest dzielnikiem grudnia");
        }

    }

    private static void whichSmaller() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj, podaj proszę dwie liczby");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == b) {
            System.out.println("Podano dwie liczby o tej samej wartości");
            System.exit(128);
        }
        System.out.println(Math.min(a, b) + " jest mniejszą liczbą");
    }

    private static void whichBiggerMath() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj, podaj proszę dwie liczby");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == b) {
            System.out.println("Podano dwie liczby o tej samej wartości");
            System.exit(128);
        }
        System.out.println(Math.max(a, b) + " jest większą liczbą");
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
