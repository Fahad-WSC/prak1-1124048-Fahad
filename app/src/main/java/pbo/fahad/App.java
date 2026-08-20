package pbo.fahad;

import java.util.Scanner;

class Menu {
    String name;
    double price;
    String category;
    static int totalMenu;

    public Menu(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        totalMenu++;
    }

    public void showMenu() {
        System.out.println("===============CAFE MENU===============");
        System.out.println("Nama menu: " + name);
        System.out.println("Harga menu: " + price);
        System.out.println("Kategori: " + category);
    }

    public double discount(double percentage) {
        double priceDiscount = price - (price * percentage / 100);
        System.out.println("Harga setelah diskon: " + priceDiscount);
        return priceDiscount;
    }

    public double changePrice(double newPrice) {
        this.price = newPrice;
        System.out.println("===============AFTER UPDATE===============");
        System.out.println("Harga menu telah diubah menjadi: " + price);
        return price;
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu1 = new Menu("Espresso", 20000, "Beverage");
        Menu menu2 = new Menu("Croissant", 25000, "Food");
        Menu menu3 = new Menu("Matcha", 22000, "Beverage");
        Menu menu4 = new Menu("Sandwich", 30000, "Food");

        System.out.println("Pilih menu yang ingin ditampilkan (1-5):");
        System.out.println("1. Tampilkan semua item menu");
        System.out.println("2. Menampilkan Harga diskon pada item menu");
        System.out.println("3. Mengubah harga item menu");
        System.out.println("4. Menampilkan semua informasi item menu terbaru");
        System.out.println("5. Tampilkan jumlah menu yang terdaftar");

        System.out.print("Masukkan pilihan Anda: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                menu1.showMenu();
                menu2.showMenu();
                menu3.showMenu();
                menu4.showMenu();
                break;
            case 2:
                menu1.discount(10);
                menu2.discount(10);
                menu3.discount(10);
                menu4.discount(10);
                break;
            case 3:
                menu1.changePrice(25000);
                menu2.changePrice(30000);
                menu3.changePrice(25000);
                menu4.changePrice(35000);
                break;
            case 4:
                menu1.showMenu();
                menu2.showMenu();
                menu3.showMenu();
                menu4.showMenu();
                break;
            case 5:
                System.out.println("Jumlah menu yang terdaftar: " + Menu.totalMenu);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}