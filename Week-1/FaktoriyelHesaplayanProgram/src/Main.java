import java.util.Scanner;

public class Main {

    // Faktöriyel hesaplayan fonksiyon
    static long faktoriyel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktoriyel(n - 1);
        }
    }

    // Kombinasyon hesaplayan fonksiyon
    static long kombinasyon(int n, int r) {
        return faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n'i girin: ");
        int n = scanner.nextInt();

        System.out.print("r'i girin: ");
        int r = scanner.nextInt();

        // n ve r değerlerini kullanarak kombinasyon hesapla
        long sonuc = kombinasyon(n, r);

        // Sonucu ekrana yazdır
        System.out.println("C(" + n + "," + r + ") = " + sonuc);
    }
}
