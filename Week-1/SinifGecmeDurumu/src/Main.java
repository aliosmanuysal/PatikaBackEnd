/*
    Kullanıcıdan alınan 5 farklı ders notunun ortalamasını hesaplayan ve
    ortalamaya göre sınıfı geçip geçmediğini ekrana yazdıran program.
    Author: Ali Osman Uysal
    2024
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenleri tanımla
        int mat, fizik, kimya, turkce, muzik;

        // Scanner sınıfı ile kullanıcıdan veri almak için nesne oluştur.
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan alınan verileri değişkenlere ata.
        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        // Ortalama hesapla
        double avarage = (mat + fizik + kimya + turkce  + muzik) / 5;
        if (avarage <= 55) {
            System.out.println("Sınıfta Kaldınız seneye tekrar görüşmek üzere!");
        } else {
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }

        // Ortalamayı ekrana yazdır.
        System.out.println("Ortalamanız : " + avarage);
    }
}