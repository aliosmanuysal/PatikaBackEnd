import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //  Değişkenleri oluştur
        int mat, muzik, kimya, turkce, tarih, fizik;

        // Scanner sınıfı tanımla
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan notları al
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        // Ortalamayı hesapla
        int toplam = (mat + muzik + kimya + turkce + tarih + fizik);
        double ortalama = toplam / 6.0;
        System.out.println("Ortalamanız:" + ortalama);

        // Ortalama 60'dan büyükse geçti, küçükse kaldı yazdır
        if (ortalama >= 60){
            System.out.println("Sınıfı Geçti");
        }
        else {
            System.out.println("Sınıfta Kaldı");
        }

    }
}