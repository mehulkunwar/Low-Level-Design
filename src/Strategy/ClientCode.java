package Strategy;

public class ClientCode {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new UPIPayment());
        paymentContext.makePayment();
    }
}
