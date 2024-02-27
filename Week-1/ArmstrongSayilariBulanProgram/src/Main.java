import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alınır.
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Armstrong sayısı kontrolü yapılır ve sonuç ekrana yazdırılır.
        if (armstrongSayiMi(sayi)) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }
    }

    // Bir sayının Armstrong sayısı olup olmadığını kontrol eden fonksiyon.
    static boolean armstrongSayiMi(int sayi) {
        int toplam = 0;
        int geciciSayi = sayi;
        int basamakSayisi = basamakSayisiBul(sayi);

        // Her basamağın üssü alınarak toplam hesaplanır.
        while (geciciSayi != 0) {
            int rakam = geciciSayi % 10;
            toplam += Math.pow(rakam, basamakSayisi);
            geciciSayi /= 10;
        }

        // Toplam, girdiğimiz sayıya eşitse true döndürülür, aksi halde false.
        return toplam == sayi;
    }

    // Bir sayının basamak sayısını bulan fonksiyon.
    static int basamakSayisiBul(int sayi) {
        int basamakSayisi = 0;
        while (sayi != 0) {
            sayi /= 10;
            basamakSayisi++;
        }
        return basamakSayisi;
    }
}
