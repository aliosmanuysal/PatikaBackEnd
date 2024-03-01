import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Veritabanını temsil eden basit bir dizi
        String[][] veritabani = {
                {"Ali Can", "12345678901"},
                {"Ayşe Yılmaz", "98765432102"},
                {"Mehmet Demir", "45678901203"}
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("İsim Soyisim: ");
            String isimSoyisim = scanner.nextLine().toLowerCase(); // Büyük-küçük harf duyarlılığını gider

            if (isimSoyisim.equalsIgnoreCase("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            System.out.print("TC Kimlik Numarasının son 3 rakamı: ");
            String girilenSon3Rakam = scanner.nextLine();

            boolean isimSoyisimBulundu = false;
            for (String[] kayit : veritabani) {
                if (kayit[0].toLowerCase().equals(isimSoyisim)) {
                    isimSoyisimBulundu = true;

                    String tcKimlikNo = kayit[1];
                    String beklenenSon3Rakam = tcKimlikNo.substring(8);

                    if (girilenSon3Rakam.equals(beklenenSon3Rakam)) {
                        System.out.println("Correct");
                    } else {
                        System.out.println("Hata: TC Kimlik No yanlış girildi.");
                    }

                    break; // İsim soyisim bulunduğunda döngüden çık
                }
            }

            if (!isimSoyisimBulundu) {
                System.out.println("Hata: İsim soyisim bulunamadı.");
            }
        }

        scanner.close();
    }
}
