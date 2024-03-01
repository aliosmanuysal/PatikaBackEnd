import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi)) {
            System.out.println(sayi + " sayısı ASALDIR!");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir!");
        }

        scanner.close();
    }

    // Recursive olarak asal sayı kontrolü
    private static boolean isAsal(int sayi, int bolen) {
        if (sayi <= 1) {
            return false;
        }
        if (bolen == 1) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return isAsal(sayi, bolen - 1);
    }

    // Başlangıç için asal sayı kontrolü
    private static boolean isAsal(int sayi) {
        return isAsal(sayi, sayi / 2);
    }
}
