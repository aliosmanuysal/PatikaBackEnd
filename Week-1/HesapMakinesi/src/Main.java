/*
    Kullanıcıdan alınan iki sayı ve işlem seçimi ile dört işlemi yapan program
    (Toplama, çıkarma, çarpma, bölme)
    BY: ALİ OSMAN UYSAL - 2024
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan birinci sayıyı alma
        System.out.print("Birinci sayiyi girin: ");
        float sayi1 = scanner.nextFloat();

        // Kullanıcıdan ikinci sayıyı alma
        System.out.print("İkinci sayiyi girin: ");
        float sayi2 = scanner.nextFloat();

        // Kullanıcıdan işlem seçimini alma
        System.out.print("Yapmak istediğiniz işlemi seçin (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        float sonuc = 0;

        // Switch-case yapısı ile işlem seçimi
        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                // Sıfıra bölme hatası kontrolü
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata: Sıfıra bölme hatası!");
                    return; // Programı sonlandır
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return; // Programı sonlandır
        }

        // Sonucu ekrana yazdırma
        System.out.println("Sonuç: " + sonuc);
    }
}
