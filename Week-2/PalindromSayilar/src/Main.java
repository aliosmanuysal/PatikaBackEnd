import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Kullanıcıdan bir sayı girişi istenir.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Girilen sayı tempSayi değişkenine atanır.
        int tempSayi = sayi;

        // tersSayi değişkeni 0'a atanır.
        int tersSayi = 0;

        // tempSayi 0'dan büyük olduğu sürece aşağıdaki işlemler gerçekleştirilir.
        while (tempSayi > 0) {
            // tersSayi 10 ile çarpılır.
            tersSayi *= 10;

            // tempSayi 10'a bölünür ve kalan tersSayi'ye eklenir.
            tersSayi += tempSayi % 10;
            tempSayi /= 10;
        }

        // sayi ve tersSayi karşılaştırılır.
        if (sayi == tersSayi) {
            // Eşitse, sayi palindromdur ve "palindrom bir sayıdır" mesajı yazdırılır.
            System.out.println(sayi + " palindrom bir sayıdır.");
        } else {
            // Eşit değilse, sayi palindrom değildir ve "palindrom bir sayı değildir" mesajı yazdırılır.
            System.out.println(sayi + " palindrom bir sayı değildir.");
        }
    }
}
