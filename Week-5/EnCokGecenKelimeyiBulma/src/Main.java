import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metni girin: ");
        String metin = scanner.nextLine();
        scanner.close();

        // Metni kelimelere ayırma
        String[] kelimeler = metin.split("\\s+");

        // Kelimeleri saklamak için bir HashMap oluşturma
        Map<String, Integer> kelimeSayilari = new HashMap<>();

        // Her kelimenin sayısını sayma
        for (String kelime : kelimeler) {
            // Küçük/büyük harf duyarlılığını kaldırmak için küçük harfe çevirme
            kelime = kelime.toLowerCase();
            // Kelime zaten HashMap'te varsa sayısını bir artır, yoksa 1 olarak ata
            kelimeSayilari.put(kelime, kelimeSayilari.getOrDefault(kelime, 0) + 1);
        }

        // En çok geçen kelimeyi bulma
        int maxSayi = 0;
        String enCokGecenKelime = "";
        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {
            if (entry.getValue() > maxSayi) {
                maxSayi = entry.getValue();
                enCokGecenKelime = entry.getKey();
            }
        }

        // Sonucu ekrana yazdırma
        System.out.println("En çok geçen kelime: " + enCokGecenKelime + " (" + maxSayi + " kez)");
    }
}
