package Strategy;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void makePayment() {
        System.out.println("Payment made through UPI");
    }
}
