package com.company;

import java.util.Scanner;

public class Main {
    double a = 0;
    double b = 1;
    double c = 2;
    double e = 3;
    double f = 4;
    double g = 5;
    public static void wyswietl () {
        String imie, nazwisko;
        int wiek;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wypisz imie");
        imie = scanner.next();
        System.out.println("Wypisz nazwisko");
        nazwisko = scanner.next();
        System.out.println("Wypisz wiek");
        wiek = scanner.nextInt();


    }



    public static void main(String[] args) {
        wyswietl();



    }
}
