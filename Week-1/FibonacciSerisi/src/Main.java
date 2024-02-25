/*
    Java ile kullanıcıdan alınan sayıya kadar olan Fibonacci serisi bulan programı yazınız.
    Fibonacci serisi : 0 1 1 2 3 5 8 13 21 ....
    BY: @aliosmanuysal
    2024
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisi eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        if (elemanSayisi <= 0) {
            System.out.println("Geçersiz giriş. Pozitif bir sayı girin.");
        } else {
            System.out.println(elemanSayisi + " Elemanlı Fibonacci Serisi:");
            fibonacciSerisiYazdir(elemanSayisi);
        }

        scanner.close();
    }

    public static void fibonacciSerisiYazdir(int n) {
        int sayi1 = 0, sayi2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(sayi1 + " ");

            int toplam = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }
    }
}
