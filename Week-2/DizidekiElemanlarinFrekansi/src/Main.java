import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        // Dizideki elemanların frekanslarını tutmak için bir HashMap kullanacağız
        HashMap<Integer, Integer> frekanslar = new HashMap<>();

        // Dizideki elemanların frekanslarını hesaplayalım
        for (int eleman : dizi) {
            if (frekanslar.containsKey(eleman)) {
                // Eğer eleman zaten HashMap'te varsa frekansını bir arttıralım
                frekanslar.put(eleman, frekanslar.get(eleman) + 1);
            } else {
                // Eğer eleman yoksa, yeni bir giriş olarak ekleyelim ve frekansını 1 yapalım
                frekanslar.put(eleman, 1);
            }
        }

        // Sonuçları ekrana yazdıralım
        for (int eleman : frekanslar.keySet()) {
            System.out.println(eleman + " sayısı " + frekanslar.get(eleman) + " kere tekrar edildi.");
        }
    }
}
