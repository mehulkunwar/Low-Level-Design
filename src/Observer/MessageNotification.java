package Observer;

import java.util.ArrayList;
import java.util.List;

public class MessageNotification implements NotificationObservable{
    List<NotificationObserver> observers;

    public MessageNotification() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(NotificationObserver notificationObserver) {
            observers.add(notificationObserver);
    }

    @Override
    public void removeObserver(NotificationObserver notificationObserver) {
        observers.remove(notificationObserver);
    }

    @Override
    public void notifyAllObserver() {
        System.out.println("Notifying all observers");
        sendNotification();
    }

    private void sendNotification() {
        for(NotificationObserver notificationObserver : observers){
            notificationObserver.update();
        }
    }
}
