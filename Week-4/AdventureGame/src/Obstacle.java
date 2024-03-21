import java.util.Random;

public class Obstacle {
    private String name;
    private int health;
    private int damage;
    private int coin;
    private int obstaclenumber;
    private int orginalHealth;

    public Obstacle(String name, int health, int damage, int coin, int orginalHealth) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.coin = coin;
        this.orginalHealth = orginalHealth;
    }

    public int getOrginalHealth() {
        return orginalHealth;
    }

    public void setOrginalHealth(int orginalHealth) {
        this.orginalHealth = orginalHealth;
    }

    public int getObstaclenumber() {
        return obstaclenumber;
    }

    public void setObstaclenumber(int obstaclenumber) {
        this.obstaclenumber = obstaclenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCoin() {
        return coin;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }
}