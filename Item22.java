public class Item22 {
    public String name;
    public double price;
    public int stock;

    public Item22(){

    }

    public Item22(String itemName, double itemPrice, int itemStock){
        name = itemName;
        price = itemPrice;
        stock = itemStock;
    }

    public void displayInfo() {
        System.out.println("_______________________");
        System.out.println("Mak Cik Kantin Valina");
        System.out.println("Jual Barang Bekas");
        System.out.println("-----------------------");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
    
}