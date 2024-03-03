import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int oyuncuSaglik = 100;
        int rakipSaglik = 100;

        System.out.println("Basit Boks Oyununa Hoş Geldiniz!");

        while (oyuncuSaglik > 0 && rakipSaglik > 0) {
            System.out.println("Sıra sizde! Bir hamle seçin: ");
            System.out.println("1 - Sol yumruk");
            System.out.println("2 - Sağ yumruk");
            System.out.print("Seçiminizi yapın: ");

            int oyuncuHamle = scanner.nextInt();

            int rakipHamle = random.nextInt(2) + 1; // Rakip rastgele bir hamle seçer

            if (oyuncuHamle == 1) {
                System.out.println("Siz sol yumruk attınız!");
                rakipSaglik -= random.nextInt(10) + 1;
            } else if (oyuncuHamle == 2) {
                System.out.println("Siz sağ yumruk attınız!");
                rakipSaglik -= random.nextInt(15) + 1;
            } else {
                System.out.println("Geçersiz hamle! Tekrar deneyin.");
                continue;
            }

            if (rakipHamle == 1) {
                System.out.println("Rakip sol yumruk attı!");
                oyuncuSaglik -= random.nextInt(10) + 1;
            } else if (rakipHamle == 2) {
                System.out.println("Rakip sağ yumruk attı!");
                oyuncuSaglik -= random.nextInt(15) + 1;
            }

            System.out.println("Oyuncu Sağlık: " + oyuncuSaglik);
            System.out.println("Rakip Sağlık: " + rakipSaglik);
            System.out.println();
        }

        if (oyuncuSaglik <= 0) {
            System.out.println("Oyunu kaybettiniz. Rakip kazandı!");
        } else {
            System.out.println("Tebrikler! Oyunu kazandınız. Rakip mağlup oldu!");
        }
    }
}
