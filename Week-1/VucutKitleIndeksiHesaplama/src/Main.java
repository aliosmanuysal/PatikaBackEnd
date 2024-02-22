/**
 * Vücut Kitle İndeksi Hesaplama
 * Ali Osman Uysal
 * 22.04.2021
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan boy ve kilosunu al
        System.out.print("Boyunuzu (metre cinsinden) giriniz: ");
        double boy = scanner.nextDouble();

        System.out.print("Kilonuzu (kg cinsinden) giriniz: ");
        double kilo = scanner.nextDouble();

        // Vücut kitle indeksini hesapla
        double vki = kilo / (boy * boy);

        // VKI'yi 2 basamaklı ondalık sayı olarak biçimlendir
        String vkiStr;
        vkiStr = String.format("%.2f", vki);

        // VKI'yi yazdır
        System.out.println("Vücut Kitle İndeksiniz: " + vkiStr);

        // VKI'ya göre uyarı mesajı ver
        if (vki < 18.5) {
            System.out.println("Zayıfsınız. Sağlıklı bir kiloya ulaşmak için doktorunuza danışabilirsiniz.");
        } else if (vki >= 18.5 && vki < 25) {
            System.out.println("Sağlıklı bir kilodasınız. Bu kiloyu korumaya özen gösterin.");
        } else if (vki >= 25 && vki < 30) {
            System.out.println("Fazla kilolusunuz. Kilo vermek için doktorunuza danışabilirsiniz.");
        } else if (vki >= 30) {
            System.out.println("Obezsiniz. Kilo vermek için acilen doktorunuza danışmanız önemlidir.");
        }
    }
}

