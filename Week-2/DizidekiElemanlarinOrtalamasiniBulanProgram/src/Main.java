import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizi boyutunu girin
        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        // Diziyi oluşturun ve elemanları girin
        int[] dizi = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.print(i + 1 + ". elemanı giriniz: ");
            dizi[i] = scanner.nextInt();
        }

        // Harmonik ortalamayı hesaplayın
        double harmonikOrtalama = 0.0;
        for (int sayi : dizi) {
            harmonikOrtalama += 1.0 / sayi;
        }
        harmonikOrtalama *= boyut;

        // Sonucu yazdırın
        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);
    }
}
