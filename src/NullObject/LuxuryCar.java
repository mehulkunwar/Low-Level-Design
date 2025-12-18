package NullObject;

public class LuxuryCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("Luxury car started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Luxury car stopped");
    }
}
