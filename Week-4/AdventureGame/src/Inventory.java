public class Inventory {
    private boolean water;
    private boolean food;
    private boolean firewood;

    private int weaponDamage;
    private int armorDefence;

    public Inventory(boolean water, boolean food, boolean firewood, int weaponDamage, int armorDefence) {
        this.water = water;
        this.food = food;
        this.firewood = firewood;
        this.weaponDamage = weaponDamage;
        this.armorDefence = armorDefence;
    }

    public boolean getWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean getFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean getFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmorDefence() {
        return armorDefence;
    }

    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }
}