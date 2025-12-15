package Observer;

public interface NotificationObservable {
    void addObserver(NotificationObserver notificationObserver);
    void removeObserver(NotificationObserver notificationObserver);
    void notifyAllObserver();
}
