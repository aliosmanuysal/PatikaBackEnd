/*
    Kullanıcıdan alınan yılın artık yıl olup olmadığını kontrol eden program.
    Artık yıl, 4 ile bölünebilen yılların 100 ile bölünememesi veya 400 ile bölünebilmesi durumudur.
    BY: ALİ OSMAN UYSAL - 2024
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Kullanıcıdan yıl al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int yil = scanner.nextInt();

        // Artık yıl kontrolü
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir artık yıldır!");
        } else {
            System.out.println(yil + " bir artık yıl değildir!");
        }

        // Scanner kapat
        scanner.close();
    }
}
