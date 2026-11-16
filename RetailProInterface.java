
interface Payment {
    void pay(double amount);
}
class upiPayment implements Payment{
    public void pay(double amount) {
        System.out.println("UPI payment of " + amount + " completed.");
    }

}
class cardPayment implements Payment{
    public void pay(double amount) {
        System.out.println("Card payment " + amount + " completed.");
    }

}
class cashPayment implements Payment{
    @Override 
    public void pay(double amount){ 
        System.out.println("Cash payment " + amount + " completed.");
    }

}

class Checkout{
    public void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }
}

public class RetailProInterface {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();

        Payment upi = new upiPayment();
        Payment card = new cardPayment();
        Payment cash = new cashPayment();

        checkout.processPayment(upi, 500.00);
        checkout.processPayment(card, 500.00);
        checkout.processPayment(cash, 500.00);
    }
    
}
