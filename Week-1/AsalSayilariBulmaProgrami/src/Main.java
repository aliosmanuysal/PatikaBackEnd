/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran program.
BY: ALİ OSMAN UYSAL - 2024
 */

public class Main {

    public static void main(String[] args) {
        int baslangic = 1;
        int bitis = 100;

        System.out.println(baslangic + " ile " + bitis + " arasındaki asal sayılar:");
        asalSayilariBulVeYazdir(baslangic, bitis);
    }

    // Verilen aralıktaki asal sayıları bulan ve ekrana yazdıran fonksiyon
    static void asalSayilariBulVeYazdir(int baslangic, int bitis) {
        for (int i = baslangic; i <= bitis; i++) {
            if (asalMi(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Bir sayının asal olup olmadığını kontrol eden fonksiyon
    static boolean asalMi(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}