/**
 * Kullanıcıdan alınan ürünlerin kilogram değerlerine göre toplam tutarı hesaplayan program.
 BY: ALİ OSMAN UYSAL
 02.2024
 */

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ürünlerin fiyatlarını bir `HashMap`'de saklıyoruz.
        HashMap<String, Double> fiyatlar = new HashMap<>();
        fiyatlar.put("Armut", 2.14);
        fiyatlar.put("Elma", 3.67);
        fiyatlar.put("Domates", 1.11);
        fiyatlar.put("Muz", 0.95);
        fiyatlar.put("Patlıcan", 5.00);

        // Toplam tutarı saklamak için bir değişken tanımlıyoruz.
        double toplamTutar = 0.0;

        // Her bir ürün için kullanıcıdan kilogram değerini alıyoruz.
        for (String urun : fiyatlar.keySet()) {
            System.out.print(urun + " Kaç Kilo ? :");
            double kilo = scanner.nextDouble();

            // Ürünün toplam tutarını hesaplıyoruz.
            double urunTutari = kilo * fiyatlar.get(urun);

            // Toplam tutara ekliyoruz.
            toplamTutar += urunTutari;
        }

        // Toplam tutarı ekrana yazdırıyoruz.
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}