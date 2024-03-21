import java.util.Random;
import java.util.Scanner;

public abstract class BattleLoc extends Location {

    private Obstacle obstacle;
    private int enemyCount;
    private static Random random;
    private String award;

    public BattleLoc(Player player, String name, Obstacle obstacle, int enemyCount, String award) {
        super(player, name);
        this.obstacle = obstacle;
        this.enemyCount = enemyCount;
        random = new Random();
        this.award = award;
    }

    public BattleLoc(Player player, String name, Obstacle obstacle, int enemyCount) {
        super(player, name);
        this.obstacle = obstacle;
        this.enemyCount = enemyCount;
    }

    Scanner input = new Scanner(System.in);

    public boolean combat(int randomEnemy) {
        for (int i = 1; i <= randomEnemy; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrginalHealth());
            getPlayer().printInfoChar();
            printObstacleInfo();
            while (this.getPlayer().getHealthy() > 0 && getObstacle().getHealth() > 0) {
                System.out.print("<V>ur ya da <K>aç: ");
                String selectCombat = input.next();
                selectCombat = selectCombat.toUpperCase();
                if (selectCombat.equals("V")) {
                    whoHits(); // sadece ilk vurus degil her round randomize edildi.
                    //playerHit();
                    //obstacleHit();
                } else {
                    return false;
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealthy()) {
                killEnemy(i);
            } else {
                return false;
            }
            killAllEnemy(i, randomEnemy);

        }
        return true;
    }

    @Override
    boolean onLocation() {
        //int randomEnemy = random.nextInt(3) + 1;
        int randomEnemy = randomObstacleNumber();
        System.out.println(this.getName().toUpperCase() + " bölgesindesin.");
        System.out.println(randomEnemy + " tane " + this.getObstacle().getName() + " var.");
        System.out.print("<S>avaş ya da <K>aç: ");
        String select = input.next();
        select = select.toUpperCase();
        if (select.equals("S") && combat(randomEnemy)) {
            return true;
        }
        if (this.getPlayer().getHealthy() <= 0) {
            return false;
        }
        return true;
    }

    public int randomObstacleNumber(){
        return random.nextInt(this.getEnemyCount())+1;
    }

    public int getEnemyCount() {
        return enemyCount;
    }

    public void setEnemyCount(int enemyCount) {
        this.enemyCount = enemyCount;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        BattleLoc.random = random;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
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

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public void killEnemy(int enemyCount) {
        System.out.println(enemyCount + ". canavarı öldürdün.");
        System.out.println(this.getObstacle().getCoin() + " para aldın.");
        int check = this.getPlayer().getMoney() + getObstacle().getCoin();
        this.getPlayer().setMoney(check);
        System.out.println("Toplam paran: " + this.getPlayer().getMoney());
    }

    public void killAllEnemy(int deadEnemy, int enemyCount) {
        if (deadEnemy == enemyCount && this.getAward() != null) {
            System.out.println("Hepsini öldürdün " + this.getAward() + "  ödülünü kazandın tekrar buraya gelmene gerek yok.");
            if (this.getObstacle().getName().equals("Zombi")) this.getPlayer().getInventory().setFood(true);
            if (this.getObstacle().getName().equals("Vampir")) this.getPlayer().getInventory().setFirewood(true);
            if (this.getObstacle().getName().equals("Ayı")) this.getPlayer().getInventory().setWater(true);
        }
    }

    public void obstacleHit() {
        System.out.println(getObstacle().getName() + " vurdu.");
        int playerHealth = this.getPlayer().getHealthy() - this.getObstacle().getDamage();
        this.getPlayer().setHealthy(playerHealth);
        afterHit();
    }

    public void playerHit() {
        System.out.println("Vurdun!");
        int obstacleHealth = this.getObstacle().getHealth() - this.getPlayer().getDamage();
        this.getObstacle().setHealth(obstacleHealth);
        afterHit();
    }

    public void afterHit() {
        System.out.println("Canın: " + getPlayer().getHealthy());
        System.out.println(getObstacle().getName() + " Canı: " + getObstacle().getHealth());
        System.out.println();
    }

    public void whoHits() {
        int randomHit = random.nextInt(101);
        if (randomHit > 50) {
            System.out.println("İlk sen vurcaksın!");
            playerHit();
            obstacleHit();
        } else {
            System.out.println("İlk " + getObstacle().getName() + " vuracak!");
            obstacleHit();
            playerHit();
        }
    }

    public void printObstacleInfo() {
        System.out.println("---------- Düşman Değerleri ----------");
        System.out.println(this.getObstacle().getName());
        System.out.println("Can: " + this.getObstacle().getHealth());
        System.out.println("Hasar: " + this.getObstacle().getDamage());
    }

}