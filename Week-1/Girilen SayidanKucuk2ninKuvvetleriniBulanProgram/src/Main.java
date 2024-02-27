/*
Girilen Sayıdan Küçük 2’nin Kuvvetlerini Bulan Program
Author: Ali Osman Uysal - 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı al
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // 2'nin kuvvetlerini ekrana yazdır
        System.out.println("2'nin kuvvetleri:");
        for (int i = 0; i <= sayi; i++) {
            System.out.println("2^" + i + " = " + Math.pow(2, i));
        }

        // 4 ve 5'in kuvvetlerini ekrana yazdır
        System.out.println("\n4 ve 5'in kuvvetleri:");
        for (int i = 0; i <= sayi; i++) {
            System.out.println("4^" + i + " = " + Math.pow(4, i));
            System.out.println("5^" + i + " = " + Math.pow(5, i));
        }

        scanner.close();
    }
}
