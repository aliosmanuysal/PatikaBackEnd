public class Main {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        int girilenSayi = 5;

        // Girilen sayıdan küçük en yakın sayıyı ve büyük en yakın sayıyı bulan fonksiyonu çağırma
        int kucukEnYakin = enKucukYakinSayi(dizi, girilenSayi);
        int buyukEnYakin = enBuyukYakinSayi(dizi, girilenSayi);

        // Sonuçları ekrana yazdırma
        System.out.println("Dizi: " + java.util.Arrays.toString(dizi));
        System.out.println("Girilen Sayı: " + girilenSayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + kucukEnYakin);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + buyukEnYakin);
    }

    // Girilen sayıdan küçük en yakın sayıyı bulan fonksiyon
    public static int enKucukYakinSayi(int[] dizi, int sayi) {
        int kucukYakin = Integer.MIN_VALUE;
        for (int eleman : dizi) {
            if (eleman < sayi && eleman > kucukYakin) {
                kucukYakin = eleman;
            }
        }
        return kucukYakin;
    }

    // Girilen sayıdan büyük en yakın sayıyı bulan fonksiyon
    public static int enBuyukYakinSayi(int[] dizi, int sayi) {
        int buyukYakin = Integer.MAX_VALUE;
        for (int eleman : dizi) {
            if (eleman > sayi && eleman < buyukYakin) {
                buyukYakin = eleman;
            }
        }
        return buyukYakin;
    }
}
