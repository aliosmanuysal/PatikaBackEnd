/*
    Kullanıcıdan alınan iki sayının EBOB ve EKOK'unu bulan program
    EBOB: İki ya da daha fazla sayının ortak bölenlerinin en büyüğü
    EKOK: İki ya da daha fazla sayının ortak katlarının en küçüğü
    Author: Ali Osman UYSAL
    2024
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = findEBOB(sayi1, sayi2);
        int ekok = findEKOK(sayi1, sayi2, ebob);

        System.out.println("Girilen sayıların EBOB'u: " + ebob);
        System.out.println("Girilen sayıların EKOK'u: " + ekok);

        scanner.close();
    }

    // EBOB'u hesaplayan metod
    private static int findEBOB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // EKOK'u hesaplayan metod
    private static int findEKOK(int a, int b, int ebob) {
        return (a * b) / ebob;
    }
}
