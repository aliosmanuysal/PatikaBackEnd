/*
Çift Sayıları Bulan Program
Author: Ali Osman Uysal
2024
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girişi isteniyor
        System.out.print("Bir sayı girin: ");
        int girilenSayi = scanner.nextInt();

        // 0'dan girilen sayıya kadar olan çift sayıları bulan ve ekrana yazdıran döngü
        System.out.println("0'dan " + girilenSayi + "'e kadar olan çift sayılar:");
        for (int i = 0; i <= girilenSayi; i += 2) {
            System.out.print(i + " ");
        }

        // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan döngü
        int toplam = 0;
        int adet = 0;
        for (int i = 0; i <= girilenSayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        // Ortalamayı hesapla ve ekrana yazdır
        double ortalama = (adet > 0) ? (double) toplam / adet : 0;
        System.out.println("\n3 ve 4'e tam bölünen sayıların ortalaması: " + ortalama);

        scanner.close();
    }
}
