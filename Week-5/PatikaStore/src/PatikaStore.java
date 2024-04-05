
import java.util.Scanner;

public class PatikaStore {

    public void run() {
        ProductList productList = new ProductList();
        Scanner input = new Scanner(System.in);

        // menu
        while (true) {
            System.out.println("1. Ürün Ekle");
            System.out.println("2. Ürünleri Listele");
            System.out.println("3. Ürün Sil");
            System.out.println("4. Marka Listele");
            System.out.println("5. Çıkış");
            System.out.print("Seçiminiz: ");
            int choice = input.nextInt();
            input.nextLine();
            switch (choice) {

                // add product case

                case 1:
                    System.out.print("Cep telefonu -> 1\nNotebook -> 2\nSeçiminiz : ");
                    int select = input.nextInt();
                    System.out.print("Ürün adı giriniz : ");
                    String productName = input.next();
                    System.out.print("Ürün adet fiyatını giriniz : ");
                    double unitPrice = input.nextDouble();
                    System.out.print("Stok adetini giriniz : ");
                    int stock = input.nextInt();
                    System.out.print("Marka ID'si giriniz : ");
                    int brandID = input.nextInt();
                    System.out.print("İndirim oranını giriniz : ");
                    double discount = input.nextInt();
                    System.out.print("Hafıza boyutunu giriniz : ");
                    int memorySize = input.nextInt();
                    System.out.print("Ekran boyutunu giriniz : ");
                    double screenSize = input.nextDouble();
                    System.out.print("Ram bellek boyutunu giriniz : ");
                    int ram = input.nextInt();

                    Brand brand = productList.getBrandById(brandID);
                    if (brand != null) {
                        if (select == 1) {
                            System.out.print("Pil gücünü giriniz : ");
                            int batterySize = input.nextInt();
                            System.out.print("Renk bilgisini giriniz : ");
                            String color = input.next();
                            Phone phone = new Phone(productName, brand, unitPrice, discount, stock, memorySize, screenSize, ram, batterySize, color );
                            productList.addPhoneProduct(phone);
                        }else {
                            NoteBook notebook = new NoteBook(productName,brand,unitPrice,discount,stock,memorySize,screenSize,ram);
                            productList.addNoteBookProduct(notebook);
                        }
                        System.out.println("Ürün başarıyla eklendi .");
                    }else {
                        System.out.println("Geçersiz marka ID girdiniz .");
                    }
                    break;


                // listing products
                case 2:
                    productList.goListProduct();
                    break;

                //removing product
                case 3 :
                    productList.brandList();
                    System.out.println("Silmek istediğiniz ürünün ID kodunu giriniz :");
                    int removeID  =input.nextInt();
                    productList.removeProduct(removeID);
                    System.out.println("Ürün başarıyla silindi .");
                    break;

                //listing Brands
                case 4 :
                    productList.brandList();
                    break;


                case 5:
                    System.out.println("Güvenli çıkış yapılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Geçersiz bir seçim yaptınız.");
            }
        }
    }
}