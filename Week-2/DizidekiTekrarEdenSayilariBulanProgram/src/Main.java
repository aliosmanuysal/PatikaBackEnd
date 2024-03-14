import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {2, 3, 4, 4, 5, 6, 6, 7, 8, 9, 10, 10, 11};
        tekrarEdenCiftleriBul(dizi);
    }

    public static void tekrarEdenCiftleriBul(int[] dizi) {
        HashMap<Integer, Integer> frekanslar = new HashMap<>();

        // Dizideki sayıların frekanslarını hesapla
        for (int num : dizi) {
            if (!frekanslar.containsKey(num)) {
                frekanslar.put(num, 1);
            } else {
                frekanslar.put(num, frekanslar.get(num) + 1);
            }
        }

        // Frekansı 2 olan sayıları yazdır
        System.out.println("Tekrar eden çift sayılar:");
        for (int num : frekanslar.keySet()) {
            if (frekanslar.get(num) > 1 && num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
