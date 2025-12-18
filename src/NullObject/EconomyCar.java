package NullObject;

public class EconomyCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("Economy car started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Economy car stopped");
    }
}
