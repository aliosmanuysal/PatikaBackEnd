/*
Kullanıcıdan alınan 3 sayıyı küçükten büyüğe sıralayan programı yazınız.
Author: ALİ OSMAN UYSAL
2024
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 3 sayıyı girmesini iste
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        // Sayıları küçükten büyüğe sırala
        int[] siraliSayilar = { sayi1, sayi2, sayi3 };
        Arrays.sort(siraliSayilar);

        // Sıralanmış sayıları ekrana yazdır
        System.out.println("Sayılar küçükten büyüğe sıralandı: " + Arrays.toString(siraliSayilar));
    }
}
