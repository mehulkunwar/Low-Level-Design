package Observer;

public class ClientCode {
    public static void main(String[] args) {
        NotificationObserver mobile = new MobileObserver();
        NotificationObservable messageNotification = new MessageNotification();

        messageNotification.addObserver(mobile);
        messageNotification.notifyAllObserver();

    }
}
