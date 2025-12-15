package Observer;

public class MobileObserver implements NotificationObserver{
    @Override
    public void update() {
        System.out.println("Mobile notified");
    }
}
