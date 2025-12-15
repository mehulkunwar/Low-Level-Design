package Factory;

public class Main {
    public static void main(String[] args) {
        Interface obj = FactoryClass.getInterfaceObject(InterfaceType.A);
        obj.operation();
    }
}
