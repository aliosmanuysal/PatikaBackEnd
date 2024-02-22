/**
 * Kullanıcıdan alınan dik kenar uzunlukları ile üçgenin hipotenüsünü ve alanını hesaplayan program.
 * Bu programda Math sınıfının pow ve sqrt metotları kullanılmıştır.
 * Bu metotlar üs alma ve karekök alma işlemlerini gerçekleştirir.
 * BY: ALİ OSMAN UYSAL
 * 02.2024
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dik kenar uzunluklarını al
        System.out.print("Dik kenarın uzunluğunu giriniz (a): ");
        double a = scanner.nextDouble();

        // Kullanıcıdan diğer dik kenar uzunluğunu al
        System.out.print("Diğer dik kenarın uzunluğunu giriniz (b): ");
        double b = scanner.nextDouble();

        // Hipotenüsü hesapla
        double hipotenus = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hipotenüs: " + hipotenus);

        // Üç kenar uzunluğunu kullanarak üçgenin alanını hesapla
        double u = (a + b + hipotenus) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - hipotenus));

        System.out.println("Üçgenin Alanı: " + alan);

        // Scanner'ı kapat
        scanner.close();
    }
}