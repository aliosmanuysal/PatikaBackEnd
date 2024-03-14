public class Main {
    public static void main(String[] args) {
        // 'b' harfini oluşturmak için 2D bir dizi oluşturuyoruz
        String[][] harfB = new String[7][4];

        // Diziyi doldurmak için her satır ve sütun üzerinden döngüye giriyoruz
        for (int i = 0; i < harfB.length; i++) {
            for (int j = 0; j < harfB[i].length; j++) {
                // İlk sütun, son sütun veya ortadaki satırlarda '*' karakteri bırakıyoruz
                if (j == 0 || (i == 0 || i == 3 || i == 6 && j < 3) || (j == 3 && (i > 0 && i < 3)) || (j == 3 && (i > 3 && i < 6))) {
                    harfB[i][j] = " * ";
                } else {
                    // Diğer durumlarda boşluk bırakıyoruz
                    harfB[i][j] = "   ";
                }
            }
        }

        // Sonuç olarak oluşturulan harfi ekrana yazdırıyoruz
        for (String[] row : harfB) {
            for (String col : row) {
                System.out.print(col); // Her satırın elemanını yazdır
            }
            System.out.println(); // Her satırın sonunda bir alt satıra geç
        }
    }
}
