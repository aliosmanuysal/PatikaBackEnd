public abstract class Product {
    private int counterID = 1;
    private int id;
    private String name;
    private Brand brand;
    private double unitPrice;
    private double discountPrice;
    private int stock;
    private int memorySize;
    private double screenSize;
    private int ram;

    public Product(String name, Brand brand,
                   double unitPrice, double discountPrice,
                   int stock, int memorySize, double screenSize, int ram) {

        this.id = counterID++;
        this.name = name;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.discountPrice = discountPrice;
        this.stock = stock;
        this.memorySize = memorySize;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public Product(String name, Brand brand, double unitPrice, double discountPrice, int stock, int memorySize, double screenSize, double camera, int ram) {
    }

    public int getCounterID() {
        return counterID;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public int getStock() {
        return stock;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getRam() {
        return ram;
    }

}