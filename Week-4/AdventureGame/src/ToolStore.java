import java.util.Scanner;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Dükkan");
    }

    Scanner input = new Scanner(System.in);


    @Override
    public boolean onLocation() {
        boolean menu = true;
        while (menu) {
            System.out.println("""
                    Dükkana hoş geldiniz!
                    1- Tüfek satın al
                    2- Zırh satın al
                    3- Çıkış yap""");
            int select = input.nextInt();
            if (select == 1) {
                buyWeapon();
                getPlayer().printInfoChar();
            } else if (select == 2) {
                buyArmor();
                getPlayer().printInfoChar();
            } else if (select == 3) {
                menu = false;
            } else {
                System.out.println("Yanlış işlem girdiniz");
            }
        }
        return true;
    }

    public void buyWeapon() {
        System.out.println("""
                1- Tabanca ----> +4  hasar verir fiyatı 25
                2- Kılıç   ----> +8  hasar verir fiyatı 35
                3- Tüfek   ----> +12 hasar verir fiyatı 45
                   Paranız:\040""" + getPlayer().getMoney());
        int select = input.nextInt();
        if (select == 1) {
            int tabanca = 25;
            if (getPlayer().getMoney() >= tabanca) {
                getPlayer().getInventory().setWeaponDamage(4);
                System.out.println("Tabanca aldınız!");
                System.out.println("Hasar " + getPlayer().getDamage() + " oldu.");
                getPlayer().setMoney(getPlayer().getMoney() - tabanca);
            } else {
                System.out.println("Paranız yetersiz!");
                System.out.println("Paranız: " + getPlayer().getMoney());
            }
        } else if (select == 2) {
            int kilic = 35;
            if (getPlayer().getMoney() >= kilic) {
                getPlayer().getInventory().setWeaponDamage(8);
                System.out.println("Kılıç aldınız!");
                System.out.println("Hasar " + getPlayer().getDamage() + " oldu.");
                getPlayer().setMoney(getPlayer().getMoney() - kilic);
            } else {
                System.out.println("Paranız yetersiz!");
                System.out.println("Paranız: " + getPlayer().getMoney());
            }
        } else if (select == 3) {
            int tufek = 45;
            if (getPlayer().getMoney() >= tufek) {
                getPlayer().getInventory().setWeaponDamage(12);
                System.out.println("Tüfek aldınız!");
                System.out.println("Hasar " + getPlayer().getDamage() + " oldu.");
                getPlayer().setMoney(getPlayer().getMoney() - tufek);
            } else {
                System.out.println("Paranız yetersiz!");
                System.out.println("Paranız: " + getPlayer().getMoney());
            }
        } else {
            System.out.println("Yanlis işlem girdiniz!");
        }
    }

    public void buyArmor() {
        System.out.println("""
                1- Hafif ----> +3 can verir fiyatı 15
                2- Orta  ----> +6 can verir fiyatı 25
                3- Ağır  ----> +9 can verir fiyatı 40
                   Paranız:\040""" + getPlayer().getMoney());
        int select = input.nextInt();
        if (select == 1) {
            int hafif = 15;
            if (getPlayer().getMoney() >= hafif) {
                getPlayer().getInventory().setArmorDefence(3);
                System.out.println("Hafif zırh aldınız!");
                System.out.println("Can " + getPlayer().getHealthy() + " oldu.");
                getPlayer().setMoney(getPlayer().getMoney() - hafif);
            } else {
                System.out.println("Paranız yetersiz!");
                System.out.println("Paranız: " + getPlayer().getMoney());
            }
        } else if (select == 2) {
            int orta = 25;
            if (getPlayer().getMoney() >= orta) {
                getPlayer().getInventory().setArmorDefence(6);
                System.out.println("Orta zırh aldınız!");
                System.out.println("Can " + getPlayer().getHealthy() + " oldu.");
                getPlayer().setMoney(getPlayer().getMoney() - orta);
            } else {
                System.out.println("Paranız yetersiz!");
                System.out.println("Paranız: " + getPlayer().getMoney());
            }
        } else if (select == 3) {
            int agir = 40;
            if (getPlayer().getMoney() >= agir) {
                getPlayer().getInventory().setArmorDefence(9);
                System.out.println("Ağır zırh aldınız!");
                System.out.println("Can: " + getPlayer().getHealthy() + " oldu.");
                getPlayer().setMoney(getPlayer().getMoney() - agir);
            } else {
                System.out.println("Paranız yetersiz!");
                System.out.println("Paranız: " + getPlayer().getMoney());
            }
        } else {
            System.out.println("Yanlış işlem girdiniz!");
        }
    }

    @Override
    public Player getPlayer() {
        return super.getPlayer();
    }

    @Override
    public void setPlayer(Player player) {
        super.setPlayer(player);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}