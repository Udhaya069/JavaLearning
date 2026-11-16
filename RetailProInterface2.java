interface StockOperations{
    void addStock(int quantity);
    void removeStock(int quantity);
    void checkStock();

    default void displaymessage() {
        System.out.println("Welcome to the stock management system.");
    }
  
}
class WarehouseStock implements StockOperations{
    private int stock =100 ;

    @Override
    public void addStock(int quantity) {
        stock += quantity;
        System.out.println(" Warehouse stock added: " + quantity + " items. Current stock: " + stock);
    }

    @Override
    public void removeStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            System.out.println(" Warehouse stock removed: " + quantity + " items. Current stock: " + stock);
        } else {
            System.out.println("Insufficient stock to remove " + quantity + " items.");
        }
    }

   @Override 
    public void checkStock() {
        System.out.println("Current stock: " + stock);
    }
   @Override 
    public void displaymessage() {
        System.out.println("Welcome to the warehouse stock management system.");
    }
}

class StoreStock implements StockOperations{
    private int stock =50;

    @Override
    public void addStock(int quantity) {
        stock += quantity;
        System.out.println(" Store stock added: " + quantity + " items. Current stock: " + stock);
    }

    @Override
    public void removeStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            System.out.println(" Store stock removed: " + quantity + " items. Current stock: " + stock);
        } else {
            System.out.println("Insufficient stock to remove " + quantity + " items.");
        }
    }

@Override 
    public void checkStock() {
        System.out.println("Current stock: " + stock);
    }
}

class ProcessStock{
   public  void processStock(StockOperations stock,int quantity) {
    stock.addStock(quantity);
    stock.checkStock();
   
}
    }
public class RetailProInterface2 {
    public static void main(String[] args) {
     ProcessStock processStock = new ProcessStock();
     StockOperations warehouseStock = new WarehouseStock();
     
     processStock.processStock(warehouseStock, 20);
     warehouseStock.displaymessage();
     StockOperations storeStock = new StoreStock();
     processStock.processStock(storeStock, 30);
     storeStock.displaymessage();


    // StockOperations warehouseStock = new WarehouseStock();
    // warehouseStock.addStock(20);
    // warehouseStock.removeStock(10);
    // warehouseStock.checkStock();
    // StockOperations storeStock = new StoreStock();
    // storeStock.addStock(30);
    // storeStock.removeStock(5);
    // storeStock.checkStock();
    
}}
