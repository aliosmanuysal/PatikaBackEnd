import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);

    private Player player;

    public void menu() {
        System.out.println("""
                ----------Haritalar----------
                1- Güvenli Ev (Canın dolar, sıcak bir çorba içersin)
                2- Dükkan (Daha iyi ekipmanlar alıp yoluna devam edebilirsin)
                3- Mağara (Rastgele(1-3) sayıda zombi ile karşılaşacaksın tabi ki ödülü de var!)
                4- Orman (Vampirlerin olduğu mekan)
                5- Nehir (Ayıların olduğu korkunç yer)
                6- Maden (Rastgele silah zırh ya da para kazanma ihtimalleri)
                0- Çıkış yap""");
    }

    public void start() {
        System.out.println("Oyuna Hos geldiniz!");
        Player player = new Player();
        player.selectChar();
        Location location = null;
        player.printInfoChar();

        while (true) {
            if (player.getInventory().getFood() && player.getInventory().getFirewood() && player.getInventory().getFirewood()) {
                location = new SafeHouse(player);
                location.onLocation();
            }
            menu();
            System.out.println("""
                    Nereye gitmek istersiniz!""");

            int selectLocation = input.nextInt();

            while (selectLocation < 0 || selectLocation > 6) {
                System.out.println("Yanlış işlem yaptınız tekrar deneyin!");
                selectLocation = input.nextInt();
            }

            if (selectLocation == 0) {
                location = null;
            } else if (selectLocation == 1) {
                location = new SafeHouse(player);
            } else if (selectLocation == 2) {
                location = new ToolStore(player);
            } else if (selectLocation == 3 && !player.getInventory().getFood()) {
                location = new Cave(player);
            } else if (selectLocation == 4 && !player.getInventory().getFirewood()) {
                location = new Forest(player);
            } else if (selectLocation == 5 && !player.getInventory().getWater()) {
                location = new River(player);
            } else if (selectLocation == 6) {
                location = new Mine(player);
            } else {
                System.out.println("Güvenli eve yönlendiriliyorsunuz !");
                location = new SafeHouse(player);
            }
            if (location == null) {
                System.out.println("Görüşmek üzere!");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("Öldün!");
                break;
            }
        }
    }
}