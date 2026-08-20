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
        System.out.println("Name: " + name);
        System.out.println("Price: Rp" + (int)price);
        System.out.println("Category : " + category);
        System.out.println();
    }

    public double discount(double percentage) {
        double priceDiscount = price - (price * percentage / 100);
        System.out.println("Harga setelah diskon: Rp" + (int)priceDiscount);
        return priceDiscount;
    }

    public double changePrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Harga menu telah diubah menjadi: Rp" + (int)price);
        return price;
    }
}

class Order {
    String orderId;
    String customerName;
    Menu menu;
    int quantity;

    public Order(String orderId, String customerName, Menu menu, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.menu = menu;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return menu.price * quantity;
    }

    public void showOrder() {
        System.out.println("ID Pesanan: " + orderId);
        System.out.println("Nama Pelanggan: " + customerName);
        System.out.println("Menu Dipesan: " + menu.name);
        System.out.println("Jumlah:" + quantity);
        System.out.println("Total Bayar:" + (int)calculateTotal());

    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu1 = new Menu("Espresso", 20000, "Beverage");
        Menu menu2 = new Menu("Croissant", 25000, "Food");
        Menu menu3 = new Menu("Matcha", 22000, "Beverage");
        Menu menu4 = new Menu("Sandwich", 30000, "Food");

        Order orderKey = new Order("ORD-001", "Key", menu1, 2);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("1. Tampilkan semua item menu");
            System.out.println("2. Menampilkan Harga diskon pada item menu");
            System.out.println("3. Mengubah harga item menu");
            System.out.println("4. Menampilkan semua informasi item menu terbaru");
            System.out.println("5. Tampilkan jumlah menu yang terdaftar");
            System.out.println("6. Keluar");
            System.out.println("7. Tampilkan informasi pesanan");
            
            System.out.print("Masukkan pilihan Anda (1-7): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    menu1.showMenu();
                    menu2.showMenu();
                    menu3.showMenu();
                    menu4.showMenu();
                    break;
                case 2:
                    System.out.print(menu1.discount(10));
                    System.out.print(menu2.discount(10));
                    System.out.print(menu3.discount(10));
                    System.out.print(menu4.discount(10));
                    break;
                case 3:
                    System.out.print(menu1.changePrice(25000));
                    System.out.print(menu2.changePrice(28000));
                    System.out.print(menu3.changePrice(25000));
                    System.out.print(menu4.changePrice(35000));
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
                case 6:
                    System.out.println("Program selesai");
                    isRunning = false;
                    break;
                case 7:
                    orderKey.showOrder();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }
    }
}