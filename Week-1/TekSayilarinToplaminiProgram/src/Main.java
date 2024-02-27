/*
Tek bir sayı girilene kadar çift ve 4'ün katları olan sayıları toplayan programa hoş geldiniz.
Author: Ali Osman Uysal
2024
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Tek bir sayı girilene kadar çift ve 4'ün katları olan sayıları toplayan programa hoş geldiniz.");

        while (true) {
            System.out.print("Bir sayı girin: ");
            int sayi = scanner.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) { // Çift ve 4'ün katı kontrolü
                toplam += sayi;
            }

            if (sayi < 0) {
                break;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
        scanner.close();
    }
}
