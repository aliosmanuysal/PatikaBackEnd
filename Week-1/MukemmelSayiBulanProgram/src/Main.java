/*
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
BY: ALİ OSMAN UYSAL - 2024
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner nesnesi oluşturuluyor.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı isteniyor.
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Girilen sayının pozitif tam sayı olup olmadığını kontrol ediyor.
        if (sayi < 1) {
            System.out.println("Lütfen pozitif bir tam sayı giriniz.");
        } else {
            // Girilen sayı mükemmel sayı mı değil mi kontrol ediliyor ve sonuç ekrana yazdırılıyor.
            if (isMukemmelSayi(sayi)) {
                System.out.println(sayi + " Mükemmel sayıdır.");
            } else {
                System.out.println(sayi + " Mükemmel sayı değildir.");
            }
        }

        // Scanner nesnesi kapatılıyor.
        scanner.close();
    }

    // Verilen sayının mükemmel sayı olup olmadığını kontrol eden fonksiyon.
    static boolean isMukemmelSayi(int sayi) {
        int toplam = 0;

        // Sayının kendisi hariç pozitif tam sayı çarpanları toplanıyor.
        for (int i = 1; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        // Toplam, sayının kendisine eşitse true, değilse false döndürülüyor.
        return toplam == sayi;
    }
}
