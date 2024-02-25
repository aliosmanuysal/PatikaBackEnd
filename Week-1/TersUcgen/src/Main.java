/*
Ters üçgen çizimi
Kullanıcıdan alınan basamak sayısına göre ters üçgen çizimi yapar.
BY: ALİ OSMAN UYSAL - 2024
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını al
        System.out.print("Basamak Sayısı: ");
        int basamakSayisi = scanner.nextInt();

        // Ters üçgeni çiz
        for (int i = basamakSayisi; i >= 1; i--) {
            // Boşlukları ekle
            for (int j = 0; j < basamakSayisi - i; j++) {
                System.out.print(" ");
            }

            // Yıldızları ekle
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Bir satır atla
            System.out.println();
        }

        scanner.close();
    }
}
