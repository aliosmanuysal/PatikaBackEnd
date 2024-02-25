/*
Tip Dönüşümleri
Kullanıcıdan alınan tam sayıyı ondalıklı sayıya dönüştürme
Kullanıcıdan alınan ondalıklı sayıyı tam sayıya dönüştürme
Author: @aliosmanuysal
2024
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner sınıfını kullanarak kullanıcıdan giriş alalım
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt(); // Kullanıcıdan tam sayıyı al

        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble(); // Kullanıcıdan ondalıklı sayıyı al

        // Tam sayıyı ondalıklı sayıya dönüştür
        double tamSayiOndalikli = (double) tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştür
        int ondalikliSayiTam = (int) ondalikliSayi;

        // Sonuçları ekrana yazdır
        System.out.println("Girilen Tam Sayı: " + tamSayi);
        System.out.println("Tam Sayıyı Ondalıklıya Dönüştürüldü: " + tamSayiOndalikli);

        System.out.println("\nGirilen Ondalıklı Sayı: " + ondalikliSayi);
        System.out.println("Ondalıklı Sayıyı Tama Dönüştürüldü: " + ondalikliSayiTam);

    }
}
