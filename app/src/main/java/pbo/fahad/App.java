package pbo.fahad;

    import java.util.Scanner;

    class menu {
        String name;
        double price;
        String category;
        static int totalMenu;

        public menu(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public void showMenu() {
            System.out.println("===============CAFE MENU===============");
            System.out.println("Nama menu:" + name);
            System.out.println("Harga menu:" + price);
            System.out.println("Kategori: " + category);
        }

        public double discount(double percentage) {
            double priceDiscount = price - (price * percentage / 100);
            System.out.println("Harga setelah diskon: " + priceDiscount);
            return priceDiscount;
        }

        public double changePrice(double newPrice) {
            this.price = newPrice;
            System.out.println("===============AFTER UPDATDE===============");
            System.out.println("Harga menu telah diubah menjadi: " + price);
            return price;
        }


public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    menu menu1 = new menu("Espresso", 20000, "Beverage");
    menu menu2 = new menu("Croissant", 25000, "Food");
    menu menu3 = new menu("Matcha", 22000, "Beverage");
    menu menu4 = new menu("Sandwich", 30000, "Food");

    System.out.print("Pilih menu yang ingin ditampilkan (1-2): ");
    System.out.print("1. Tampilkan semua item menu");
    System.out.print("2. Menampilkan Harga diskon pada item menu");
    System.out.print("3. Mengubah harga item menu");
    System.out.print("4. Menampilkan semua infromasi item menu terbaru");
    System.out.print("5. Tampilkan jumlah menu yang terdaftar");

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
            System.out.println("Jumlah menu yang terdaftar: " + menu.totalMenu);
            break;
        default:
            System.out.println("Pilihan tidak valid.");
    }
}
}


