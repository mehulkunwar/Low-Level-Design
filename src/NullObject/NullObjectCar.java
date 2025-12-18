package NullObject;

public class NullObjectCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("Null car started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Null car stopped");
    }
}
