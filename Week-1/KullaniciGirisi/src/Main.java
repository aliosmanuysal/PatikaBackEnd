/*
Kullanıcı Girişi
Java koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden bir program.
Author: @aliosmanuysal
2024
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Kullanıcı adı ve şifre değişkenleri
       String userName, password;

         // Kullanıcıdan veri almak için Scanner sınıfından bir nesne oluşturuyoruz.
         Scanner input = new Scanner(System.in);

            // Kullanıcıdan veri alıyoruz.
            System.out.print("Kullanıcı adınız : ");
            userName = input.nextLine();

            System.out.print("Şifreniz : ");
            password = input.nextLine();

            // Kullanıcı adı ve şifre kontrolü
            if(userName.equals("patika") && password.equals("java123")){
                System.out.println("Giriş yaptınız!");
            }else{  // Kullanıcı adı veya şifre hatalı ise
                System.out.println("Kullanıcı adı veya şifre hatalı!");
            }
    }
}