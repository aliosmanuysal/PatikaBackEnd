public class Phone extends Product{
    private int batteryPower;
    private String color;

    // phone features constructor
    public Phone(String name, Brand brand, double unitPrice, double discountPrice, int stock, int memorySize, double screenSize, int ram, int batteryPower, String color) {
        super(name, brand, unitPrice, discountPrice, stock, memorySize, screenSize, ram);
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public String getColor() {
        return color;
    }
}