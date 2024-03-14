import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Sıralama: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
