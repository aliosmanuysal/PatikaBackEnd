/*
    Uçak bileti fiyatı hesaplayan program
    - Mesafe başına 10 TL
    - 12 yaşından küçükler için %50 indirim
    - 12-24 yaş arası için %10 indirim
    - 65 yaşından büyükler için %30 indirim
    - Gidiş-Dönüş için %20 indirim
    - Business koltuk için %50 ek ücret
    - Bagaj hakkı 20 kg'dan fazla ise fazla kg başına 0.5 TL ek ücret

    BY: ALİ OSMAN UYSAL - 2024
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bilgileri alma
        System.out.print("Mesafe (km): ");
        int mesafe = scanner.nextInt();
        System.out.print("Yaş: ");
        int yas = scanner.nextInt();
        System.out.print("Yolculuk tipi (Tek Yön/Gidiş-Dönüş): ");
        String yolculukTipi = scanner.next();
        System.out.print("Koltuk tipi (Ekonomi/Business): ");
        String koltukTipi = scanner.next();
        System.out.print("Bagaj hakkı (kg): ");
        int bagajHakki = scanner.nextInt();

        // Fiyat hesaplama
        double biletFiyati = mesafe * 10; // Mesafe başına 10 TL

        // İndirim hesaplama
        if (yas < 12) {
            biletFiyati *= 0.5; // %50 indirim
        } else if (yas >= 12 && yas <= 24) {
            biletFiyati *= 0.9; // %10 indirim
        } else if (yas >= 65) {
            biletFiyati *= 0.7; // %30 indirim
        }

        // Yolculuk tipi ve koltuk tipi için ek ücretler
        if (yolculukTipi.equalsIgnoreCase("Gidiş-Dönüş")) {
            biletFiyati *= 0.8; // %20 indirim
        }
        if (koltukTipi.equalsIgnoreCase("Business")) {
            biletFiyati *= 1.5; // %50 ek ücret
        }

        // Bagaj hakkı için ek ücret
        if (bagajHakki > 20) {
            biletFiyati += (bagajHakki - 20) * 0.5; // Fazla kg başına 0.5 TL ek ücret
        }

        // Sonucu yazdırma
        System.out.println("Bilet fiyatı: " + biletFiyati + " TL");
    }
}
