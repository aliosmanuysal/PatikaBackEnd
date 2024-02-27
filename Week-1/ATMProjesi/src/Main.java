/*
ATM Uygulaması
Author: Ali Osman Uysal
2024
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Merhaba, XXX Bankasına Hoşgeldiniz!");

        // Kullanıcıdan kullanıcı adı ve şifre bilgilerini alır
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        // Kullanıcıya üç hakkı olduğu sürece döngü devam eder
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            // Kullanıcı adı ve şifre doğruysa içeri girer
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    // Kullanıcıya sunulan işlem seçenekleri
                    System.out.println("1-Para yatırma\n" + "3-Bakiye Sorgula\n" + "2-Para Çekme\n" + "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    // Switch-Case yapısı ile kullanıcının seçimine göre işlemler yapılır
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            int depositAmount = input.nextInt();
                            balance += depositAmount;
                            break;
                        case 2:
                            System.out.print("Para miktarı : ");
                            int withdrawAmount = input.nextInt();
                            if (withdrawAmount > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= withdrawAmount;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                        default:
                            System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyiniz.");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

                // Hesap kilitlenirse veya hakkı biterse bilgilendirme yapılır
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
