public class CanteenDemo22 {
    public static void main(String[] args) {
        Item22 item1 = new Item22();
        item1.name = "Matcha Latte";
        item1.price = 15000;
        item1.stock = 10;
        item1.displayInfo();

        Item22 item2 = new Item22();
        item2.name = "Aglio olio";
        item2.price = 20000;
        item2.stock = 20;
        item2.displayInfo();

        Item22 item3 = new Item22();
        item3.name = "Ice Cream";
        item3.price = 10000;
        item3.stock = 25;
        item3.displayInfo();
        
    }
}