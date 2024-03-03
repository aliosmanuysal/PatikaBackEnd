import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrisin satır sayısını girin: ");
        int satir = scanner.nextInt();

        System.out.print("Matrisin sütun sayısını girin: ");
        int sutun = scanner.nextInt();

        int[][] matris = new int[satir][sutun];

        System.out.println("Matrisin elemanlarını girin:");

        // Matrisin elemanlarını kullanıcıdan alın
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + (i + 1) + "][" + (j + 1) + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        // Matris transpozunu bulma
        int[][] transpozeMatris = new int[sutun][satir];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpozeMatris[j][i] = matris[i][j];
            }
        }

        // Matris transpozunu ekrana yazdırma
        System.out.println("Matris Transpozu:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpozeMatris[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
