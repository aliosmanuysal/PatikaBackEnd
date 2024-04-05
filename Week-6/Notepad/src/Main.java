import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan metin girişi al
        System.out.print("Metin girin: ");
        String metin = scanner.nextLine();

        // Metni dosyaya yaz
        dosyayaYaz("notlar.txt", metin);

        // En son kaydedilen metni ekrana yazdır
        String enSonMetin = dosyadanOku("notlar.txt");
        System.out.println("En son kaydedilen metin: " + enSonMetin);
    }

    // Dosyaya metin yazan metod
    public static void dosyayaYaz(String dosyaAdi, String metin) {
        try {
            FileWriter fileWriter = new FileWriter(dosyaAdi);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(metin);
            printWriter.close();
            System.out.println("Dosyaya yazıldı.");
        } catch (IOException e) {
            System.out.println("Dosyaya yazılırken hata oluştu: " + e.getMessage());
        }
    }

    // Dosyadan metin okuyan metod
    public static String dosyadanOku(String dosyaAdi) {
        String okunanMetin = "";
        try {
            FileReader fileReader = new FileReader(dosyaAdi);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            okunanMetin = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Dosya okunurken hata oluştu: " + e.getMessage());
        }
        return okunanMetin;
    }
}
