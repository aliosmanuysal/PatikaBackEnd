/*
KDV hesaplama programı
Kullanıcıdan alınan ürün tutarına göre KDV oranını belirleyen ve KDV'li fiyatı hesaplayan program.
KDV oranı 1000 TL'den küçükse %18, 1000 TL ve üstüyse %8 olarak belirlenmiştir.
BY: ALİ OSMAN UYSAL - 2024
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tutarı alma
        System.out.print("Ürünün tutarını giriniz: ");
        double tutar = scanner.nextDouble();

        // KDV oranını belirleme
        double kdvOrani;
        if (tutar <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        // KDV tutarını hesaplama
        double kdvTutari = tutar * kdvOrani;

        // KDV'li fiyatı hesaplama
        double kdvliFiyat = tutar + kdvTutari;

        // Sonuçları yazdırma
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");
    }
}