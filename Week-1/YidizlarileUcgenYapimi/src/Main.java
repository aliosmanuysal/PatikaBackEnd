import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasın yüksekliğini girin: ");
        int yukseklik = scanner.nextInt();

        // Üst kısmı oluştur
        for (int i = 1; i <= yukseklik; i++) {
            for (int j = 1; j <= yukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısmı oluştur
        for (int i = yukseklik - 1; i >= 1; i--) {
            for (int j = 1; j <= yukseklik - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
