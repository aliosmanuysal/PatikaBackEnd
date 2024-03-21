import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private int damage;
    private int healthy;
    private int orginalHealth;
    private int money;
    private String name;

    public void printInfoChar() {
        System.out.println("----------Karakter statüleri----------");
        System.out.println("Ad: " + getName());
        System.out.println("Hasar: " + getDamage());
        System.out.println("Can: " + getHealthy());
        System.out.println("Para: " + getMoney());
    }

    public void selectChar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Karakterinizin ismini giriniz: ");
        name = input.next();

        System.out.println("Lütfen karakter seçiniz: ");
        System.out.println("""
                1- Samuray
                2- Okçu
                3- Şövalye
                """);
        int charSelect = input.nextInt();
        if (charSelect == 1) {
            inventory = new Inventory(false, false, false, 0, 0);
            damage = 5;
            healthy = 21;
            orginalHealth = 21;
            money = 15;
        } else if (charSelect == 2) {
            inventory = new Inventory(false, false, false, 0, 0);
            damage = 7;
            healthy = 18;
            orginalHealth = 18;
            money = 20;
        } else if (charSelect == 3) {
            inventory = new Inventory(false, false, false, 0, 0);
            damage = 8;
            healthy = 24;
            orginalHealth = 24;
            money = 5;
        } else {
            System.out.println("Yanlis islem girdiniz!");
        }
    }

    public Inventory getInventory() {
        return inventory;
    }

    public int getDamage() {
        return damage + inventory.getWeaponDamage();
    }

    public int getHealthy() {
        return healthy + inventory.getArmorDefence();
    }

    public void setHealthy(int healthy) {
        if (healthy < 0) {
            healthy = 0;
        }
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getOrginalHealth() {
        return orginalHealth;
    }

}