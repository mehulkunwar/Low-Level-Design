package Strategy;

public class NetBanking implements PaymentStrategy{
    @Override
    public void makePayment() {
        System.out.println("Payment made through Net Banking");

    }
}
