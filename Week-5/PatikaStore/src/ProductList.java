import java.util.ArrayList;
import java.util.List;

public class ProductList {

    // creating new list (brand,phone,notebook)
    private List<Brand> brands;
    private List<Phone> phones;
    private List<NoteBook> noteBooks;


    // identifying brands
    public ProductList() {
        this.brands = new ArrayList<>();
        this.phones = new ArrayList<>();
        this.noteBooks = new ArrayList<>();

        //Add Brands
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));
    }
    // add new phone features info and check instanceof phone class
    public void addPhoneProduct(Phone phone) {
        if (phone instanceof Phone) {
            for (Brand brand : brands) {
                if (phone.getBrand().getName().equals(brand.getName())) {
                    phones.add(phone);
                }
            }
        }
    }

    //add new pc features info and check instanceof notebook class
    public void addNoteBookProduct(NoteBook noteBook) {
        if (noteBook instanceof NoteBook) {
            for (Brand brand : brands) {
                if (noteBook.getBrand().getName().equals(brand.getName())) {
                    noteBooks.add(noteBook);
                }
            }
        }
    }

    // remove product phone or notebook
    public void removeProduct(int id) {
        phones.removeIf(phone -> phone.getId() == id);
        noteBooks.removeIf(noteBook -> noteBook.getId() == id);
    }

    // write the product list

    public void goListProduct() {
        System.out.println("Notebook Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (NoteBook noteBook : noteBooks) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-11d |\n", noteBook.getId(), noteBook.getName(),
                    noteBook.getUnitPrice(), noteBook.getBrand().getName(),
                    noteBook.getMemorySize(), noteBook.getScreenSize(), noteBook.getRam());
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("\nCep Telefonu Listesi");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      |");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (Phone phone : phones) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-10d | %-6.1f | %-9d | %-9.1f | %-9d | %-9s |\n", phone.getId(), phone.getName(),
                    phone.getUnitPrice(), phone.getBrand().getName(), phone.getMemorySize(),
                    phone.getScreenSize(), phone.getBatteryPower(), phone.getRam(), phone.getColor());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }

    //write product brand list
    public void brandList() {
        System.out.println("| ID | Marka Adı  |");
        for (Brand brand : brands) {
            System.out.format("| %-1d  | %-1s    |\n", brand.getId(), brand.getName());
        }
    }

    public Brand getBrandById(int id) {
        for (Brand brand : brands) {
            if (brand.getId() == id) {
                return brand;
            }
        }
        return null;
    }
}