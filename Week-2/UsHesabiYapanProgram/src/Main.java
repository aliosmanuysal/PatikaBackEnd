/*
    Java'da recursive metot kullanarak üs hesaplama
    Örnek: 2^3 = 2 * 2 * 2 = 8
    Author: Ali Osman UYSAL
    2024
 */

import java.util.Scanner;

public class Main {

    // Recursive metot kullanarak üs hesaplama
    static int usHesapla(int taban, int us) {
        // Üs 0 ise 1'i döndür
        if (us == 0) {
            return 1;
        } else {
            // Üssü rekürsif olarak hesapla
            return taban * usHesapla(taban, us - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int taban = scanner.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = scanner.nextInt();

        // Recursive metot kullanarak üs hesapla
        int sonuc = usHesapla(taban, us);

        // Sonucu ekrana yintln("Sonuç: " + sonuc);
        //
        //        // Scanner'ı kapat
        //        scanner.close();
        //    }azdır
        System.out.pr
}
