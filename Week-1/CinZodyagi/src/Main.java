/*
Kullanıcıdan doğum yılını alarak Çin Zodyağı Burcunu hesaplayan program.
Çin Zodyağı Burçları:
Maymun, Horoz, Köpek, Domuz, Fare, Öküz, Tiger, Tavşan, Ejderha, Yılan, At, Koyun
Çin Zodyağı hesaplama formülü: yıl % 12
BY: ALİ OSMAN UYSAL -2024
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kullanıcıdan doğum yılını al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        // Çin Zodyağı hesapla
        String cinZodyagi = hesaplaCinZodyagi(dogumYili);

        // Sonucu ekrana yazdır
        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);
    }

    // Çin Zodyağı hesaplama fonksiyonu
    public static String hesaplaCinZodyagi(int yil) {
        // Doğum yılına göre Çin Zodyağı hesapla
        switch (yil % 12) {
            case 0: return "Maymun";
            case 1: return "Horoz";
            case 2: return "Köpek";
            case 3: return "Domuz";
            case 4: return "Fare";
            case 5: return "Öküz";
            case 6: return "Tiger";
            case 7: return "Tavşan";
            case 8: return "Ejderha";
            case 9: return "Yılan";
            case 10: return "At";
            case 11: return "Koyun";
            default: return "Geçersiz yıl"; // Bu durum hiç oluşmamalı.
        }
    }
}