public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {

        if (getPlayer().getInventory().getFood() && getPlayer().getInventory().getWater() && getPlayer().getInventory().getFirewood()) {
            System.out.println("--------------------");
            System.out.println("Tebrikler oyunu kazandınız!");
            System.exit(0);
        } else {
            System.out.println("\nGüvenli eve geldin. Burada yaralar sarılır ve iyileşirsin.");
            this.getPlayer().setHealthy(this.getPlayer().getOrginalHealth());
            System.out.println("Can: " + getPlayer().getHealthy());
        }
        return true;
    }

}