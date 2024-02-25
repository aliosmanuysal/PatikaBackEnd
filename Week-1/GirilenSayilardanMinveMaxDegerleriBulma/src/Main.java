/*
    Kullanıcıdan alınan n tane sayı arasından en büyük ve en küçük sayıyı bulan program.
    BY: ALİ OSMAN UYSAL - 2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için bir Scanner nesnesi oluşturuluyor.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kaç tane sayı gireceğini isteyen kısım.
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        // Girilen sayıları tutmak için bir dizi oluşturuluyor.
        int[] numbers = new int[n];

        // Kullanıcıdan sayıları alıp diziye ekleyen döngü.
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Sayıyı giriniz: ");
            numbers[i] = scanner.nextInt();
        }

        // En büyük ve en küçük sayıları bulmak için değişkenler oluşturuluyor.
        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        // Diziyi tarayarak en büyük ve en küçük sayıları bulan döngü.
        for (int i = 1; i < n; i++) {
            // Eğer mevcut sayı, şu ana kadar bulunan en büyük sayıdan büyükse, maxNumber güncellenir.
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }

            // Eğer mevcut sayı, şu ana kadar bulunan en küçük sayıdan küçükse, minNumber güncellenir.
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
        }

        // Sonuçları ekrana yazdıran kısım.
        System.out.println("En büyük sayı: " + maxNumber);
        System.out.println("En küçük sayı: " + minNumber);
    }
}
