package com.test;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        xmas();

//        whichBigger();

//        whichBiggerMath();
//
//        whichSmaller();

//        checkTheDay(12, 4);

//        countWeeksInAdvent();

//        findRandom();

//        System.out.println("Witaj, podaj liczbę :)");
//        int a = scanner.nextInt();
//        fizzBuzz(a);

//        System.out.println("Podaj wyraz:");
//        String string = scanner.nextLine();
//        getSecondChar(string);

        System.out.println("Podaj dwa wyrazy:");
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        if (firstWord.equals(secondWord)) {
            System.out.println("podane słowa są identyczne!");
        } else if (firstWord.equalsIgnoreCase(secondWord)) {
            System.out.println("podane słowa są takie same - jednak różnią się wielkością liter");
        } else {
            System.out.println("podane słowa są różne");
        }
    }

    private static void getSecondChar(String string) {
        if (string.length() < 3) {
            System.out.println("Podany wyraz zawiera zbyt mało znaków");
        } else {
            System.out.println(string.charAt(2));
        }
    }

    private static void fizzBuzz(int a) {
        if ((a % 3 == 0) && (a % 5 == 0)) {
            System.out.println("fizz buzz");
        } else if (a % 3 == 0) {
            System.out.println("fizz");
        } else if (a % 5 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println(a);
        }
    }

    private static void findRandom() {
        Random random = new Random();
        int number = random.nextInt(6) + 1;
        System.out.println(number);
    }

    private static void countWeeksInAdvent() {
        int daysInWeek = 7;
        int daysInAdvent = 24;
        int wholeWeeksInAdvent = daysInAdvent / daysInWeek;
        System.out.println("Adwent składa się z " + wholeWeeksInAdvent + " pełnych tygodni");
    }

    private static void checkTheDay(int a, int b) {
        if (a % b == 0) {
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
