import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Kullanıcıdan n değerini al
        Scanner scanner = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n = scanner.nextInt();

        // n değerine göre rekursif metodu çalıştır
        farkliYazdir(n);
    }
    private static void farkliYazdir(int sayi) {
        // Eğer sayi 0 veya negatif ise
        if (sayi <= 0) {
            // Sayiyi yazdır
            System.out.println(sayi);
            // Sayiya 5 ekle
            sayi += 5;
        }
        // Eğer sayi 0'dan büyükse
        if (sayi > 0) {
            // Sayiyi yazdır
            System.out.println(sayi);
            // Kendini sayi-5 ile tekrar çağır
            farkliYazdir(sayi - 5);
        }
    }
}
