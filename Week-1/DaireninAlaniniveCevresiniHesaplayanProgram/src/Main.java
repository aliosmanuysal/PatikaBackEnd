/*
    Kullanıcıdan alınan yarıçapı kullanarak dairenin alanını ve çevresini hesaplayan program.
    Alan = π * r * r
    Çevre = 2 * π * r
    π = 3.14
    Author: @aliosmanuysal
    2024
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenleri tanımla
        int r;
        double pi = 3.14;

        // Scanner sınıfı ile kullanıcıdan veri almak için nesne oluştur
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yarıçapı al
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        // Alan ve çevreyi hesapla
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        // Sonuçları ekrana yazdır
        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
    }
}


