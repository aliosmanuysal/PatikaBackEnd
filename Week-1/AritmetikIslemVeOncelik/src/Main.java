import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan 3 sayı alınması
        System.out.print("Birinci sayıyı girin: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double b = scanner.nextDouble();

        System.out.print("Üçüncü sayıyı girin: ");
        double c = scanner.nextDouble();

        // İşlem sırasına göre hesaplama
        double sonuc = a + b * c - b;

        // Sonucu ekrana yazdırma
        System.out.println("Sonuç: " + sonuc);
    }
}