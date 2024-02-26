/*
Bu program kullanıcının doğduğu ayı alır ve hangi burca denk geldiğini söyler.
Author: ALİ OSMAN UYSAL
2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan doğduğu ayın sayısını almak için bir Scanner nesnesi oluşturuyoruz.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğduğunuz ayın sayısını girin (1-12): ");
        // Kullanıcının girdiği ay değerini alıyoruz.
        int ay = scanner.nextInt();

        // Kullanıcının burcunu saklayacak bir değişken.
        String burc = "";

        // Girilen ayın geçerli bir ay olup olmadığını kontrol ediyoruz.
        if ((ay >= 3 && ay <= 12) || (ay == 1)) {
            // Koç ve Oğlak burçları kontrol ediliyor.
            if ((ay >= 3 && ay <= 4) || (ay == 12)) {
                burc = "Koç Burcu";
            } else if (ay >= 5 && ay <= 6) {
                burc = "Boğa Burcu";
            } else if (ay >= 7 && ay <= 8) {
                burc = "İkizler Burcu";
            } else if (ay >= 9 && ay <= 10) {
                burc = "Yengeç Burcu";
            } else if (ay >= 11 && ay <= 12) {
                burc = "Aslan Burcu";
            } else if (ay >= 1 && ay <= 2) {
                burc = "Oğlak Burcu";
            }
        } else {
            // Geçersiz ay değeri girildiyse kullanıcıya bilgi veriyoruz ve programı sonlandırıyoruz.
            System.out.println("Geçersiz ay değeri girdiniz.");
            return;
        }

        // Kullanıcıya hangi burca denk geldiğini söyleyen bir mesaj yazdırılıyor.
        System.out.println("Burcunuz: " + burc);

        // Scanner nesnesini kapatıyoruz.
        scanner.close();
    }
}