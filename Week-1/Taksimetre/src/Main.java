/*
    Kullanıcıdan alınan mesafeye göre taksi ücretini hesaplayan program.
    Author: @aliosmanuysal
    2024
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımla.
        int km;
        double price = 2.20, total , startprice = 10;

        // Scanner class'ı ile kullanıcıdan veri almak için bir nesne oluştur.
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        // Kullanıcıdan alınan veriyi kullanarak toplam tutarı hesapla.
        total = startprice + (km * price);

        if (total < 20){   // Eğer toplam tutar 20 TL'den az ise 20 TL olarak yazdır.
            System.out.println("Ödenecek tutar: 20 TL");
        } else {   // Eğer toplam tutar 20 TL'den fazla ise toplam tutarı yazdır.
            System.out.println("Ödenecek tutar: " + total + " TL");
        }
    }
}