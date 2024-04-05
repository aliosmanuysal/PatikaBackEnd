import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String dosyaYolu = "src/dosya.txt"; // Okunacak dosyanın yolu
        int toplam = 0; // Toplamı tutmak için değişken

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir; // Dosyadan okunan satırı tutmak için değişken
            while ((satir = br.readLine()) != null) {
                int sayi = Integer.parseInt(satir); // Satırı tam sayıya dönüştürme
                toplam += sayi; // Toplama ekleme
            }
            System.out.println("Dosyadaki sayıların toplamı: " + toplam); // Toplamı ekrana yazdırma
        } catch (IOException e) {
            System.err.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}
