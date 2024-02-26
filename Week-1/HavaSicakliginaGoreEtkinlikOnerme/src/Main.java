/*
Hava sıcaklığına göre etkinlik önerme programı
Author: Ali Osman Uysal
2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan sıcaklık değerini almak için Scanner sınıfını kullanıyoruz.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan sıcaklık değerini girmesini istiyoruz.
        System.out.print("Lütfen sıcaklık değerini girin: ");
        int sicaklik = scanner.nextInt();

        // Önerilen etkinliği saklamak için bir String değişkeni tanımlıyoruz.
        String etkinlik;

        // if-else yapısını kullanarak sıcaklık değerine göre etkinlik önerisi yapıyoruz.
        if (true == sicaklik < 5) {
            etkinlik = "Kayak";
        } else if (true == sicaklik >= 5 && sicaklik <= 15) {
            etkinlik = "Sinema";
        } else if (true == sicaklik > 15 && sicaklik <= 25) {
            etkinlik = "Piknik";
        } else if (true == sicaklik > 25) {
            etkinlik = "Yüzme";
            // Eğer hiçbir durum sağlanmazsa varsayılan bir değer belirliyoruz.
        } else {
            etkinlik = "Belirtilmeyen bir durum";
        }

        // Kullanıcıya önerilen etkinliği ekrana yazdırıyoruz.
        System.out.println("Önerilen etkinlik: " + etkinlik);

        // Scanner nesnesini kapatıyoruz.
        scanner.close();
    }
}
