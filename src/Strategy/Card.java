package Strategy;

public class Card implements PaymentStrategy{
    @Override
    public void makePayment() {
        System.out.println("Payment made through Card");
    }
}
