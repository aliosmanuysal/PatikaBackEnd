import java.util.Random;

public class Mine extends BattleLoc {

    public Mine(Player player) {
        super(player, "Maden", new Snake(), 5);

    }

    @Override
    boolean onLocation() {
        return super.onLocation();
    }

    @Override
    public void killEnemy(int enemyCount) {
        System.out.println(enemyCount + ". canavarı öldürdün!");
        int randomItem = getRandom().nextInt(100);

        if (randomItem < 15) {
            randomItem = getRandom().nextInt(100);
            winWeapon(randomItem);
        } else if (randomItem < 30) {
            randomItem = getRandom().nextInt(100);
            winArmor(randomItem);
        } else if (randomItem < 55) {
            randomItem = getRandom().nextInt(100);
            winMoney(randomItem);
        } else {
            System.out.println("Hiç bir şey kazanamadınız!");
        }

    }

    public void winMoney(int randomNumber) {
        if (randomNumber < 20) {
            getPlayer().setMoney(getPlayer().getMoney() + 10);
            System.out.println("Paranız: " + getPlayer().getMoney() + " 10 birim kazandınız.");
        } else if (randomNumber < 50) {
            getPlayer().setMoney(getPlayer().getMoney() + 5);
            System.out.println("Paranız: " + getPlayer().getMoney() + " 5 birim kazandınız.");
        } else {
            getPlayer().setMoney(getPlayer().getMoney() + 1);
            System.out.println("Paranız: " + getPlayer().getMoney() + " 1 birim kazandını.");
        }
    }


    public void winWeapon(int randomNumber) {
        if (randomNumber < 20) {
            getPlayer().getInventory().setWeaponDamage(12);
            System.out.println("Şansınıza Tüfek çıktı yeni değerleriniz: " + getPlayer().getInventory().getWeaponDamage());
        } else if (randomNumber < 30) {
            getPlayer().getInventory().setWeaponDamage(8);
            System.out.println("Şansınıza Kılıç çıktı yeni değerleriniz: " + getPlayer().getInventory().getWeaponDamage());
        } else {
            getPlayer().getInventory().setWeaponDamage(4);
            System.out.println("Şansınıza Tabanca çıktı yeni değerleriniz: " + getPlayer().getInventory().getWeaponDamage());
        }
    }

    public void winArmor(int randomNumber) {
        if (randomNumber < 20) {
            getPlayer().getInventory().setArmorDefence(9);
            System.out.println("Şansınıza Ağır zırh çıktı yeni değerleriniz: " + getPlayer().getInventory().getArmorDefence());
        } else if (randomNumber < 50) {
            getPlayer().getInventory().setArmorDefence(3);
            System.out.println("Şansınıza Hafif zırh çıktı yeni değerleriniz: " + getPlayer().getInventory().getArmorDefence());
        } else {
            getPlayer().getInventory().setArmorDefence(6);
            System.out.println("Şansınıza Orta zırh çıktı yeni değerleriniz: " + getPlayer().getInventory().getArmorDefence());
        }
    }

}